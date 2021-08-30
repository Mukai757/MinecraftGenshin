package mod.Loader;

import Genshin.Genshinmod.Genshin;
import mod.item.arms.TheEndOfWolf;
import mod.Loader.Common;
import mod.item.ItemRenderLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class Client extends Common
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
		OBJLoader.INSTANCE.addDomain(Genshin.MODID);
        super.preInit(event);
        new ItemRenderLoader();
        
        
       ModelLoader.setCustomModelResourceLocation(mod.item.ItemLoader.TheEndofWolf,0, new ModelResourceLocation(Genshin.MODID + ":" + "sky", "inventory"));
      
    }

    
    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
    @SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
    	// OBJLoader.INSTANCE.addDomain(Genshin.MODID);
    	// ModelLoader.setCustomModelResourceLocation(mod.item.ItemLoader.TheEndofWolf,5, new ModelResourceLocation(Genshin.MODID + ":" + "theendofwolf.obj"));
	}
}	