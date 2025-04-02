package td1138.bip.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;
import train.common.Traincraft;
import train.common.items.ItemSignal;
import train.common.library.Info;

public class ItemBR_2_Aspect_Signal extends ItemBlock {

    public ItemBR_2_Aspect_Signal(Block id) {
        super(id);
        maxStackSize = 64;
        setCreativeTab(Traincraft.tcTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":paintbrushThing");
    }


}
