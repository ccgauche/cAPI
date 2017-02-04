package com.ccgauche.API.item;

import org.bukkit.Material;

public enum ItemType {
	
	//STONE
	
	ANDESITE(Material.STONE,(byte)5),
	DIORITE(Material.STONE,(byte)3),
	GRANITE(Material.STONE,(byte)1),
	POLISHED_ANDESITE(Material.STONE,(byte)6),
	POLISHED_DIORITE(Material.STONE,(byte)4),
	POLISHED_GRANITE(Material.STONE,(byte)2),
	
	//GLASS PANE
	
	WHITE_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)0),
	ORANGE_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)1),
	MAGENTA_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)2),
	LIGHT_BLUE_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)3),
	YELLOW_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)4),
	LIME_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)5),
	PINK_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)6),
	GRAY_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)7),
	LIGHT_GREY_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)8),
	CYAN_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)9),
	PURPLE_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)10),
	BLUE_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)11),
	BROWN_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)12),
	GREEN_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)13),
	RED_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)14),
	BLACK_GLASS_PANE(Material.STAINED_GLASS_PANE,(byte)15),
	
	//GLASS
	
	WHITE_GLASS(Material.STAINED_GLASS,(byte)0),
	ORANGE_GLASS(Material.STAINED_GLASS,(byte)1),
	MAGENTA_GLASS(Material.STAINED_GLASS,(byte)2),
	LIGHT_BLUE_GLASS(Material.STAINED_GLASS,(byte)3),
	YELLOW_GLASS(Material.STAINED_GLASS,(byte)4),
	LIME_GLASS(Material.STAINED_GLASS,(byte)5),
	PINK_GLASS(Material.STAINED_GLASS,(byte)6),
	GRAY_GLASS(Material.STAINED_GLASS,(byte)7),
	LIGHT_GREY_GLASS(Material.STAINED_GLASS,(byte)8),
	CYAN_GLASS(Material.STAINED_GLASS,(byte)9),
	PURPLE_GLASS(Material.STAINED_GLASS,(byte)10),
	BLUE_GLASS(Material.STAINED_GLASS,(byte)11),
	BROWN_GLASS(Material.STAINED_GLASS,(byte)12),
	GREEN_GLASS(Material.STAINED_GLASS,(byte)13),
	RED_GLASS(Material.STAINED_GLASS,(byte)14),
	BLACK_GLASS(Material.STAINED_GLASS,(byte)15),
	
	//WOOL
	
	WHITE_WOOL(Material.WOOL,(byte)0),
	ORANGE_WOOL(Material.WOOL,(byte)1),
	MAGENTA_WOOL(Material.WOOL,(byte)2),
	LIGHT_BLUE_WOOL(Material.WOOL,(byte)3),
	YELLOW_WOOL(Material.WOOL,(byte)4),
	LIME_WOOL(Material.WOOL,(byte)5),
	PINK_WOOL(Material.WOOL,(byte)6),
	GRAY_WOOL(Material.WOOL,(byte)7),
	LIGHT_GREY_WOOL(Material.WOOL,(byte)8),
	CYAN_WOOL(Material.WOOL,(byte)9),
	PURPLE_WOOL(Material.WOOL,(byte)10),
	BLUE_WOOL(Material.WOOL,(byte)11),
	BROWN_WOOL(Material.WOOL,(byte)12),
	GREEN_WOOL(Material.WOOL,(byte)13),
	RED_WOOL(Material.WOOL,(byte)14),
	BLACK_WOOL(Material.WOOL,(byte)15),
	
	//CARPET
	
	WHITE_CARPET(Material.STAINED_CLAY,(byte)0),
	ORANGE_CARPET(Material.STAINED_CLAY,(byte)1),
	MAGENTA_CARPET(Material.STAINED_CLAY,(byte)2),
	LIGHT_BLUE_CARPET(Material.STAINED_CLAY,(byte)3),
	YELLOW_CARPET(Material.STAINED_CLAY,(byte)4),
	LIME_CARPET(Material.STAINED_CLAY,(byte)5),
	PINK_CARPET(Material.STAINED_CLAY,(byte)6),
	GRAY_CARPET(Material.STAINED_CLAY,(byte)7),
	LIGHT_GREY_CARPET(Material.STAINED_CLAY,(byte)8),
	CYAN_CARPET(Material.STAINED_CLAY,(byte)9),
	PURPLE_CARPET(Material.STAINED_CLAY,(byte)10),
	BLUE_CARPET(Material.STAINED_CLAY,(byte)11),
	BROWN_CARPET(Material.STAINED_CLAY,(byte)12),
	GREEN_CARPET(Material.STAINED_CLAY,(byte)13),
	RED_CARPET(Material.STAINED_CLAY,(byte)14),
	BLACK_CARPET(Material.STAINED_CLAY,(byte)15),
	
	//CLAY
	
	WHITE_CLAY(Material.STAINED_CLAY,(byte)0),
	ORANGE_CLAY(Material.STAINED_CLAY,(byte)1),
	MAGENTA_CLAY(Material.STAINED_CLAY,(byte)2),
	LIGHT_BLUE_CLAY(Material.STAINED_CLAY,(byte)3),
	YELLOW_CLAY(Material.STAINED_CLAY,(byte)4),
	LIME_CLAY(Material.STAINED_CLAY,(byte)5),
	PINK_CLAY(Material.STAINED_CLAY,(byte)6),
	GRAY_CLAY(Material.STAINED_CLAY,(byte)7),
	LIGHT_GREY_CLAY(Material.STAINED_CLAY,(byte)8),
	CYAN_CLAY(Material.STAINED_CLAY,(byte)9),
	PURPLE_CLAY(Material.STAINED_CLAY,(byte)10),
	BLUE_CLAY(Material.STAINED_CLAY,(byte)11),
	BROWN_CLAY(Material.STAINED_CLAY,(byte)12),
	GREEN_CLAY(Material.STAINED_CLAY,(byte)13),
	RED_CLAY(Material.STAINED_CLAY,(byte)14),
	BLACK_CLAY(Material.STAINED_CLAY,(byte)15),
	
	//QUARTZ
	
	CHISELED_QUARTZ(Material.QUARTZ_BLOCK,(byte)1),
	QUARTZ_PILLIAR(Material.QUARTZ_BLOCK,(byte)2),
	
	//Gravels and sand
	
	RED_SAND(Material.SAND,(byte)1),
	
	//WOOD
	
	OAK_PLANKS(Material.WOOD,(byte)0),
	SPRUCE_PLANKS(Material.WOOD,(byte)1),
	BIRCH_PLANKS(Material.WOOD,(byte)2),
	JUNGLE_PLANKS(Material.WOOD,(byte)3),
	ACACIA_PLANKS(Material.WOOD,(byte)4),
	DARK_OAK_PLANKS(Material.WOOD,(byte)5),
	
	OAK_LOG(Material.LOG,(byte)0),
	SPRUCE_LOG(Material.LOG,(byte)1),
	BIRCH_LOG(Material.LOG,(byte)2),
	JUNGLE_LOG(Material.LOG,(byte)3),
	ACACIA_LOG(Material.LOG,(byte)4),
	DARK_OAK_LOG(Material.LOG,(byte)5),
	
	//DIRT
	
	COARSE_DIRT(Material.DIRT,(byte)1),
	PODZOL(Material.DIRT,(byte)2),
	
	//PRISMARINE
	
	PRISMARINE(Material.PRISMARINE,(byte)0),
	PRISMARINE_BRICK(Material.PRISMARINE,(byte)1),
	DARK_PRISMARINE(Material.PRISMARINE,(byte)2),
	
	//SANDSTONE-RED
	
	RED_SANDSTONE(Material.RED_SANDSTONE,(byte)0),
	CHISELED_RED_SANDSTONE(Material.RED_SANDSTONE,(byte)1),
	SMOOTH_RED_SANDSTONE(Material.RED_SANDSTONE,(byte)2),
	
	//SAPLING
	
	OAK_SAPLING(Material.SAPLING,(byte)0),
	SPRUCE_SAPLING(Material.SAPLING,(byte)1),
	BIRCH_SAPLING(Material.SAPLING,(byte)2),
	JUNGLE_SAPLING(Material.SAPLING,(byte)3),
	ACACIA_SAPLING(Material.SAPLING,(byte)4),
	DARK_OAK_SAPLING(Material.SAPLING,(byte)5),
	
	//SPONGE
	
	WET_SPONGE(Material.SPONGE,(byte)1),
	
	//SANDSTONE
	
	CHISELED_SANDSTONE(Material.SANDSTONE,(byte)1),
	
	//Cobblestone
	
	MOSSY_STONE_BRICK(Material.SMOOTH_BRICK,(byte)1),
	CRACKED_STONE_BRICK(Material.SMOOTH_BRICK,(byte)2),
	CHISELED_STONE_BRICK(Material.SMOOTH_BRICK,(byte)3),
	MOSSY_COBBLE(Material.MOSSY_COBBLESTONE,(byte)0),
	MOSSY_COBBLE_WALL(Material.COBBLE_WALL,(byte)1);
	
	private Material m;
	private byte b;
	
	ItemType(Material m,byte b) {
		this.b=b;
		this.m=m;
	}

	public Material getMaterial() {
		return m;
	}

	public byte getByte() {
		return b;
	}
}
