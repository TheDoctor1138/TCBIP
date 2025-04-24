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
import td1138.bip.blocks.BlockBR_Modern_Buffer;
import td1138.bip.blocks.blockSwitch.BlockBR_2_Aspect_Signal;
import train.common.api.blocks.TileRenderFacing;

public class TileBR_Modern_Buffer extends TileRenderFacing {

	public TileBR_Modern_Buffer() {
		//facingMeta = this.getBlockMetadata(); // Changed from this.blockMetadata to the method call to avoid receiving invalid Metadata.
	}
	
	public  TileBR_Modern_Buffer(int meta){
		
		this.facing = meta;
	}

	public TileRenderFacing setDiagonalFacing(int dir){
		facing = dir;
		this.markDirty();
		return this;
	}

	public int getDiagonalfacing(){
		return facing;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {

		super.readFromNBT(nbtTag);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {

		super.writeToNBT(nbtTag);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
		this.readFromNBT(pkt.func_148857_g());
		super.onDataPacket(net, pkt);
	}
}