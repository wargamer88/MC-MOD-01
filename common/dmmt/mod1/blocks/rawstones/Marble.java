package dmmt.mod1.blocks.rawstones;

import java.util.Random;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Marble extends Block {

	public Marble(int id, Material par2Material) {
		super(id, par2Material);
		
		//CHANGE TO CORRECT HARDNESS
		setHardness(1.25F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("marble");
		setCreativeTab(Basic.tabDPBlocks);
		setTextureName(ModInfo.NAME.toLowerCase() + ":marble");
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		return Basic.marble.blockID;
	}

}
