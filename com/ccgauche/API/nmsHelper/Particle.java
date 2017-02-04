package com.ccgauche.API.nmsHelper;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;

public class Particle {
	
	private long CoordX;
	private long CoordY;
	private long CoordZ;
	private int sizeX;
	private int sizeY;
	private int sizeZ;
	private int speed;
	private int NumberParticle;
	private EnumParticle pa;
	
	public Particle(EnumParticle pa,int coordX,int coordY,int coordZ,int sizeX,int sizeY,int sizeZ,int speed,int NumberParticle) {
		this.pa=pa;
		CoordX=coordX;
		CoordY=coordY;
		CoordZ=coordZ;
		this.sizeX=sizeX;
		this.sizeY=sizeY;
		this.sizeZ=sizeZ;
		this.speed=speed;
		this.NumberParticle=NumberParticle;
	}
	
	public void display(Player p) {
		PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(pa,true,CoordX,CoordY,CoordZ,sizeX,sizeY,sizeZ,speed,NumberParticle ,null);
		((CraftPlayer) p).getHandle().playerConnection.sendPacket(packet);
	}
	
	public long getCoordX() {return CoordX;}
	public void setCoordX(long coordX) {CoordX = coordX;}
	public long getCoordY() {return CoordY;}
	public void setCoordY(long coordY) {CoordY = coordY;}
	public long getCoordZ() {return CoordZ;}
	public void setCoordZ(long coordZ) {CoordZ = coordZ;}
	public EnumParticle getP() {return pa;}
	public void setP(EnumParticle p) {this.pa = p;}
	public int getNumberParticle() {return NumberParticle;}
	public void setNumberParticle(int numberParticle) {NumberParticle = numberParticle;}
	public int getSizeZ() {return sizeZ;}
	public void setSizeZ(int sizeZ) {this.sizeZ = sizeZ;}
	public int getSpeed() {return speed;}
	public void setSpeed(int speed) {this.speed = speed;}
	public int getSizeY() {return sizeY;}
	public void setSizeY(int sizeY) {this.sizeY = sizeY;}
	public int getSizeX() {return sizeX;}
	public void setSizeX(int sizeX) {this.sizeX = sizeX;}
	
}
