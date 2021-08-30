package Genshin.Genshinmod;

import org.apache.logging.log4j.core.appender.rolling.OnStartupTriggeringPolicy;

import mod.Loader.Common;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/**
 * @author Genshin.Genshinmod;
 */
@Mod(modid = Genshin.MODID, name = Genshin.NAME, version = Genshin.VERSION, acceptedMinecraftVersions = "1.12.2")
public class Genshin {
	public static final String MODID = "genshin";
	public static final String NAME = "GenshinImpact";
	public static final String VERSION = "0.0.1";

	@Instance(Genshin.MODID)
	public static Genshin instance;

	@SidedProxy(clientSide = "mod.Loader.Client", serverSide = "mod.Loader.Common")
	public static Common proxy;
	public static MinecraftServer mcserver=null;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		
	}
	

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void OnStart(FMLServerStartingEvent e) {
		mcserver = e.getServer();
		proxy.onStart(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	public static ResourceLocation prefix(String name) {
		return new ResourceLocation(MODID, name);
	}

}
