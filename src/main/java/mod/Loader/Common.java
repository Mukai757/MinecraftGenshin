package mod.Loader;

import mod.Loader.CreativeTabsLoader;
import mod.block.BlockLoader;
import mod.item.*;
import mod.item.arms.TheEndOfWolf;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class Common {
	public void preInit(FMLPreInitializationEvent event) {
		new ItemLoader(event);
		new CreativeTabsLoader(event);
		new BlockLoader(event);

	}

	public void init(FMLInitializationEvent event) {

		// new WorldGeneratorLoader();
	}

	public void postInit(FMLPostInitializationEvent event) {
		new CraftingLoader();
	}

	public void onStart(FMLServerStartingEvent e) {

	}
}