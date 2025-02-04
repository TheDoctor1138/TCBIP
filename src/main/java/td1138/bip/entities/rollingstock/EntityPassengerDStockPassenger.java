package td1138.bip.entities.rollingstock;

import ebf.tim.api.SkinRegistry;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import td1138.bip.TCBIP;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.rollingstock.ModelDstockPassenger;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

/**
 * <h1>Pullman's Palace entity</h1>
 * For more information on the overrides and functions:
 * @author Eternal Blue Flame
 */
public class EntityPassengerDStockPassenger extends EntityRollingStock implements IPassenger {
    /*private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};*/


    public static final Item thisItem = new ItemRollingStock(new EntityPassengerDStockPassenger(null), TCBIPInfo.modID, TCBIP.tabBIP);


    public EntityPassengerDStockPassenger(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }
    public EntityPassengerDStockPassenger(World world){
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
        return new float[]{1.58f, -1.61f};
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][] {{0.0f,0.18f,0.0f}};
    }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/D_Stock_Passenger_Blue.png",new String[]{},
                "default", "London Underground Modern Livery");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/D_Stock_Passenger_Grey.png",new String[]{},
                "Grey", "Fictional Idk Livery Ask Kranker");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/D_Stock_Passenger_Orange.png",new String[]{},
                "Orange", "Metropolis Underground (Fictional)");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/D_Stock_Passenger_Red.png",new String[]{},
                "Red", "London Underground Old Grey Livery");
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
        return "London Underground D-Stock Passenger";
    }

    @Override
    public String transportcountry() {
        return "uk";
    }

    @Override
    public String transportYear() {
        return "1978";
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
    public float[][] getRiderOffsets(){return new float[][]{{0f,-0.3f, 0.0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{1.5f,2.1f,1.0f};
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelDstockPassenger()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
