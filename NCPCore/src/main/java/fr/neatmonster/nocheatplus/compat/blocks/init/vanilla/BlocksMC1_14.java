/*
 * This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.neatmonster.nocheatplus.compat.blocks.init.vanilla;

import fr.neatmonster.nocheatplus.compat.BridgeMaterial;
import fr.neatmonster.nocheatplus.compat.blocks.BlockPropertiesSetup;
import fr.neatmonster.nocheatplus.compat.blocks.init.BlockInit;
import fr.neatmonster.nocheatplus.config.WorldConfigProvider;
import fr.neatmonster.nocheatplus.logging.StaticLog;
import org.bukkit.Material;

public class BlocksMC1_14 implements BlockPropertiesSetup {

	public BlocksMC1_14() {
		BlockInit.assertMaterialExists("CAMPFIRE");
	}

	@Override
	public void setupBlockProperties(WorldConfigProvider<?> worldConfigProvider) {
		// Signs
		BlockInit.setInstantPassable("ACACIA_SIGN");
		BlockInit.setInstantPassable("BIRCH_SIGN");
		BlockInit.setInstantPassable("DARK_OAK_SIGN");
		BlockInit.setInstantPassable("JUNGLE_SIGN");
		BlockInit.setInstantPassable("OAK_SIGN");
		BlockInit.setInstantPassable("SPRUCE_SIGN");
		BlockInit.setInstantPassable("ACACIA_WALL_SIGN");
		BlockInit.setInstantPassable("BIRCH_WALL_SIGN");
		BlockInit.setInstantPassable("DARK_OAK_WALL_SIGN");
		BlockInit.setInstantPassable("JUNGLE_WALL_SIGN");
		BlockInit.setInstantPassable("OAK_WALL_SIGN");
		BlockInit.setInstantPassable("SPRUCE_WALL_SIGN");

		// Slabs
		BlockInit.setAs("ANDESITE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("CUT_RED_SANDSTONE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("CUT_SANDSTONE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("DIORITE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("END_STONE_BRICK_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("GRANITE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("MOSSY_COBBLESTONE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("MOSSY_STONE_BRICK_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("POLISHED_ANDESITE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("POLISHED_DIORITE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("POLISHED_GRANITE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("RED_NETHER_BRICK_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("SMOOTH_QUARTZ_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("SMOOTH_RED_SANDSTONE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("POLISHED_GRANITE_SLAB", BridgeMaterial.BRICK_SLAB);
		BlockInit.setAs("SMOOTH_SANDSTONE_SLAB", BridgeMaterial.BRICK_SLAB);

		// Stairs
		BlockInit.setAs("ANDESITE_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
		BlockInit.setAs("DIORITE_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("END_STONE_BRICK_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("GRANITE_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
		BlockInit.setAs("MOSSY_COBBLESTONE_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("MOSSY_STONE_BRICK_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("POLISHED_ANDESITE_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
		BlockInit.setAs("POLISHED_DIORITE_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("POLISHED_GRANITE_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("RED_NETHER_BRICK_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
		BlockInit.setAs("SMOOTH_QUARTZ_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("SMOOTH_RED_SANDSTONE_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("SMOOTH_SANDSTONE_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
		BlockInit.setAs("STONE_STAIRS", Material.COBBLESTONE_STAIRS);
		BlockInit.setAs("SMOOTH_STONE_SLAB", Material.BRICK_SLAB);

		// Walls
		BlockInit.setAs("ANDESITE_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("DIORITE_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("END_STONE_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("GRANITE_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("MOSSY_STONE_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("NETHER_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("PRISMARINE_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("RED_NETHER_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("RED_SANDSTONE_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("SANDSTONE_WALL", BridgeMaterial.COBBLESTONE_WALL);
		BlockInit.setAs("STONE_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);

		// Misc
		BlockInit.setAs("BAMBOO", Material.SUGAR_CANE);
		BlockInit.setAs("BARREL", Material.CHEST);
		BlockInit.setAs("BELL", Material.CHEST);
		BlockInit.setAs("BLAST_FURNACE", Material.FURNACE);
		BlockInit.setAs("CAMPFIRE", Material.BRICK_SLAB);  // FIXME: hitbox
		BlockInit.setAs("CARTOGRAPHY_TABLE", Material.CRAFTING_TABLE);
		BlockInit.setAs("COMPOSTER", Material.CAULDRON);
		BlockInit.setAs("CORNFLOWER", Material.POPPY);
		BlockInit.setAs("FLETCHING_TABLE", Material.CRAFTING_TABLE);
		BlockInit.setAs("GRINDSTONE", Material.CHEST);
		BlockInit.setAs("JIGSAW", Material.STRUCTURE_BLOCK);
		BlockInit.setAs("LANTERN", Material.SEA_PICKLE); // FIXME: hitbox
		BlockInit.setAs("LECTERN", Material.ENCHANTING_TABLE);
		BlockInit.setAs("LILY_OF_THE_VALLEY", Material.POPPY);
		BlockInit.setAs("LOOM", Material.CRAFTING_TABLE);
		BlockInit.setAs("SCAFFOLDING", Material.LADDER);
		BlockInit.setAs("SMITHING_TABLE", Material.CRAFTING_TABLE);
		BlockInit.setAs("SMOKER", Material.FURNACE);
		BlockInit.setAs("STONECUTTER", Material.CRAFTING_TABLE);
		BlockInit.setAs("WITHER_ROSE", Material.POPPY);

		StaticLog.logInfo("Added block-info for Minecraft 1.14 blocks.");
	}

}
