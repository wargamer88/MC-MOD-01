package dmmt.mod1.blocks.wood;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;

public class MorningWood extends Block{

	public MorningWood(int id, Material par2Material) {
		super(id, par2Material);
		setStepSound(Block.soundWoodFootstep);
		setCreativeTab(Basic.tabDPBlocks);
		setHardness(4F);
		setUnlocalizedName("morningWood");
		
	}
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		topIcon = icon.registerIcon(ModInfo.NAME.toLowerCase() + ":log_morningwood_top");
		bottomIcon = icon.registerIcon(ModInfo.NAME.toLowerCase() + ":log_morningwood_top");
		sideIcon = icon.registerIcon(ModInfo.NAME.toLowerCase() + ":log_morningwood");
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata){
		if(side == 0){
			return bottomIcon;
		}else if(side == 1){
			return topIcon;
		} else {
			return sideIcon;
		}
	}
	
}
