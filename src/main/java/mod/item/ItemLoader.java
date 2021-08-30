package mod.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import mod.item.arms.*;
import Genshin.Genshinmod.Genshin;
import mod.item.*;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	public static Item Bule_ArrowCluster = new Item().setUnlocalizedName("bule_arrowcluster");
	public static Item Green_ArrowCluster = new Item().setUnlocalizedName("Green_ArrowCluster");
	public static Item White_ArrowCluster = new Item().setUnlocalizedName("White_ArrowCluster");
	// public static Item wolf = new test();
	public static Item TheEndofWolf = new TheEndOfWolf();
	// protected static final ResourceLocation hangar_down_upper_loc = new
	// ResourceLocation(Genshin.MODID,"block/hangar_door_down_upper.obj");

	public ItemLoader(FMLPreInitializationEvent event) {

		// register(Bule_ArrowCluster, "bule_arrowcluster");
		// register(Green_ArrowCluster, "Green_ArrowCluster");
		// register(White_ArrowCluster, "White_ArrowCluster");
		register(TheEndofWolf, "theendofwolf");
		// register(wolf, "wolf");
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		// registerRender(Bule_ArrowCluster);
		// registerRender(Green_ArrowCluster);
		// registerRender(White_ArrowCluster);
		// registerRender(wolf);
		// ModelLoader.setCustomModelResourceLocation(TheEndofWolf, 0, new
		// ModelResourceLocation(new ResourceLocation(Genshin.MODID,
		// "theendofwolf.obj"), "inventory"));
	}

	// ×¢²áÀà
	private void register(Item item, String name) {
		ForgeRegistries.ITEMS.register(item.setRegistryName(name));
	}

	// ×¢²á²ÄÖÊÀà
	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, model);

	}

	public static void registerRender(Item i, int meta) {
		ModelLoader.setCustomModelResourceLocation(i, meta,
				new ModelResourceLocation(i.getRegistryName(), "inventory"));
	}
}
