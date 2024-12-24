package td1138.bip.entities.rollingstock;

import ebf.tim.api.SkinRegistry;
import fexcraft.tmt.slim.ModelBase;
import mods.railcraft.api.carts.IFluidCart;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import td1138.bip.TCBIP;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.rollingstock.ModelChurchward3500GalTender;
import train.common.api.Freight;
import train.common.api.Tender;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

/**
 * <h1>Pullman's Palace entity</h1>
 * For more information on the overrides and functions:
 * @author Eternal Blue Flame
 */
public class EntityTenderChurchward3500Gal extends Tender implements IInventory {
    /*private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};*/


    public static final Item thisItem = new ItemRollingStock(new EntityTenderChurchward3500Gal(null), TCBIPInfo.modID, TCBIP.tabBIP);


    public EntityTenderChurchward3500Gal(World world, double d, double d1, double d2) { super(world, d, d1, d2); }
    public EntityTenderChurchward3500Gal(World world){ super(world); }

    /**
     * <h1>Variable Overrides</h1>
     */
    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints() { return new float[]{1.65f, -1.65f}; }

    @Override
    public float[][] modelOffsets() { return new float[][] {{0.0f,0.0f,0.0f}}; }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Green.png",new String[]{},
                "default", "Churchward 3500 Gal Tender BR Lined Green Late Crest");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Black.png",new String[]{},
                "Black", "Churchward 3500 Gal Tender BR Black Late Crest");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Blue.png",new String[]{},
                "Blue", "Churchward 3500 Gal Tender BR Unlined Green Early Crest");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_LightBlue.png",new String[]{},
                "LightBlue", "Churchward 3500 Gal Tender BR Unlined Green Late Crest");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Lime.png",new String[]{},
                "Lime", "Churchward 3500 Gal Tender GWR Green post 1942");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Grey.png",new String[]{},
                "Grey", "Churchward 3500 Gal Tender BR Black Early Crest");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Magenta.png",new String[]{},
                "Magenta", "Churchward 3500 Gal Tender BR Lined Green Early Crest Weathered");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Orange.png",new String[]{},
                "Orange", "Churchward 3500 Gal Tender GWR Green post 1911");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Pink.png",new String[]{},
                "Pink", "Churchward 3500 Gal Tender BR Lined Green Late Crest High Sided");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Purple.png",new String[]{},
                "Purple", "Churchward 3500 Gal Tender BR Lined Green Late Crest Weathered");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_White.png",new String[]{},
                "White", "Churchward 3500 Gal Tender GWR Black post 1942");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Yellow.png",new String[]{},
                "Yellow", "Churchward 3500 Gal Tender BR Lined Green Early Crest");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_LightGrey.png",new String[]{},
                "LightGrey", "Churchward 3500 Gal Tender ROD Black");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Churchward_3500_Gal_Brown.png",new String[]{},
                "Brown", "Churchward 3500 Gal Tender ROD Khaki");
    }

    @Override
    public boolean isReinforced() { return false; }

    @Override
    public int[] getTankCapacity() { return new int[]{10000}; }

    @Override
    public float weightKg() { return 40000.0f; }

    @Override
    public ItemStack[] getRecipe() {
        ItemStack itemSteel = OreDictionary.getOres("ingotSteel").get(0);
        ItemStack itemRedstone = OreDictionary.getOres("dustRedstone").get(0);

        return new ItemStack[]{
                null,
                null,
                null,
                null,
                null,
                new ItemStack(ItemIDs.bogie.item, 2, 0),
                new ItemStack(ItemIDs.steelframe.item, 2, 0),
                null,
                null,
                new ItemStack(itemSteel.getItem(), 1, itemSteel.getItemDamage()),
                new ItemStack(thisItem)};

    }

    @Override
    public String transportName() { return "Churchward 3500 Gal Tender"; }

    @Override
    public String transportcountry() { return "uk"; }

    @Override
    public String transportYear() { return "1911"; }

    @Override
    public float transportTopSpeed() { return 0; }

    @Override
    public boolean isFictional() { return false; }

    @Override
    public float transportTractiveEffort() {return 0; }

    @Override
    public float transportMetricHorsePower() { return 0; }

    @Override
    public int getTier(){ return 3; }

    @Override
    public String[] additionalItemText() { return null; }

    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows(){ return 3;}/**
     * <h2>Rider offsets</h2>
     */

    @Override
    public int getSizeInventory() { return 3; }

    @Override
    public float[] getHitboxSize() { return new float[]{0.55f,2.1f,1.0f}; }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelChurchward3500GalTender()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }

}
