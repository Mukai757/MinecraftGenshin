package mod.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {

	public static Block Block_sweet_flower = new Block_sweet_flower();

	public BlockLoader(FMLPreInitializationEvent event) {

	//	register(Block_sweet_flower, "sweetflower");

	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
	//	registerRender(Block_sweet_flower);
	}

	private static void register(Block block, String name) {
		ForgeRegistries.BLOCKS.register(block.setRegistryName(name));
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
	}

	private static void registerRender(Block block, int meta, String side) {
		Item item = Item.getItemFromBlock(block);
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, meta, model);
	}

	@SubscribeEvent
	public static void onBlockRegistration(RegistryEvent.Register<Block> event) {

	}

}
