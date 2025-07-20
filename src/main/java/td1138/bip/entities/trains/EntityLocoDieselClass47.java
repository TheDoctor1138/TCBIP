package td1138.bip.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.api.SkinRegistry;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import td1138.bip.TCBIP;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.trains.ModelClass47;
import td1138.bip.models.trains.ModelClass68;
import train.common.api.AbstractTrains;
import train.common.api.DieselTrain;
import train.common.api.Locomotive;
import train.common.api.TrainSound;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

/**
 * <h1>Brigadelok 0-8-0 entity</h1>
 * designed after the : Henschel No.15968
 * This class is intended to serve as the primary example for API use.
 * @author Eternal Blue Flame
 */
public class EntityLocoDieselClass47 extends DieselTrain {
    /**
     * <h2>Basic Train Constructor</h2>
     * To make your own custom train or rollingstock, create a new class that is a copy of the train or rollingstockShapeBox that is closest to what you are adding,
     *     in that copy, you will need to go through the variables and overrides and change them to match the class/transport.
     * lastly you have to register the class in
     * @see train.common.library.TraincraftRegistry#registerTransports(String, AbstractTrains[])
     *
     * The fluid tank has 2 values, one for water/RF/fuel/uranium and another for steam, the second one is ONLY used with steam and nuclear steam trains.
     *     The first part is how much fluid it can store, a bucket is worth 1000.
     *     The second part is the fluid filter, this is the list of fluids to either use specifically, or never use.
     *     The third part is the blacklist/whitelist. True means it will ONLY use the fluids defined in the array, false means it will use any fluids EXCEPT the ones in the array.
     *
     *
     * thisItem is the item for this train that will get registered.
     *     The String array defines the extra text added to the item description, each entry makes a new line
     *     The second variable is the class constructor, they are defined from top to bottom in order they are written, and the one used for this function must ALWAYS be the one that is like this
     *     @see #EntityLocoDieselClass47(World) (World, double, double, double)
     *     The last part defines the unlocalized name, this is used for the item name, entity name, and language file entries.
     */


    public static final Item thisItem = new ItemRollingStock(new EntityLocoDieselClass47(null), TCBIPInfo.modID, TCBIP.tabBIP);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see Locomotive
     */
    public EntityLocoDieselClass47(World world, double x, double y, double z){
        super(world, x, y, z);
    }
    public EntityLocoDieselClass47(World world){
        super(world);
    }

