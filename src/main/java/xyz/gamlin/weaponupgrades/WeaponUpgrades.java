package xyz.gamlin.weaponupgrades;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class WeaponUpgrades extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Weapon Upgrades has finished loading.");


        /*
            Sword recipes
         */

        // Wood sword Recipe
        ItemStack woodSword = new ItemStack(Material.WOODEN_SWORD);
        NamespacedKey keyWoodSword = new NamespacedKey(this, "wu_wood_sword");
        ShapedRecipe recipeWoodSword = new ShapedRecipe(keyWoodSword, woodSword);
        recipeWoodSword.shape("G");
        recipeWoodSword.setIngredient('G', Material.GOLDEN_SWORD);
        Bukkit.addRecipe(recipeWoodSword);

        // Gold sword Recipe
        ItemStack goldSword = new ItemStack(Material.GOLDEN_SWORD);
        NamespacedKey keyGoldSword = new NamespacedKey(this, "wu_gold_sword");
        ShapedRecipe recipeGoldSword = new ShapedRecipe(keyGoldSword, goldSword);
        recipeGoldSword.shape("W");
        recipeGoldSword.setIngredient('W', Material.WOODEN_SWORD);
        Bukkit.addRecipe(recipeGoldSword);

        // Stone sword Recipe
        ItemStack stoneSword = new ItemStack(Material.STONE_SWORD);
        NamespacedKey keyStoneSword = new NamespacedKey(this, "wu_stone_sword");
        ShapedRecipe recipeStoneSword = new ShapedRecipe(keyStoneSword, stoneSword);
        recipeStoneSword.shape("WW", "WW");
        recipeStoneSword.setIngredient('W', Material.WOODEN_SWORD);
        Bukkit.addRecipe(recipeStoneSword);

        // Iron sword Recipe
        ItemStack ironSword = new ItemStack(Material.IRON_SWORD);
        NamespacedKey keyIronSword = new NamespacedKey(this, "wu_iron_sword");
        ShapedRecipe recipeIronSword = new ShapedRecipe(keyIronSword, ironSword);
        recipeIronSword.shape("SS", "SS");
        recipeIronSword.setIngredient('S', Material.STONE_SWORD);
        Bukkit.addRecipe(recipeIronSword);

        // Diamond sword Recipe
        ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
        NamespacedKey keyDiamondSword = new NamespacedKey(this, "wu_diamond_sword");
        ShapedRecipe recipeDiamondSword = new ShapedRecipe(keyDiamondSword, diamondSword);
        recipeDiamondSword.shape("II", "II");
        recipeDiamondSword.setIngredient('I', Material.IRON_SWORD);
        Bukkit.addRecipe(recipeDiamondSword);

        // Netherite sword Recipe
        ItemStack netheriteSword = new ItemStack(Material.NETHERITE_SWORD);
        NamespacedKey keyNetheriteSword= new NamespacedKey(this, "wu_netherite_sword");
        ShapedRecipe recipeNetheriteSword = new ShapedRecipe(keyNetheriteSword, netheriteSword);
        recipeNetheriteSword.shape("DD", "DD");
        recipeNetheriteSword.setIngredient('D', Material.DIAMOND_SWORD);
        Bukkit.addRecipe(recipeNetheriteSword);

        
        /*
            Axe recipes
         */

        // Wood axe Recipe
        ItemStack woodAxe = new ItemStack(Material.WOODEN_AXE);
        NamespacedKey keyWoodAxe = new NamespacedKey(this, "wu_wood_axe");
        ShapedRecipe recipeWoodAxe = new ShapedRecipe(keyWoodAxe, woodAxe);
        recipeWoodAxe.shape("G");
        recipeWoodAxe.setIngredient('G', Material.GOLDEN_AXE);
        Bukkit.addRecipe(recipeWoodAxe);

        // Gold axe Recipe
        ItemStack goldAxe = new ItemStack(Material.GOLDEN_AXE);
        NamespacedKey keyGoldAxe = new NamespacedKey(this, "wu_gold_axe");
        ShapedRecipe recipeGoldAxe = new ShapedRecipe(keyGoldAxe, goldAxe);
        recipeGoldAxe.shape("W");
        recipeGoldAxe.setIngredient('W', Material.WOODEN_AXE);
        Bukkit.addRecipe(recipeGoldAxe);

        // Stone axe Recipe
        ItemStack stoneAxe = new ItemStack(Material.STONE_AXE);
        NamespacedKey keyStoneAxe = new NamespacedKey(this, "wu_stone_axe");
        ShapedRecipe recipeStoneAxe = new ShapedRecipe(keyStoneAxe, stoneAxe);
        recipeStoneAxe.shape("WW", "WW");
        recipeStoneAxe.setIngredient('W', Material.WOODEN_AXE);
        Bukkit.addRecipe(recipeStoneAxe);

        // Iron axe Recipe
        ItemStack ironAxe = new ItemStack(Material.IRON_AXE);
        NamespacedKey keyIronAxe = new NamespacedKey(this, "wu_iron_axe");
        ShapedRecipe recipeIronAxe = new ShapedRecipe(keyIronAxe, ironAxe);
        recipeIronAxe.shape("SS", "SS");
        recipeIronAxe.setIngredient('S', Material.STONE_AXE);
        Bukkit.addRecipe(recipeIronAxe);

        // Diamond axe Recipe
        ItemStack diamondAxe = new ItemStack(Material.DIAMOND_AXE);
        NamespacedKey keyDiamondAxe = new NamespacedKey(this, "wu_diamond_axe");
        ShapedRecipe recipeDiamondAxe = new ShapedRecipe(keyDiamondAxe, diamondAxe);
        recipeDiamondAxe.shape("II", "II");
        recipeDiamondAxe.setIngredient('I', Material.IRON_AXE);
        Bukkit.addRecipe(recipeDiamondAxe);

        // Netherite axe Recipe
        ItemStack netheriteAxe = new ItemStack(Material.NETHERITE_AXE);
        NamespacedKey keyNetheriteAxe = new NamespacedKey(this, "wu_netherite_axe");
        ShapedRecipe recipeNetheriteAxe = new ShapedRecipe(keyNetheriteAxe, netheriteAxe);
        recipeNetheriteAxe.shape("DD", "DD");
        recipeNetheriteAxe.setIngredient('D', Material.DIAMOND_AXE);
        Bukkit.addRecipe(recipeNetheriteAxe);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Weapon Upgrades has unloaded - good bye!");
    }
}
