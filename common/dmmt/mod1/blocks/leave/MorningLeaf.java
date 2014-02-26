package dmmt.mod1.blocks.leave;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;

public class MorningLeaf extends BlockLeavesBase {

	public MorningLeaf(int id, Material par2Material, boolean par3) {
		super(id, par2Material, true);
		setCreativeTab(Basic.tabDPBlocks);
		setStepSound(Block.soundGrassFootstep);
		setTextureName(ModInfo.NAME.toLowerCase() + ":leaves_morningwood");
		setLightOpacity(1);
		setUnlocalizedName("morningLeaf");
	}

	
		
	}

