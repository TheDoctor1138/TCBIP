package td1138.bip.blocks.blockSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import td1138.bip.TCBIP;
import td1138.bip.api.blocks.BlockSwitch;
import td1138.bip.library.BlockIDs;
import td1138.bip.tile.switchStand.TileBR_2_Aspect_Signal;
import td1138.bip.tile.switchStand.TileBR_3_Aspect_Signal;
import train.common.Traincraft;
import train.common.api.blocks.BlockDynamic;
import train.common.api.blocks.BlockSignal;

import java.util.List;
import java.util.Random;

public class BlockBR_2_Aspect_Signal extends BlockDynamic {
    private IIcon texture;

    public BlockBR_2_Aspect_Signal() {
        super(Material.iron, 0);
        this.setTickRandomly(true);
        setBlockBounds(0.2F,0.0F,0.2F,0.8F,1F,0.8F);
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
    {
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
        super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
        TileBR_2_Aspect_Signal te = (TileBR_2_Aspect_Signal) world.getTileEntity(i, j, k);
        if (te != null) {
            int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
            te.setSkinstate(0);
            world.markBlockForUpdate(i, j, k);


        }
    }

    @Override
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        TileBR_2_Aspect_Signal te = (TileBR_2_Aspect_Signal) p_149727_1_.getTileEntity(p_149727_2_, p_149727_3_, p_149727_4_);
        te.increaseSkinState();
        p_149727_1_.markBlockForUpdate(p_149727_2_, p_149727_3_, p_149727_4_);


        return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) { return new TileBR_2_Aspect_Signal();
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) { return new TileBR_2_Aspect_Signal();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
        if(p_149749_1_.getTileEntity(p_149749_2_,p_149749_3_,p_149749_4_)!=null){
            p_149749_1_.removeTileEntity(p_149749_2_, p_149749_3_, p_149749_4_);
        }
    }

    @Override
    public IIcon getIcon(int i, int j) {
        return texture;
    }
}

