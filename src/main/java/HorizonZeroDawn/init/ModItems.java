package HorizonZeroDawn.init;

import HorizonZeroDawn.client.Reference;
import HorizonZeroDawn.item.ItemModSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {

	public static ToolMaterial Alloy = EnumHelper.addToolMaterial("Alloy", 4, 0, 10.0F, 3.0F, 64);
	
	public static Item alloy_spear;
	
	
	public static void init(){
		
		
	}
	
	public static void register(){
		GameRegistry.registerItem(alloy_spear = new ItemModSword("alloy_spear", Alloy),alloy_spear.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders(){
		registerRender(alloy_spear);
		
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));

		
	}
}
