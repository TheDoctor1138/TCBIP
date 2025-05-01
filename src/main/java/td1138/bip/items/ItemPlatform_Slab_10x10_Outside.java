package td1138.bip.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;
import td1138.bip.TCBIP;
import td1138.bip.library.TCBIPInfo;

public class ItemPlatform_Slab_10x10_Outside extends ItemBlock {

    public ItemPlatform_Slab_10x10_Outside(Block id) {
        super(id);
        maxStackSize = 64;
        setCreativeTab(TCBIP.tabBIP);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(TCBIPInfo.modID + ":platform_slab");
    }


}
