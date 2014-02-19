package dmmt.mod1.basic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
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
import dmmt.mod1.blockgen.BlockGenerator;
import dmmt.mod1.blocks.rawstones.Andesite;
import dmmt.mod1.blocks.rawstones.Conglomerate;
import dmmt.mod1.blocks.rawstones.DioriteQuartz;
import dmmt.mod1.blocks.rawstones.Dolomite;
import dmmt.mod1.blocks.rawstones.Granite;
import dmmt.mod1.blocks.rawstones.Marble;
import dmmt.mod1.blocks.rawstones.Pumice;
import dmmt.mod1.blocks.rawstones.Siltstone;
 
@Mod(modid=ModInfo.ID, name=ModInfo.NAME, version=ModInfo.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
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
    
    //blockgenerator
    BlockGenerator blockGenerator = new BlockGenerator();
	
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
                GameRegistry.registerBlock(andesite, "andesite"); LanguageRegistry.addName(andesite, "Andesite"); MinecraftForge.setBlockHarvestLevel(andesite, "pickaxe", 2);
                GameRegistry.registerBlock(conglomerate, "conglomerate"); LanguageRegistry.addName(conglomerate, "Conglomerate"); MinecraftForge.setBlockHarvestLevel(conglomerate, "pickaxe", 2);
                GameRegistry.registerBlock(dioriteQuartz, "dioriteQuartz"); LanguageRegistry.addName(dioriteQuartz, "Diorite Quartz"); MinecraftForge.setBlockHarvestLevel(dioriteQuartz, "pickaxe", 2);
                GameRegistry.registerBlock(dolomite, "dolomite"); LanguageRegistry.addName(dolomite, "Dolomite"); MinecraftForge.setBlockHarvestLevel(dolomite, "pickaxe", 2);
                GameRegistry.registerBlock(granite, "granite"); LanguageRegistry.addName(granite, "Granite"); MinecraftForge.setBlockHarvestLevel(granite, "pickaxe", 2);
                GameRegistry.registerBlock(marble, "marble"); LanguageRegistry.addName(marble, "Marble"); MinecraftForge.setBlockHarvestLevel(marble, "pickaxe", 2);
                GameRegistry.registerBlock(pumice, "pumice"); LanguageRegistry.addName(pumice, "pumice"); MinecraftForge.setBlockHarvestLevel(pumice, "pickaxe", 2);
                GameRegistry.registerBlock(siltstone, "siltstone"); LanguageRegistry.addName(siltstone, "Siltstone"); MinecraftForge.setBlockHarvestLevel(siltstone, "pickaxe", 2);
                
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}