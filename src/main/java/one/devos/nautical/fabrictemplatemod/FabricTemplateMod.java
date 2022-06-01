package one.devos.nautical.fabrictemplatemod;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import one.devos.nautical.fabrictemplatemod.common.Blocks;
import one.devos.nautical.fabrictemplatemod.common.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricTemplateMod implements ModInitializer {
	public static final String MOD_ID = "fabrictemplatemod";
	public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
	public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static final OwoItemGroup EXAMPLE_ITEM_GROUP = new OwoItemGroup(new ResourceLocation(MOD_ID, "fabrictemplatemod")) {
		@Override
		protected void setup() {
			keepStaticTitle();
			addTab(Icon.of(Blocks.EXAMPLE_BLOCK), "Blocks", null);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Blocks.EXAMPLE_BLOCK);
		}
	};


	@Override
	public void onInitialize() {
		EXAMPLE_ITEM_GROUP.initialize();

		Blocks.init();
		Items.init();

		LOGGER.info("[" + MOD_NAME + "] Version " + VERSION + " loaded." );
		LOGGER.info("[" + MOD_NAME + "] " + "Insert witty text here");
	}
}
