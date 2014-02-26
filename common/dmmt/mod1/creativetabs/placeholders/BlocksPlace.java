package dmmt.mod1.creativetabs.placeholders;

import dmmt.mod1.basic.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlocksPlace extends Item {

	public BlocksPlace(int id) {
		super(id);
		setUnlocalizedName("BlocksPlace");
		setTextureName(ModInfo.NAME.toLowerCase() + ":blocksplace");
	}

}
