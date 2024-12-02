package td1138.bip.entities.rollingstock;

import ebf.tim.api.SkinRegistry;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import td1138.bip.TCBIP;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.rollingstock.ModelBR_MK3_Sleeper;
import td1138.bip.models.rollingstock.ModelBR_MK3_Sleeper;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

/**
 * <h1>Pullman's Palace entity</h1>
 * For more information on the overrides and functions:
 * @author Eternal Blue Flame
 */
public class EntityPassengerBRMK3Sleeper extends EntityRollingStock implements IPassenger {
    /*private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};*/


    public static final Item thisItem = new ItemRollingStock(new EntityPassengerBRMK3Sleeper(null), TCBIPInfo.modID, TCBIP.tabBIP);


    public EntityPassengerBRMK3Sleeper(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }
    public EntityPassengerBRMK3Sleeper(World world){
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
        return new float[]{2.65f, -2.45f};
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][] {{0.0f,0.05f,0.0f}};
    }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/BR_Mk3_Sleeper_Blue.png",new String[]{},
                "default", "");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/BR_Mk3_Sleeper_Brown.png",new String[]{},
                "Brown", "");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/BR_Mk3_Sleeper_Cyan.png",new String[]{},
                "Cyan", "");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/BR_Mk3_Sleeper_Green.png",new String[]{},
                "Green", "");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/BR_Mk3_Sleeper_Pink.png",new String[]{},
                "Pink", "");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/BR_Mk3_Sleeper_Red.png",new String[]{},
                "Red", "");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/BR_Mk3_Sleeper_White.png",new String[]{},
                "White", "");

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
                null,
                null,
                null,
                null,
                new ItemStack(ItemIDs.bogie.item, 2, 0),
                new ItemStack(ItemIDs.steelframe.item, 1, 0),
                null,
                new ItemStack(ItemIDs.seats.item, 2, 0),
                new ItemStack(itemSteel.getItem(), 1, itemSteel.getItemDamage()),
                new ItemStack(thisItem)};

    }

    @Override
    public String transportName() {
        return "BR MK3 Sleeper";
    }

    @Override
    public String transportcountry() {
        return "uk";
    }

    @Override
    public String transportYear() {
        return "1979";
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
    public int getTier(){
        return 2;
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
        return new float[]{0.55f,2.1f,1.0f};
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelBR_MK3_Sleeper()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
