package dmmt.mod1.creativetabs;

import dmmt.mod1.basic.Basic;
import net.minecraft.creativetab.CreativeTabs;

public class tabDPBlocks extends CreativeTabs {

	public tabDPBlocks(int id, String name) {
		super(id, name);
	}
	
	@Override
	public int getTabIconItemIndex() {
		return Basic.BlocksPlace.itemID; 
	}

}
