package dmmt.mod1.item;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.item.Item;

public class GoldChandelier extends Item {

	public GoldChandelier(int id) {
		super(id);
		setUnlocalizedName("goldChandelier");
		setCreativeTab(Basic.tabDPItems);
		setTextureName(ModInfo.NAME.toLowerCase() + ":hanging_gold_firepit");
	}

}
