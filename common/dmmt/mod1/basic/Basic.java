package dmmt.mod1.basic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
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
import dmmt.mod1.blocks.rawores.TitaniumOre;
import dmmt.mod1.blocks.rawores.WatermelonStone;
import dmmt.mod1.blocks.rawstones.Andesite;
import dmmt.mod1.blocks.rawstones.Diorite;
import dmmt.mod1.blocks.rawstones.DioriteQuartz;
import dmmt.mod1.blocks.rawstones.Dolomite;
import dmmt.mod1.blocks.rawstones.GreenGranite;
import dmmt.mod1.blocks.rawstones.Marble;
import dmmt.mod1.blocks.rawstones.Pumice;
import dmmt.mod1.blocks.rawstones.Siltstone;
import dmmt.mod1.creativetabs.tabDPBlocks;
import dmmt.mod1.creativetabs.tabDPItems;
import dmmt.mod1.creativetabs.placeholders.BlocksPlace;
import dmmt.mod1.creativetabs.placeholders.ItemsPlace;
import dmmt.mod1.item.IronChain;
import dmmt.mod1.item.IronChandelier;
import dmmt.mod1.item.IronNugget;
 
@Mod(modid=ModInfo.ID, name=ModInfo.NAME, version=ModInfo.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Basic {
 
	//creative tabs
    public static CreativeTabs tabDPBlocks = new tabDPBlocks(CreativeTabs.getNextID(), "tabDPBlocks");
    public static CreativeTabs tabDPItems = new tabDPItems(CreativeTabs.getNextID(), "tabDPItems");
    //Creative Tabs Placeholders
    public final static Item ItemsPlace = new ItemsPlace(1600);
    public final static Item BlocksPlace = new BlocksPlace(1601);
	
	//blocks
    public final static Block andesite = new Andesite(500, Material.rock);
    public final static Block dioriteQuartz = new DioriteQuartz(502, Material.rock);
    public final static Block dolomite = new Dolomite(503, Material.rock);
    public final static Block greenGranite = new GreenGranite(504, Material.rock);
    public final static Block marble = new Marble(505, Material.rock);
    public final static Block pumice = new Pumice(506, Material.rock);
    public final static Block siltstone = new Siltstone(507, Material.rock);
    public final static Block diorite = new Diorite(508, Material.rock);
    
    //ores
    public final static Block watermelonStone = new WatermelonStone(1000, Material.rock);
    public final static Block titaniumOre = new TitaniumOre(1001, Material.rock);
    
    //items
    public final static Item ironNugget = new IronNugget(1500);
    public final static Item ironChain = new IronChain(1501);
    public final static Item ironChandelier = new IronChandelier(1502);
    
    
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
                
                //setBlockHarvestLevel: 0=wood, 1=stone, 2=iron, 3=diamond
                
                //gameregistry of stones
                GameRegistry.registerBlock(andesite, "andesite"); LanguageRegistry.addName(andesite, "Andesite"); MinecraftForge.setBlockHarvestLevel(andesite, "pickaxe", 2);
                GameRegistry.registerBlock(dioriteQuartz, "dioriteQuartz"); LanguageRegistry.addName(dioriteQuartz, "Diorite Quartz"); MinecraftForge.setBlockHarvestLevel(dioriteQuartz, "pickaxe", 2);
                GameRegistry.registerBlock(dolomite, "dolomite"); LanguageRegistry.addName(dolomite, "Dolomite"); MinecraftForge.setBlockHarvestLevel(dolomite, "pickaxe", 2);
                GameRegistry.registerBlock(greenGranite, "greenGranite"); LanguageRegistry.addName(greenGranite, "Green Granite"); MinecraftForge.setBlockHarvestLevel(greenGranite, "pickaxe", 2);
                GameRegistry.registerBlock(marble, "marble"); LanguageRegistry.addName(marble, "Marble"); MinecraftForge.setBlockHarvestLevel(marble, "pickaxe", 2);
                GameRegistry.registerBlock(pumice, "pumice"); LanguageRegistry.addName(pumice, "pumice"); MinecraftForge.setBlockHarvestLevel(pumice, "pickaxe", 2);
                GameRegistry.registerBlock(siltstone, "siltstone"); LanguageRegistry.addName(siltstone, "Siltstone"); MinecraftForge.setBlockHarvestLevel(siltstone, "pickaxe", 2);
                GameRegistry.registerBlock(diorite, "diorite"); LanguageRegistry.addName(diorite, "Diorite"); MinecraftForge.setBlockHarvestLevel(diorite, "pickaxe", 3);
                
                //ores
                GameRegistry.registerBlock(watermelonStone, "watermelonStone"); LanguageRegistry.addName(watermelonStone, "Watermelon Ore"); MinecraftForge.setBlockHarvestLevel(watermelonStone, "pickaxe", 2);
                GameRegistry.registerBlock(titaniumOre, "titaniumOre"); LanguageRegistry.addName(titaniumOre, "Titanium Ore"); MinecraftForge.setBlockHarvestLevel(titaniumOre, "pickaxe", 3);
        
                //items
                GameRegistry.registerItem(ironNugget, "ironNugget"); LanguageRegistry.addName(ironNugget, "Iron Nugget");
                GameRegistry.registerItem(ironChain, "ironChain"); LanguageRegistry.addName(ironChain, "Iron Chain");
                GameRegistry.registerItem(ironChandelier, "ironChandelier"); LanguageRegistry.addName(ironChandelier, "Iron Chandelier");
                
                //world Gen
                GameRegistry.registerWorldGenerator(blockGenerator);
                
                //Creative Tabs Placeholders
                GameRegistry.registerItem(ItemsPlace, "ItemsPlace");
                GameRegistry.registerItem(BlocksPlace, "BlocksPlace");
                
                //Crafting Recipes
                
                /* Crafting Recipes Example
                 * 
                 * How to add one?
                 * 
                 * First you add the name above it what you are going to craft in a comment.
                 * Like The First one under here.
                 */
                
                //mossy cobblestone and stonebricks
                
                //first you devine what you are going to need for that recipe, like this
                ItemStack mossyStack = new ItemStack(Block.cobblestoneMossy);
                ItemStack mossyBrickStack = new ItemStack(Block.stoneBrick, 1, 1);
                ItemStack cobbleStack = new ItemStack(Block.cobblestone);
                ItemStack stoneBrickStack = new ItemStack(Block.stoneBrick);
                ItemStack vineStack = new ItemStack(Block.vine);
                
                //Then the actual crafting recipe
                GameRegistry.addShapelessRecipe(mossyStack,cobbleStack, vineStack);
                GameRegistry.addShapelessRecipe(mossyBrickStack, stoneBrickStack, vineStack);
                //that's it!
                
                
                //9 iron nuggets
                ItemStack iron = new ItemStack(Item.ingotIron);
                ItemStack ironNuggetStack9 = new ItemStack(this.ironNugget, 9);
                
                GameRegistry.addShapelessRecipe(ironNuggetStack9, iron);
                
                //1 iron chain
                ItemStack ironNugget = new ItemStack(this.ironNugget);
                ItemStack ironChain = new ItemStack(this.ironChain);
                
                GameRegistry.addRecipe(ironChain, " x ", "x x", " x ", 'x', ironNugget);
                
                //1 chandelier
                ItemStack coal = new ItemStack(Item.coal);
                ItemStack flint = new ItemStack(Item.flint);
                ItemStack ironChandelier = new ItemStack(this.ironChandelier);
                
                GameRegistry.addRecipe(ironChandelier, "aba", "cdc", " c ", 'a', ironChain, 'b', flint, 'c', iron, 'd', coal);
                
                //Ingame Names Creative Tabs
                LanguageRegistry.instance().addStringLocalization("itemGroup.tabDPBlocks", "en_US", "Dutch Power Blocks");
                LanguageRegistry.instance().addStringLocalization("itemGroup.tabDPItems", "en_US", "Dutch Power Items");
                
                oreRegistration();
                
        }
        
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        
        public static void oreRegistration()
        {
                OreDictionary.registerOre("nuggetIron", new ItemStack(ironNugget));
        }
       
}