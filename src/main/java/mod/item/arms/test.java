package mod.item.arms;

import mod.Loader.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class test extends ItemSword {
		public static final Item.ToolMaterial Musiciron = EnumHelper.addToolMaterial("Musiciron", 3, 9, 15.0F, 14.0F,
				22);

		public test() {
			super(Musiciron);
			this.setUnlocalizedName("wolf");
			this.setCreativeTab(CreativeTabsLoader.tabArms);
		}
}
