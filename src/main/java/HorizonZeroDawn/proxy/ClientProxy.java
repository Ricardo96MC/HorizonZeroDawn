package HorizonZeroDawn.proxy;

import HorizonZeroDawn.init.ModBlocks;
import HorizonZeroDawn.init.ModItems;

public class ClientProxy implements CommonProxy{

	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

}
