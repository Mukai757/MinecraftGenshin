package mod.item.arms;

import Genshin.Genshinmod.Genshin;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import mod.Loader.CreativeTabsLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TheEndOfWolf extends ItemSword {
     	//@GameRegistry.ObjectHolder("test:wolf")

		public static final Item.ToolMaterial Musiciron = EnumHelper.addToolMaterial("Musiciron", 3, 9, 15.0F, 14.0F,
				22);

		public TheEndOfWolf() {
			super(Musiciron);
			this.setUnlocalizedName("theendofwolf");
			this.setCreativeTab(CreativeTabsLoader.tabArms);
		}
		@SideOnly(Side.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			//ModelLoader.setCustomModelResourceLocation(mod.item.ItemLoader.TheEndofWolf, 0, new ModelResourceLocation(Genshin.MODID + ":" + "sky", "inventory"));
		}

}
