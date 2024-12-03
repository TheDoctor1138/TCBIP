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
import td1138.bip.models.trains.ModelClass88;
import train.common.api.AbstractTrains;
import train.common.api.ElectricTrain;
import train.common.api.Locomotive;
import train.common.api.TrainSound;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

/**
 * <h1>C-Stock 0-8-0 entity</h1>
 * designed after the : C stock
 * This class is intended to serve as the primary example for API use.
 * @author TheDoctor1138
 */

public class EntityLocoElectricClass88 extends ElectricTrain {

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
     *     The last part defines the unlocalized name, this is used for the item name, entity name, and language file entries.
     */

    public static final Item thisItem = new ItemRollingStock(new EntityLocoElectricClass88(null), TCBIPInfo.modID, TCBIP.tabBIP);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see Locomotive
     */

    public EntityLocoElectricClass88(World world, double x, double y, double z){
        super(world,x,y,z);
    }
    public EntityLocoElectricClass88(World world){
        super(world);
    }

    @Override
    public String transportName(){return "BR Class 88";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "2015";}
    @Override
    public String transportFuelType(){return "Electric";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 0;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Class_88_Blue.png",new String[]{},
                "default", "DRS Plain Blue Panto Up");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Class_88_Cyan.png",new String[]{},
                "Cyan", "DRS Plain Blue Panto Down");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Class_88_Purple.png",new String[]{},
                "Purple", "DRS Blue Livery Panto Up");
        SkinRegistry.addSkin(this.getClass(),TCBIPInfo.modID, "textures/trains/Class_88_Magenta.png",new String[]{},
                "Magenta", "DRS Blue Livery Panto Down");
    }

    /**
     * <h1>Variable Overrides</h1>
     * We override the functions defined in the super here, to give them different values.
     * This is more efficient than having to store them in the super, or actual variables, because we won't have to store them in the NBT or RAM.
     */


    /**
     * <h2>Max speed</h2>
     * @return the value of the max speed in km/h
     */

    @Override
    public float transportTopSpeed(){return 161f;}

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
    public float[][] getRiderOffsets(){return new float[][]{{-2.15f,-0.3f, 0.0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{0.55f,2.1f,1f};
    }


    /**
     first value is back, 2nd value is front?
     *
     */


    @Override
    public float[] rotationPoints() {
        return new float[]{2.4f, -2.4f};
    }

    /**
     * <h2>Acceleration</h2>
     * <h4>TRAINS ONLY.</h4>
     * @return defines the acceleration.
     */

    @Override
    public float transportMetricHorsePower(){return 5400f;}

    @Override
    public String[] additionalItemText() {
        return null;
    }

    @Override
    public float weightKg(){return 86000f;}

    @Override
    public ItemStack[] getRecipe() {
        ItemStack itemSteel = OreDictionary.getOres("ingotSteel").get(0);
        ItemStack itemRedstone = OreDictionary.getOres("dustRedstone").get(0);

        return new ItemStack[]{
            new ItemStack(ItemIDs.controls.item, 2 ,0),
            new ItemStack(ItemIDs.bogie.item, 2, 0),
            new ItemStack(ItemIDs.steelframe.item, 1, 0),
            new ItemStack(itemSteel.getItem(), 1, itemSteel.getItemDamage()),
            null,
            new ItemStack(ItemIDs.steelcab.item, 1, 0),
            new ItemStack(ItemIDs.transformer.item, 2, 0),
            new ItemStack(ItemIDs.electmotor.item, 2, 0),
            new ItemStack(itemRedstone.getItem(), 4, 0),
            null,
            new ItemStack(thisItem)};

    }

    @Override
    public int getTier(){
        return 3;
    }
    @Override
    public float getPlayerScale(){
        return 0.65f;
    }


    @Override
    public float[][] modelOffsets() {
        return new float[][] {{0.0f,0.05f,0.0f}};
    }

    @Override
    public float[][] modelRotations() {
        return new float[][] {{180.0f,180.0f,0.0f}};
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
    public int[] getTankCapacity(){return new int[]{0};}


    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }


    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelClass88()};}

    /**defines the scale to render the model at. Default is 0.0625*/
    public float[][] getRenderScale(){
        return new float[][]{{1.0f, 1.0f, 1.0f}};
    }

    @SideOnly(Side.CLIENT)
    public int[] getParticleData(int id){
        if(id==1||id==2){
            return new int[]{0, 0, 0x232323};
        } else{
            return super.getParticleData(id);
        }
    }

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getHorn(){return new TrainSound("tcbip:Class88Horn",1f,0,0);}

    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getRunningSound(){

        return new TrainSound("tcbip:vl10_idle",0.7f,1,0);}

    @SideOnly(Side.CLIENT)
    @Override
    public TrainSound getIdleSound(){

        return new TrainSound("tcbip:vl10_idle",0.3f,1,0);}
}





