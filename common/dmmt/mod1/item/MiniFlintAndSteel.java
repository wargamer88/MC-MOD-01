package dmmt.mod1.item;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.item.Item;

public class MiniFlintAndSteel extends Item {

	public MiniFlintAndSteel(int id) {
		super(id);
		setUnlocalizedName("miniFlintAndSteel");
		setCreativeTab(Basic.tabDPItems);
		setTextureName(ModInfo.NAME.toLowerCase() + ":mini_flint_and_steel");
	}

}
