package Creates;

import mod.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreateArms extends CreativeTabs
	{
		
		public CreateArms()
	    {
	        super("CreateArms");
	    }

	    @Override
	    public ItemStack getTabIconItem()
	    {
	        return new ItemStack(ItemLoader.Bule_ArrowCluster);
	    }
	    
	}


