package dmmt.mod1.item;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronChain extends Item {

	public IronChain(int id) {
		super(id);
		setUnlocalizedName("ironChain");
		setCreativeTab(Basic.tabDPItems);
		setTextureName(ModInfo.NAME.toLowerCase() + ":iron_chain");
	}

}
