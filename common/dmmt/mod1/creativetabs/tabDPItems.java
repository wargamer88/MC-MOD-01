package dmmt.mod1.creativetabs;

import dmmt.mod1.basic.Basic;
import net.minecraft.creativetab.CreativeTabs;

public class tabDPItems extends CreativeTabs {

	public tabDPItems(int id, String name) {
		super(id, name);
	}
	
	@Override
	public int getTabIconItemIndex() {
		return Basic.ItemsPlace.itemID; 
	}

}
