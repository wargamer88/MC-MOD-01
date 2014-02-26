package dmmt.mod1.blocks.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;

public class BlockOilFluid extends BlockFluidClassic{    
	
	public BlockOilFluid(int id){
		super(id, Basic.fluidOil, Material.water);
		
		setCreativeTab(Basic.tabDPBlocks);
	}
	
	@SideOnly(Side.CLIENT)
    protected Icon stillIcon;
    @SideOnly(Side.CLIENT)
    protected Icon flowingIcon;
	
	@Override
    public Icon getIcon(int side, int meta) {
            return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
            stillIcon = register.registerIcon(ModInfo.NAME.toLowerCase() + ":fluidoil_still");
            flowingIcon = register.registerIcon(ModInfo.NAME.toLowerCase() + ":fluidoil_flow");
    }
    
    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
            if (world.getBlockMaterial(x,  y,  z).isLiquid()) return false;
            return super.canDisplace(world, x, y, z);
    }
    
    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
            if (world.getBlockMaterial(x,  y,  z).isLiquid()) return false;
            return super.displaceIfPossible(world, x, y, z);
    }
	
}