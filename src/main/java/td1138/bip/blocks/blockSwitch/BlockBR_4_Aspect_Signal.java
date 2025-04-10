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
import train.common.Traincraft;
import train.common.api.blocks.BlockDynamic;
import train.common.api.blocks.BlockSignal;

import java.util.List;
import java.util.Random;

public class BlockBR_2_Aspect_Signal extends BlockSwitch {
    private IIcon texture;

    public BlockBR_2_Aspect_Signal() {
        super(Material.rock,0);
        setCreativeTab(TCBIP.tabBIP);
        //this.setTickRandomly(true);
        //this.setBlockBounds(0.5F , 0.0F, 0.5F , 0.5F ,  2.0F, 0.5F);
    }

    @Override
    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
    {
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
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
    public TileEntity createTileEntity(World world, int metadata) { return new TileBR_2_Aspect_Signal(); }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) { return new TileBR_2_Aspect_Signal(this); }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public void onBlockAdded(World world, int i, int j, int k) {
        super.onBlockAdded(world, i, j, k);
        TileBR_2_Aspect_Signal te = (TileBR_2_Aspect_Signal) world.getTileEntity(i, j, k);

        if (world.isBlockIndirectlyGettingPowered(i, j, k)) {

            te.state = 1;
        }
        /* int l = world.getBlockMetadata(i, j, k); if (l == 2) {
         *
         * te.rot = 2; } if (l == 5) {
         *
         * te.rot = 5; } if (l == 3) {
         *
         * te.rot = 3; } if (l == 4) { te.rot = 4; } */
        //System.out.println("added " + te.rot);
        updateTick(world, i, j, k);
    }


    @SideOnly(Side.CLIENT)
    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @Override
    public void randomDisplayTick(World world, int i, int j, int k, Random random) {
        updateTick(world, i, j, k, random);
    }


    public int tickRate() {
        return 4;
    }

    @Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
        super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
        if (!(world.getTileEntity(i, j, k) instanceof TileBR_2_Aspect_Signal)) {
            return;
        }
        TileBR_2_Aspect_Signal te = (TileBR_2_Aspect_Signal) world.getTileEntity(i, j, k);
        if (te != null) {
            int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
            world.markBlockForUpdate(i, j, k);
        }
    }


    @Override
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9) {
        updateTick(world, i, j, k);
        return true;
    }



    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        if ((p_149749_6_ & 8) > 0)
        {
            p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_, this);
            int i1 = p_149749_6_ & 7;

            if (i1 == 1)
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_ - 1, p_149749_3_, p_149749_4_, this);
            }
            else if (i1 == 2)
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_ + 1, p_149749_3_, p_149749_4_, this);
            }
            else if (i1 == 3)
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_ - 1, this);
            }
            else if (i1 == 4)
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_ + 1, this);
            }
            else if (i1 != 5 && i1 != 6)
            {
                if (i1 == 0 || i1 == 7)
                {
                    p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_ + 1, p_149749_4_, this);
                }
            }
            else
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_ - 1, p_149749_4_, this);
            }
        }

        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
    }

    @Override
    protected void dropBlockAsItem(World p_149642_1_, int p_149642_2_, int p_149642_3_, int p_149642_4_, ItemStack p_149642_5_) {
        super.dropBlockAsItem(p_149642_1_, p_149642_2_, p_149642_3_, p_149642_4_, p_149642_5_);
    }

    /*
    public int isProvidingWeakPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_)
    {
        return (p_149709_1_.getBlockMetadata(p_149709_2_, p_149709_3_, p_149709_4_) & 8) > 0 ? 15 : 0;
    }

    public int isProvidingStrongPower(IBlockAccess p_149748_1_, int p_149748_2_, int p_149748_3_, int p_149748_4_, int p_149748_5_)
    {
        int i1 = p_149748_1_.getBlockMetadata(p_149748_2_, p_149748_3_, p_149748_4_);

        if ((i1 & 8) == 0)
        {
            return 0;
        }
        else
        {
            int j1 = i1 & 7;
            return j1 == 0 && p_149748_5_ == 0 ? 15 : (j1 == 7 && p_149748_5_ == 0 ? 15 : (j1 == 6 && p_149748_5_ == 1 ? 15 : (j1 == 5 && p_149748_5_ == 1 ? 15 : (j1 == 4 && p_149748_5_ == 2 ? 15 : (j1 == 3 && p_149748_5_ == 3 ? 15 : (j1 == 2 && p_149748_5_ == 4 ? 15 : (j1 == 1 && p_149748_5_ == 5 ? 15 : 0)))))));
        }
    }

     */

    @Override
    public void onNeighborBlockChange(World world, int i, int j, int k, Block l) {

        TileBR_2_Aspect_Signal te = (TileBR_2_Aspect_Signal) world.getTileEntity(i, j, k);
        if (te == null)
            return;
        if (te.getState() == 1 && !world.isBlockIndirectlyGettingPowered(i, j, k)) {
            te.setState(0);
        }
        if (te.getState() == 0 && world.isBlockIndirectlyGettingPowered(i, j, k)) {
            te.setState(1);
        }
        world.markBlockForUpdate(i, j, k);
    }

    public void updateTick(World world, int i, int j, int k) {

        TileBR_2_Aspect_Signal te = (TileBR_2_Aspect_Signal) world.getTileEntity(i, j, k);
        if (te == null)
            return;
        //te.rot = l;
        // int l = world.getBlockMetadata(i, j, k);
        if (te.state == 1 && !world.isBlockIndirectlyGettingPowered(i, j, k)) {
            te.state = 0;
        }
        if (te.state == 0 && world.isBlockIndirectlyGettingPowered(i, j, k)) {
            te.state = 1;
        }
    }


    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    
}

