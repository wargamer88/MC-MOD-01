package dmmt.mod1.basic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import dmmt.mod1.basic.CommonProxy;
import dmmt.mod1.blocks.rawstones.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid=ModInfo.ID, name=ModInfo.NAME, version=ModInfo.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Basic {
 
	//blocks
    public final static Block andesite = new Andesite(500, Material.rock);
    public final static Block conglomerate = new Conglomerate(501, Material.rock);
    public final static Block dioriteQuartz = new DioriteQuartz(502, Material.rock);
    public final static Block dolomite = new Dolomite(503, Material.rock);
    public final static Block granite = new Granite(504, Material.rock);
    public final static Block marble = new Marble(505, Material.rock);
    public final static Block pumice = new Pumice(506, Material.rock);
    public final static Block siltstone = new Siltstone(507, Material.rock);
	
        // The instance of your mod that Forge uses.
        @Instance("Basic")
        public static Basic instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide= ModInfo.CLIENTPROXY + "ClientProxy", serverSide= ModInfo.COMMONPROXY + "CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                //gameregistry of stones
                //GameRegistry.registerBlock(genericOre, "genericOre"); LanguageRegistry.addName(genericOre, "Generic Ore"); MinecraftForge.setBlockHarvestLevel(genericOre, "pickaxe", 3);
                
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}