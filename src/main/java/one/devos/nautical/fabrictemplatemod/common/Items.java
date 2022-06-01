package one.devos.nautical.fabrictemplatemod.common;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import one.devos.nautical.fabrictemplatemod.FabricTemplateMod;

public class Items {
    public static final Item EXAMPLE_ITEM = register("example_item", new Item(new OwoItemSettings().group(FabricTemplateMod.EXAMPLE_ITEM_GROUP).tab(0)));

    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(FabricTemplateMod.MOD_ID, name), item);
    }
    public static void init() { }
}
