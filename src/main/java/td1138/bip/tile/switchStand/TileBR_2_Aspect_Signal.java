package td1138.bip.tile.switchStand;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;
import td1138.bip.api.blocks.TileSwitch;
import td1138.bip.blocks.TCBlocks;
import td1138.bip.blocks.blockSwitch.BlockBR_2_Aspect_Signal;
import train.common.api.blocks.BlockSwitch;

import java.util.Random;

public class TileBR_2_Aspect_Signal extends TileSwitch {

    public int state = 1;// 0=red 1=green
    private int updateTicks = 0;
    private static Random rand = new Random();

    public TileBR_2_Aspect_Signal(){
    }
    public TileBR_2_Aspect_Signal(BlockBR_2_Aspect_Signal block){
        host = block;
    }

    public void setState(int st){
        state = st;
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    public int getState(){
       return state;
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        state = tag.getInteger("state");
    }

    @Override
    public void updateEntity() {
        super.updateEntity();
        updateTicks++;

        /**
         * Remove any block on top of the wind mill
         */
        if (!worldObj.isRemote) {
            if (updateTicks % 20 == 0) {
                if (!this.worldObj.isAirBlock(this.xCoord, this.yCoord + 1, this.zCoord)) {
                    Block block = this.worldObj.getBlock(this.xCoord, this.yCoord + 1, this.zCoord);
                    if (block != null) {
                        EntityItem entityitem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, new ItemStack(Item.getItemFromBlock(TCBlocks.BR_2_Aspect_Signal), 1));
                        float f3 = 0.05F;
                        entityitem.motionX = (float) rand.nextGaussian() * f3;
                        entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float) rand.nextGaussian() * f3;
                        worldObj.spawnEntityInWorld(entityitem);
                    }
                    this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
                }
                syncTileEntity();
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return AxisAlignedBB.getBoundingBox(xCoord - 1, yCoord - 1, zCoord - 1, xCoord + 2, yCoord + 2, zCoord + 2);
    }
}
