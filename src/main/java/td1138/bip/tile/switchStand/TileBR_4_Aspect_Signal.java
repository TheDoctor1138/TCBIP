package td1138.bip.tile.switchStand;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import td1138.bip.api.blocks.TileSwitch;
import td1138.bip.blocks.TCBlocks;
import td1138.bip.blocks.blockSwitch.BlockBR_2_Aspect_Signal;
import td1138.bip.blocks.blockSwitch.BlockBR_4_Aspect_Signal;

import java.util.Random;

public class TileBR_4_Aspect_Signal extends TileSwitch {

    public int skinstate = 0;// 0=green 1=yellow
    private int updateTicks = 0;
    private static Random rand = new Random();

    public TileBR_4_Aspect_Signal(){
    }
    public TileBR_4_Aspect_Signal(BlockBR_4_Aspect_Signal block){
        host = block;
    }
    public void setSkinstate(int skinstate) {
        this.skinstate = skinstate;
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);

    }

    public int getSkinstate() {
        return skinstate;
    }

    public void setState(int st){
        skinstate = st;
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    public int getState(){
        return skinstate;
    }

        public void increaseSkinState(){
            if (skinstate >= 4){
                skinstate = 0;
            } else {
                skinstate++;
            }
            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        skinstate = tag.getInteger("state");
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
                        EntityItem entityitem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, new ItemStack(Item.getItemFromBlock(TCBlocks.BR_4_Aspect_Signal), 1));
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
