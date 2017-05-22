package HorizonZeroDawn.client;

import HorizonZeroDawn.init.ModItems;
import HorizonZeroDawn.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

  
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class HorizonZeroDawn {
	
	@Instance
	public static HorizonZ	eroDawn instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModItems.init();
		ModItems.register();
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");
		proxy.registerRenders();
		
		//ModCrafting.register();
		
	}

	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post init");
	}

	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event){
		
	}
}
