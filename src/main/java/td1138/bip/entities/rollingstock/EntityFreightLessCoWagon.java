package td1138.bip.entities.rollingstock;

import ebf.tim.api.SkinRegistry;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import td1138.bip.TCBIP;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.rollingstock.ModelLessCoWagon;
import train.common.api.Freight;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

/**
 * <h1>Pullman's Palace entity</h1>
 * For more information on the overrides and functions:
 * @author Eternal Blue Flame
 */
public class EntityFreightLessCoWagon extends Freight implements IInventory {
    /*private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};*/


    public static final Item thisItem = new ItemRollingStock(new EntityFreightLessCoWagon(null), TCBIPInfo.modID, TCBIP.tabBIP);


    public EntityFreightLessCoWagon(World world, double d, double d1, double d2) { super(world, d, d1, d2); }
    public EntityFreightLessCoWagon(World world){ super(world); }

    /**
     * <h1>Variable Overrides</h1>
     */
    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints() { return new float[]{2.15f, -2.15f}; }

    @Override
    public float[][] modelOffsets() { return new float[][] {{0.0f,0.05f,0.0f}}; }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Less_Co2_Blue.png",new String[]{},
                "default", "Less Co2 Blue Low 45ft");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Less_Co2_Cyan.png",new String[]{},
                "Cyan", "Less Co2 Blue High 45ft");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Less_Co2_Grey.png",new String[]{},
                "Grey", "Tesco Blue Low 45ft");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Less_Co2_LightBlue.png",new String[]{},
                "LightBlue", "CobelFret Blue High 45ft");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Less_Co2_Red.png",new String[]{},
                "Red", "CAI Red High 45ft");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Less_Co2_Yellow.png",new String[]{},
                "Yellow", "Russel Blue High 45ft");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Less_Co2_Brown.png",new String[]{},
                "Brown", "Empty Wagon");
    }

    @Override
    public boolean isReinforced() { return false; }

    @Override
    public int[] getTankCapacity() { return null; }

    @Override
    public float weightKg() { return 16000.0f; }

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
    public String transportName() { return "Less Co Wagon"; }

    @Override
    public String transportcountry() { return "uk"; }

    @Override
    public String transportYear() { return "2006"; }

    @Override
    public float transportTopSpeed() { return 0; }

    @Override
    public boolean isFictional() { return false; }

    @Override
    public float transportTractiveEffort() {return 0; }

    @Override
    public float transportMetricHorsePower() { return 0; }

    @Override
    public int getTier(){ return 2; }

    @Override
    public String[] additionalItemText() { return null; }

    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows(){ return 5;}/**
     * <h2>Rider offsets</h2>
     */

    @Override
    public float[] getHitboxSize() { return new float[]{4.95f,2.1f,1.0f}; }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelLessCoWagon()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }

}
