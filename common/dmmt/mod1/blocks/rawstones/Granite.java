package dmmt.mod1.blocks.rawstones;

import java.util.Random;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Granite extends Block {

	public Granite(int id, Material par2Material) {
		super(id, par2Material);
		
		//CHANGE TO CORRECT HARDNESS
		setHardness(4.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("granite");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName(ModInfo.NAME.toLowerCase() + ":granite");
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		return Basic.granite.blockID;
	}

}
