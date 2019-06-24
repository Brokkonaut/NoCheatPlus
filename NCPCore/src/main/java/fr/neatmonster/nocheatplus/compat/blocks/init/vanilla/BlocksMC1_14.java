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
        // Handled by normal initialization

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

		/*
		Solid 1x1 blocks
		 */

        // Inventory holders
        BlockInit.setAs("BARREL", Material.FURNACE);
        BlockInit.setAs("BLAST_FURNACE", Material.FURNACE);
        BlockInit.setAs("SMOKER", Material.FURNACE);
        // Tools and tables
        BlockInit.setAs("CARTOGRAPHY_TABLE", Material.CRAFTING_TABLE);
        BlockInit.setAs("FLETCHING_TABLE", Material.CRAFTING_TABLE);
        BlockInit.setAs("SMITHING_TABLE", Material.CRAFTING_TABLE);
        BlockInit.setAs("STONECUTTER", Material.CRAFTING_TABLE);
        BlockInit.setAs("LOOM", Material.CRAFTING_TABLE);
        // Misc
        BlockInit.setAs("JIGSAW", Material.STRUCTURE_BLOCK);

		/*
		Concave 1x1 blocks
		 */

        BlockInit.setAs("COMPOSTER", Material.CAULDRON);

		/*
		Solid custom-hitbox blocks
		 */

        //BlockInit.setAs("BELL", Material.CHEST); FIXME
        //BlockInit.setAs("CAMPFIRE", Material.BRICK_SLAB); FIXME
        //BlockInit.setAs("GRINDSTONE", Material.CHEST); FIXME
        //BlockInit.setAs("LANTERN", Material.SEA_PICKLE); FIXME
        //BlockInit.setAs("LECTERN", Material.ENCHANTING_TABLE); FIXME
        BlockInit.setAs("BAMBOO", Material.END_ROD);

		/*
		Non-solid blocks
		 */

        // Plants
        BlockInit.setAs("CORNFLOWER", Material.POPPY);
        BlockInit.setAs("WITHER_ROSE", Material.POPPY);
        BlockInit.setAs("LILY_OF_THE_VALLEY", Material.POPPY);
        // Ladder-like
        BlockInit.setAs("SCAFFOLDING", Material.LADDER);

        StaticLog.logInfo("Added block-info for Minecraft 1.14 blocks.");
    }

}
