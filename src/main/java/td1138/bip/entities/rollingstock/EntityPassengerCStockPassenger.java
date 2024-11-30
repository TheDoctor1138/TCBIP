package td1138.bip.entities.rollingstock;

import ebf.tim.api.SkinRegistry;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import td1138.bip.TCBIP;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.rollingstock.ModelCstockPassenger;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

import static ebf.tim.utility.CommonUtil.DefineStack;

/**
 * <h1>Pullman's Palace entity</h1>
 * For more information on the overrides and functions:
 * @author Eternal Blue Flame
 */
public class EntityPassengerCStockPassenger extends EntityRollingStock implements IPassenger {
    /*private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};*/


    public static final Item thisItem = new ItemRollingStock(new EntityPassengerCStockPassenger(null), TCBIPInfo.modID, TCBIP.tabBIP);


    public EntityPassengerCStockPassenger(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }
    public EntityPassengerCStockPassenger(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */
    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints() {
        return new float[]{1.3f, -1.3f};
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][] {{0.0f,0.18f,0.0f}};
    }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/C_stock_Blue.png",new String[]{},
                "default", "");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/C_stock_Grey.png",new String[]{},
                "Grey", "");
    }

    @Override
    public boolean isReinforced() {
        return false;
    }

    @Override
    public int[] getTankCapacity() {
        return null;
    }

    @Override
    public float weightKg() {
        return 20200.0f;
    }

    @Override
    public ItemStack[] getRecipe() {
        ItemStack itemSteel = OreDictionary.getOres("ingotSteel").get(0);
        ItemStack itemRedstone = OreDictionary.getOres("dustRedstone").get(0);

        return new ItemStack[]{
                null,
                new ItemStack(ItemIDs.bogie.item, 2, 0),
                new ItemStack(ItemIDs.steelframe.item, 1, 0),
                new ItemStack(itemSteel.getItem(), 1, itemSteel.getItemDamage()),
                null,
                new ItemStack(ItemIDs.steelcab.item, 1, 0),
                new ItemStack(ItemIDs.transformer.item, 2, 0),
                new ItemStack(itemRedstone.getItem(), 4, 0),
                null,
                new ItemStack(thisItem)};

    }

    @Override
    public String transportName() {
        return "London Underground C-Stock Passenger";
    }

    @Override
    public String transportcountry() {
        return "uk";
    }

    @Override
    public String transportYear() {
        return "1969";
    }

    @Override
    public float transportTopSpeed() {
        return 0;
    }

    @Override
    public boolean isFictional() {
        return false;
    }

    @Override
    public float transportTractiveEffort() {
        return 0;
    }

    @Override
    public float transportMetricHorsePower() {
        return 0;
    }

    @Override
    public String[] additionalItemText() {
        return null;
    }

    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows(){return 0;}/**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.6f,-0.5f, 0.40f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{1.5f,2.1f,1.0f};
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelCstockPassenger()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
