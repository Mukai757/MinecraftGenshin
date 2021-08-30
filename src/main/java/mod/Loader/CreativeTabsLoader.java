package mod.Loader;

import Creates.CreateArms;
import mod.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {
	public static CreativeTabs tabArms;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
    	tabArms = new CreateArms();
       
    }
}
