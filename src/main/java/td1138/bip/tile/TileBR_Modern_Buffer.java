/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package td1138.bip.tile;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileBR_Modern_Buffer extends TileEntity {

	private int facingMeta;

	public TileBR_Modern_Buffer() {
		//facingMeta = this.getBlockMetadata(); // Changed from this.blockMetadata to the method call to avoid receiving invalid Metadata.
	}
	
	public  TileBR_Modern_Buffer(int meta){
		
		this.facingMeta = meta;
	}

	public Entity getFacing() { return null; }

	public void setFacing(int facing) {
		this.facingMeta = facing;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {

		super.readFromNBT(nbtTag);

		facingMeta = nbtTag.getByte("Orientation");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {

		super.writeToNBT(nbtTag);

		nbtTag.setByte("Orientation", (byte) facingMeta);
	}

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
		this.readFromNBT(pkt.func_148857_g());
		super.onDataPacket(net, pkt);
	}
}