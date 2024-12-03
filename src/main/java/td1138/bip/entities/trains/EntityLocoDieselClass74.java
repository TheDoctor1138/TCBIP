package td1138.bip.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import td1138.bip.TCBIP;
import td1138.bip.library.TCBIPInfo;
import td1138.bip.models.trains.ModelClass74;
import train.common.api.AbstractTrains;
import train.common.api.DieselTrain;
import train.common.api.Locomotive;
import train.common.api.TrainSound;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

import java.util.ArrayList;
import java.util.UUID;

/**
 * <h1>Brigadelok 0-8-0 entity</h1>
 * designed after the : Henschel No.15968
 * This class is intended to serve as the primary example for API use.
 * @author Eternal Blue Flame
 */
public class EntityLocoDieselClass74 extends DieselTrain {
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
     *     @see #EntityLocoDieselClass74(World, double, double, double)
     *     The last part defines the unlocalized name, this is used for the item name, entity name, and language file entries.
     */


    public static final Item thisItem = new ItemRollingStock(new EntityLocoDieselClass74(null), TCBIPInfo.modID, TCBIP.tabBIP);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see Locomotive
     */
    public EntityLocoDieselClass74(World world, double x, double y, double z){
        super(world,x,y,z);
    }
    public EntityLocoDieselClass74(World world){
        super(world);
    }

    @Override
    public String transportName(){return "BR Class 74";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1958";}
    @Override
    public String transportFuelType(){return "Diesel";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 0;}

    @Override
    public void registerSkins(){
        //make base TransportSkin and register
        //TransportSkin s ;



        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_74_Blue.png", new String[]{} ,"default", "Class 74 in BR Blue livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_74_Grey.png", new String[]{}, "Grey", "Class 74 in BR Blue livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_74_LightBlue.png", new String[]{}, "Light Blue", "Class 74 in BR Blue livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_74_Yellow.png", new String[]{}, "Yellow", "Class 74 in BR Blue livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_74_Black.png", new String[]{}, "Black", "Class 74 in BR Blue livery.");
        SkinRegistry.addSkin(this.getClass(), TCBIPInfo.modID,"textures/trains/Class_74_Green.png", new String[]{}, "Green", "Class 74 in BR Blue livery.");


        /*
        //add recolor so current, and register new TransportSkin
        s = new TransportSkin(TiMSquared.MODID,"textures/train/brigadelok_080.png", "red",
                "A fictional TransportSkin created for testing the recolor system,\n and the paint bucket TransportSkin selector. \n Might keep it long run\nto pay homage to the development of the mod.")
        .setRecolorsFrom(0x68939E).setRecolorsTo(0xcc0000);
        SkinRegistry.addSkin(this.getClass(),s);

        //remove recolors, then set new name and texture
        s= new TransportSkin(TiMSquared.MODID, "textures/hd/train/brigadelok_080.png", "hd",
                "Used by Germany in WWI\nas a transport for solders and equipment\nthis incomplete HD TransportSkin was done by LunarTales");
        SkinRegistry.addSkin(this.getClass(),s);*/
    }

    @Override
    public String getDefaultSkin(){
        return "tcbip:default";
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
    public float transportTopSpeed(){return 145f;}
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
    public float[][] getRiderOffsets(){ return new float[][]{{1.6f,-0.2f,0.3f}};}

    @Override
    public float getPlayerScale(){
        return 0.6f;
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{3.6f,2.1f,1.3f};
    }

    /**
     * <h2>Acceleration</h2>
     * <h4>TRAINS ONLY.</h4>
     * @return defines the acceleration.
     */
    @Override
    public float transportMetricHorsePower(){return 650f;}

    @Override
    public String[] additionalItemText() {
        return new String[]{"Testing entity for Diesel trains"};
    }

    @Override
    public float weightKg(){return 78000f;}

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
        return 2;
    }

    @Override
    public float[] rotationPoints() {
        return new float[]{1.5f, -1.5f};
    }

    @Override
    public float[][] modelOffsets() {
       return new float[][] {{0.0f,0.18f,0.0f}};
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
    public ModelBase[] getModel(){return new ModelBase[]{new ModelClass74()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getHorn(){return new TrainSound("tcbip:eu07_horn",1f,1,0);}
    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getRunningSound(){return new TrainSound("tcbip:chme3_idle",0.7f,1,0);}
    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getIdleSound(){return new TrainSound("tcbip:chme3_idle",0.3f,1,0);}
}
