package HorizonZeroDawn.item;

import HorizonZeroDawn.client.Reference;
import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword {

	public ItemModSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setMaxStackSize(1);

	}
}
