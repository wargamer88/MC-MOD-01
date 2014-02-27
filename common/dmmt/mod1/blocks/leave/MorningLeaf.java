package dmmt.mod1.blocks.leave;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;

public class MorningLeaf extends BlockLeavesBase {

	public MorningLeaf(int id, Material par2Material, boolean par3) {
		super(id, par2Material, true);
		setCreativeTab(Basic.tabDPBlocks);
		setStepSound(Block.soundGrassFootstep);
		setTextureName(ModInfo.NAME.toLowerCase() + ":leaves_morningwood");
		setLightOpacity(1);
		setUnlocalizedName("morningLeaf");
		setHardness(0.05F);
	}

	public int idDropped(int par1, Random random, int zero) {
        return Basic.ironNugget.itemID;
	}
	public int quantityDropped(Random random) {
        if(random.nextInt(100) < 1){
        	return 1;
        } else {
        	return 0;
        }

    }
	
	
}

