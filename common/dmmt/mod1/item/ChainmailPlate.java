package dmmt.mod1.item;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.item.Item;

public class ChainmailPlate extends Item {

	public ChainmailPlate(int id) {
		super(id);
		setUnlocalizedName("chainmailPlate");
		setCreativeTab(Basic.tabDPItems);
		setTextureName(ModInfo.NAME.toLowerCase() + ":chainmail_plate");
	}

}
