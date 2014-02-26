package dmmt.mod1.creativetabs.placeholders;

import dmmt.mod1.basic.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemsPlace extends Item {

	public ItemsPlace(int id) {
		super(id);
		setUnlocalizedName("itemsplace");
		setTextureName(ModInfo.NAME.toLowerCase() + ":itemsplace");
	}

}
