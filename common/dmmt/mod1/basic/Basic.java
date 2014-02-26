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
import dmmt.mod1.item.GoldChain;
import dmmt.mod1.item.GoldChandelier;
import dmmt.mod1.item.IronChain;
import dmmt.mod1.item.IronChandelier;
import dmmt.mod1.item.IronNugget;
import dmmt.mod1.item.MiniFlintAndSteel;
 
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
    public final static Item goldChain = new GoldChain(1503);
    public final static Item goldChandelier = new GoldChandelier(1504);
    public final static Item miniFlintAndSteel = new MiniFlintAndSteel(1505);
    
    
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
                
              //Ingame Names Creative Tabs
                LanguageRegistry.instance().addStringLocalization("itemGroup.tabDPBlocks", "en_US", "Dutch Power Blocks");
                LanguageRegistry.instance().addStringLocalization("itemGroup.tabDPItems", "en_US", "Dutch Power Items");
                
                gameRegistry();
                recipes();
                oreRegistration();
                
        }
        
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        
        public void gameRegistry(){
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
            GameRegistry.registerItem(goldChain, "goldChain"); LanguageRegistry.addName(goldChain, "Gold Chain");
            GameRegistry.registerItem(goldChandelier, "goldChandelier"); LanguageRegistry.addName(goldChandelier, "Gold Chandelier");
            GameRegistry.registerItem(miniFlintAndSteel, "miniFlintAndSteel"); LanguageRegistry.addName(miniFlintAndSteel, "Mini Flint and Steel");
            
            //world Gen
            GameRegistry.registerWorldGenerator(blockGenerator);
            
            //Creative Tabs Placeholders
            GameRegistry.registerItem(ItemsPlace, "ItemsPlace");
            GameRegistry.registerItem(BlocksPlace, "BlocksPlace");
        }
                
        public void recipes(){
        	//mossy cobblestone and stonebricks
            ItemStack mossyStack = new ItemStack(Block.cobblestoneMossy);
            ItemStack mossyBrickStack = new ItemStack(Block.stoneBrick, 1, 1);
            ItemStack cobbleStack = new ItemStack(Block.cobblestone);
            ItemStack stoneBrickStack = new ItemStack(Block.stoneBrick);
            ItemStack vineStack = new ItemStack(Block.vine);
            
            GameRegistry.addShapelessRecipe(mossyStack,cobbleStack, vineStack);
            GameRegistry.addShapelessRecipe(mossyBrickStack, stoneBrickStack, vineStack);
            
            //9 iron nuggets
            ItemStack iron = new ItemStack(Item.ingotIron);
            ItemStack ironNuggetStack9 = new ItemStack(this.ironNugget, 9);
            
            GameRegistry.addRecipe(iron, "xxx", "xxx", "xxx", 'x', ironNuggetStack9);
            GameRegistry.addShapelessRecipe(ironNuggetStack9, iron);
            
            //1 iron chain
            ItemStack ironNugget = new ItemStack(this.ironNugget);
            ItemStack ironChain = new ItemStack(this.ironChain);
            
            GameRegistry.addRecipe(ironChain, " x ", "x x", " x ", 'x', ironNugget);
            
            //1 mini flint and steel
            ItemStack miniFlintAndSteel = new ItemStack(this.miniFlintAndSteel);
            ItemStack flint = new ItemStack(Item.flint);
            
            GameRegistry.addRecipe(miniFlintAndSteel, "x ", " y", 'x', ironNugget, 'y', flint);
            
            //1 chandelier
            ItemStack coal = new ItemStack(Item.coal);
            ItemStack flintAndSteel = new ItemStack(Item.flintAndSteel);
            ItemStack ironChandelier = new ItemStack(this.ironChandelier);
            
            GameRegistry.addRecipe(ironChandelier, "aba", "cdc", " c ", 'a', ironChain, 'b', miniFlintAndSteel, 'c', iron, 'd', coal);
            
            //9 gold nuggets
            ItemStack gold = new ItemStack(Item.ingotGold);
            ItemStack goldNuggetStack9 = new ItemStack(Item.goldNugget, 9);
            
            GameRegistry.addShapelessRecipe(goldNuggetStack9, gold);
            GameRegistry.addRecipe(gold, "xxx", "xxx", "xxx", 'x', goldNuggetStack9 );
            
            //1 gold chain
            ItemStack goldNugget = new ItemStack(Item.goldNugget);
            ItemStack goldChain = new ItemStack(this.goldChain);
            
            GameRegistry.addRecipe(goldChain, "xxx", "x x", "xxx", 'x', goldNugget);
            
            //1 gold chandelier
            ItemStack goldChandelier = new ItemStack(this.goldChandelier);
            
            GameRegistry.addRecipe(goldChandelier, "aba", "cdc", " c ", 'a', goldChain, 'b', miniFlintAndSteel, 'c', gold, 'd', coal);
        }
        
        public static void oreRegistration()
        {
                OreDictionary.registerOre("nuggetIron", new ItemStack(ironNugget));
        }
       
}