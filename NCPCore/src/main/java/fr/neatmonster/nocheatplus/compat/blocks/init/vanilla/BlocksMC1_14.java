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

import org.bukkit.Material;

import fr.neatmonster.nocheatplus.compat.BridgeMaterial;
import fr.neatmonster.nocheatplus.compat.blocks.BlockPropertiesSetup;
import fr.neatmonster.nocheatplus.compat.blocks.init.BlockInit;
import fr.neatmonster.nocheatplus.config.WorldConfigProvider;
import fr.neatmonster.nocheatplus.logging.StaticLog;
import fr.neatmonster.nocheatplus.utilities.map.BlockFlags;
import fr.neatmonster.nocheatplus.utilities.map.BlockProperties;
import fr.neatmonster.nocheatplus.utilities.map.BlockProperties.BlockProps;
import fr.neatmonster.nocheatplus.utilities.map.MaterialUtil;

@SuppressWarnings("deprecation")
public class BlocksMC1_14 implements BlockPropertiesSetup {

    public BlocksMC1_14() {
        BlockInit.assertMaterialExists("LILY_PAD");
        BlockInit.assertMaterialExists("CAVE_AIR");
    }

    @Override
    public void setupBlockProperties(WorldConfigProvider<?> worldConfigProvider) {

        // Void air.
        BlockInit.setAs("VOID_AIR", Material.AIR);
        // Cave air.
        BlockInit.setAs("CAVE_AIR", Material.AIR);

        // Dirt like.
        BlockInit.setAs("PODZOL", Material.DIRT);
        BlockInit.setAs("COARSE_DIRT", Material.DIRT);

        // Coral blocks (dead or alive).
        for (Material mat : MaterialUtil.CORAL_BLOCKS) {
            BlockInit.setAs(mat, Material.STONE);
        }

        // Passable (alive) coral parts.

        // Dead coral parts (solid + ground already set).
        for (Material mat : MaterialUtil.DEAD_CORAL_PARTS) {
            // (Flags should be set correctly by default.)
            BlockInit.setPropsAs(mat, Material.STONE);
        }

        // Kelp.

        // Fern.

        // Bubble column.
        // TODO: Drag down effect: probably not using velocity.
        BlockInit.setAs("BUBBLE_COLUMN", Material.WATER);

        // Further melon/pumpkin stems.

        // Wall torch
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
		
        // More brick slabs.
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
		
		
        // More brick stairs.
        BlockInit.setAs("ANDESITE_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
        BlockInit.setAs("DIORITE_STAIRS", Material.COBBLESTONE_STAIRS);
        BlockInit.setAs("END_STONE_BRICK_STAIRS", Material.COBBLESTONE_STAIRS);

        // More brick stairs.
        BlockInit.setAs("GRANITE_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
        BlockInit.setAs("MOSSY_COBBLESTONE_STAIRS", Material.COBBLESTONE_STAIRS);
        BlockInit.setAs("MOSSY_STONE_BRICK_STAIRS", Material.COBBLESTONE_STAIRS);
        // More brick stairs.
        BlockInit.setAs("POLISHED_ANDESITE_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
        BlockInit.setAs("POLISHED_DIORITE_STAIRS", Material.COBBLESTONE_STAIRS);
        BlockInit.setAs("POLISHED_GRANITE_STAIRS", Material.COBBLESTONE_STAIRS);
        // More brick stairs.
        BlockInit.setAs("RED_NETHER_BRICK_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
        BlockInit.setAs("SMOOTH_QUARTZ_STAIRS", Material.COBBLESTONE_STAIRS);
        BlockInit.setAs("SMOOTH_RED_SANDSTONE_STAIRS", Material.COBBLESTONE_STAIRS);
        // More brick stairs.
        BlockInit.setAs("SMOOTH_SANDSTONE_STAIRS", BridgeMaterial.STONE_BRICK_STAIRS);
        BlockInit.setAs("STONE_STAIRS", Material.COBBLESTONE_STAIRS);

        // More cobblestone walls.
        BlockInit.setAs("ANDESITE_WALL", BridgeMaterial.COBBLESTONE_WALL);
        BlockInit.setAs("BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
        BlockInit.setAs("DIORITE_WALL", BridgeMaterial.COBBLESTONE_WALL);

        // More cobblestone walls.
        BlockInit.setAs("END_STONE_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
        BlockInit.setAs("GRANITE_WALL", BridgeMaterial.COBBLESTONE_WALL);
        BlockInit.setAs("MOSSY_STONE_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);

        // More cobblestone walls.
        BlockInit.setAs("NETHER_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
        BlockInit.setAs("PRISMARINE_WALL", BridgeMaterial.COBBLESTONE_WALL);
        BlockInit.setAs("RED_NETHER_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);

        // More cobblestone walls.
        BlockInit.setAs("RED_SANDSTONE_WALL", BridgeMaterial.COBBLESTONE_WALL);
        BlockInit.setAs("SANDSTONE_WALL", BridgeMaterial.COBBLESTONE_WALL);
        BlockInit.setAs("STONE_BRICK_WALL", BridgeMaterial.COBBLESTONE_WALL);
        
        StaticLog.logInfo("Added block-info for Minecraft 1.14 blocks.");
    }

}
