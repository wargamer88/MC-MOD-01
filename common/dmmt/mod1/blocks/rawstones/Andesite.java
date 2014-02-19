package dmmt.mod1.blocks.rawstones;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import dmmt.mod1.basic.ModInfo;

public class Andesite extends Block {

	public Andesite(int id, Material par2Material) {
		super(id, par2Material);
		
		//CHANGE TO CORRECT HARDNESS
		setHardness(4.0F);
		
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("andesite");
		setCreativeTab(CreativeTabs.tabBlock);
		
		//CHANGE TO CORRECT TEXTURE
		setTextureName(ModInfo.NAME.toLowerCase() + ":stone");
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		//CHANGE TO CORRECT DROPPED BLOCK
		return Block.stone.blockID;
	}

}
