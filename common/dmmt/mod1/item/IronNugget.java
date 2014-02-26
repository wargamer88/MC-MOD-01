package dmmt.mod1.item;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronNugget extends Item {

	public IronNugget(int id) {
		super(id);

		setUnlocalizedName("ironNugget");
		setCreativeTab(Basic.tabDPItems);
		setTextureName(ModInfo.NAME.toLowerCase() + ":iron_nugget");
	}

}
