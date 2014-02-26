package dmmt.mod1.item;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronChandelier extends Item {

	public IronChandelier(int id) {
		super(id);
		setUnlocalizedName("ironChandelier");
		setCreativeTab(Basic.tabDPItems);
		setTextureName(ModInfo.NAME.toLowerCase() + ":hanging_iron_firepit");
	}

}
