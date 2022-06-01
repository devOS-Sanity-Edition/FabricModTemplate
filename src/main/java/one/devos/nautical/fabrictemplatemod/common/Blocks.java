package one.devos.nautical.fabrictemplatemod.common;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy;
import static one.devos.nautical.fabrictemplatemod.FabricTemplateMod.EXAMPLE_ITEM_GROUP;
import static one.devos.nautical.fabrictemplatemod.FabricTemplateMod.MOD_ID;

public class Blocks {
    public static final Block EXAMPLE_BLOCK = register("example_block", new Block(copy(STONE)), 0);

    private static Block register(String name, Block block, int tab) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(EXAMPLE_ITEM_GROUP).tab(tab)));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }
    public static void init() { }
}
