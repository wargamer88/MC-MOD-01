package dmmt.mod1.item;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.item.Item;

public class GoldChain extends Item {

	public GoldChain(int id) {
		super(id);

		setUnlocalizedName("goldChain");
		setCreativeTab(Basic.tabDPItems);
		setTextureName(ModInfo.NAME.toLowerCase() + ":gold_chain");
	}

}