    @Override
    public String transportName(){return "BR Class 47";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1962";}
    @Override
    public String transportFuelType(){return "Diesel";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 0;}
    @Override
    public String getInventoryName() {
        return "BR Class 47";
    }

    @Override
    public void registerSkins(){
        //make base TransportSkin and register
        //TransportSkin s ;

        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Blue.png", new String[]{} ,"default", "Class 47 in BR Blue livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_White.png", new String[]{} ,"White", "Class 47 in Intercity Swallow livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Yellow.png", new String[]{} ,"Yellow", "Class 47 in ScotRail livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Black.png", new String[]{}, "Black", "Class 47 in BR Parcels livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Brown.png", new String[]{}, "Brown", "Class 47 in EWS livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Green.png", new String[]{}, "Green", "Class 47 in BR Two-Tone Green livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Cyan.png", new String[]{}, "Cyan", "Class 47 in Royal livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Pink.png", new String[]{} ,"Pink", "Class 47 in Waterman Railways livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Grey.png", new String[]{}, "Grey", "Class 47 in Freightliner Grey livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_LightBlue.png", new String[]{}, "Light Blue", "Class 47 in ONE livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_LightGrey.png", new String[]{}, "Light Grey", "Class 47 in Network SouthEast livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Magenta.png", new String[]{}, "Magenta", "Class 47 in Rail Express Systems livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Orange.png", new String[]{} ,"Orange", "Class 47 in BR Large Logo livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Purple.png", new String[]{}, "Purple", "Class 47 in West Coast Railways livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Red.png", new String[]{}, "Red", "Class 47 in Virgin Cross Country livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Lime.png", new String[]{}, "Lime", "Class 57 in Arriva Trains Wales livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Skin17.png", new String[]{}, "Skin17", "Class 57 in Virgin West Coast livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Skin18.png", new String[]{}, "Skin18", "Class 57 in Step Valley livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_47_Skin19.png", new String[]{}, "Skin19", "Class 47 in Regional Railways livery.");
    }

    @Override
    public String getDefaultSkin(){
        return "default";
    }
    /*
     * <h1>Variable Overrides</h1>
     * We override the functions defined in the super here, to give them different values.
     * This is more efficient than having to store them in the super, or actual variables, because we won't have to store them in the NBT or RAM.
     */


    /**
     * <h2>Max speed</h2>
     * @return the value of the max speed in km/h
     */
    @Override
    public float transportTopSpeed(){return 154f;}
    //backwardPressed?70f://

    /**
     * <h2>Inventory Size</h2>
     * @return the size of the inventory not counting any fuel or crafting slots, those are defined by the type.
     */
    @Override
    public int getInventoryRows(){return 0;}

    /**
     * <h2>Rider offset</h2>
     * @return defines the offsets of the riders in blocks, the first value is how far back, and the second is how high.
     *     Negative values are towards the front, ground, or right. In that order.
     *     Each set of floats represents a different rider.
     *     Only the first 3 values of each set of floats are actually used.
     */
    @Override
    public float[][] getRiderOffsets(){ return new float[][]{{2.2f,0.2f, -0.25f}};}

    @Override
    public float getPlayerScale(){
        return 0.65f;
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.55f,2.1f,1.0f};
    }

    /**
     * <h2>Acceleration</h2>
     * <h4>TRAINS ONLY.</h4>
     * @return defines the acceleration.
     */
    @Override
    public float transportMetricHorsePower(){return 2580f;}

    @Override
    public String[] additionalItemText() {
        return new String[]{"Spoon"};
    }

    @Override
    public float weightKg(){return 112000f;}

    @Override
    public ItemStack[] getRecipe() {
        ItemStack dyeBlue = OreDictionary.getOres("dyeBlue").get(0);
        return new ItemStack[] {
                new ItemStack(ItemIDs.controls.getItem(), 2),
                new ItemStack(ItemIDs.bogie.getItem(), 4),
                new ItemStack(ItemIDs.steelframe.getItem(), 3),
                null,
                null,
                new ItemStack(ItemIDs.steelcab.getItem(), 2),
                new ItemStack(ItemIDs.dieselengine.getItem(), 1),
                new ItemStack(ItemIDs.electmotor.getItem(), 2),
                new ItemStack(ItemIDs.transformer.getItem(), 2),
                new ItemStack(dyeBlue.getItem(), 1, dyeBlue.getItemDamage()),
                new ItemStack(thisItem)

        };
    }
    @Override
    public int getTier(){
        return 3;
    }

    @Override
    public float[] rotationPoints() {
        return new float[]{2.4f, -2.4f};
    }

    @Override
    public float[][] modelOffsets() {
       return new float[][] {{-1.95f,0.1f,0.0f}};
    }

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    /**
     * <h2>reinforced transport</h2>
     * this returns if this specific entity is reinforced (explosion proof and damage resistant).
     * since this is a function it can be conditional as well, for instance if it has a specific skin.
     */
    @Override
    public boolean isReinforced(){return false;}

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    @Override
    public int[] getTankCapacity(){return new int[]{13000};}

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }


    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelClass47()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getHorn(){return new TrainSound("tcbip:Class47Horn",0.8f,1,0);}
    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getRunningSound(){return new TrainSound("tcbip:chme3_idle",0.7f,1,1);}
    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getIdleSound(){return new TrainSound("tcbip:chme3_idle",0.3f,1,0);}
}
