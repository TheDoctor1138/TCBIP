//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.train.common.entity.rollingstock.locomotive;

import com.example.train.common.TC4Addon;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;

public class EntityLocoElectricNMBS_HLE_18 extends ElectricTrain {
    public EntityLocoElectricNMBS_HLE_18(World world) {
        super(world);
    }

    public EntityLocoElectricNMBS_HLE_18(World world, double d, double d1, double d2) {
        this(world);
        this.setPosition(d, d1 + (double)this.yOffset, d2);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = d;
        this.prevPosY = d1;
        this.prevPosZ = d2;
    }

    public void updateRiderPosition() {
        if (this.riddenByEntity != null) {
            double pitchRads = (double)this.anglePitchClient * Math.PI / 180.0;
            double distance = 3.9;
            double yOffset = -0.05;
            float rotationCos1 = (float)Math.cos(Math.toRadians((double)(this.renderYaw + 90.0F)));
            float rotationSin1 = (float)Math.sin(Math.toRadians((double)(this.renderYaw + 90.0F)));
            if (this.side.isServer()) {
                rotationCos1 = (float)Math.cos(Math.toRadians((double)(this.serverRealRotation + 90.0F)));
                rotationSin1 = (float)Math.sin(Math.toRadians((double)(this.serverRealRotation + 90.0F)));
                this.anglePitchClient = this.serverRealPitch * 60.0F;
            }

            float pitch = (float)(this.posY + Math.tan(pitchRads) * distance + this.getMountedYOffset() + this.riddenByEntity.getYOffset() + yOffset);
            float pitch1 = (float)(this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset() + yOffset);
            double bogieX1 = this.posX + (double)rotationCos1 * distance;
            double bogieZ1 = this.posZ + (double)rotationSin1 * distance;
            if (this.anglePitchClient > 20.0F && rotationCos1 == 1.0F) {
                bogieX1 -= pitchRads * 2.0;
                pitch = (float)((double)pitch - pitchRads * 1.2);
            }

            if (this.anglePitchClient > 20.0F && rotationSin1 == 1.0F) {
                bogieZ1 -= pitchRads * 2.0 + 1.0;
                pitch = (float)((double)pitch - pitchRads * 1.2);
            }

            if (pitchRads == 0.0) {
                this.riddenByEntity.setPosition(bogieX1, (double)pitch1, bogieZ1);
            }

            if (pitchRads > -1.01 && pitchRads < 1.01) {
                this.riddenByEntity.setPosition(bogieX1, (double)pitch, bogieZ1);
            }

        }
    }

    public void setDead() {
        super.setDead();
        this.isDead = true;
    }

    public void pressKey(int i) {
        if (i == 7 && this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer)this.riddenByEntity).openGui(TC4Addon.instance, 79, this.worldObj, (int)this.posX + 2, (int)this.posY, (int)this.posZ);
        }

    }

    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);
        nbttagcompound.setShort("fuelTrain", (short)this.fuelTrain);
        NBTTagList nbttaglist = new NBTTagList();

        for(int i = 0; i < this.locoInvent.length; ++i) {
            if (this.locoInvent[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.locoInvent[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        nbttagcompound.setTag("Items", nbttaglist);
    }

    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);
        this.fuelTrain = nbttagcompound.getShort("fuelTrain");
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", 10);
        this.locoInvent = new ItemStack[this.getSizeInventory()];

        for(int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 255;
            if (j >= 0 && j < this.locoInvent.length) {
                this.locoInvent[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

    }

    public int getSizeInventory() {
        return this.inventorySize;
    }

    public String getInventoryName() {
        return "HLE 18";
    }

    public boolean interactFirst(EntityPlayer entityplayer) {
        this.playerEntity = entityplayer;
        if (super.interactFirst(entityplayer)) {
            return false;
        } else {
            if (!this.worldObj.isRemote) {
                if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != entityplayer) {
                    return true;
                }

                entityplayer.mountEntity(this);
            }

            return true;
        }
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.2F;
    }

    public boolean canBeAdjusted(EntityMinecart cart) {
        return this.canBeAdjusted;
    }

    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }
}
