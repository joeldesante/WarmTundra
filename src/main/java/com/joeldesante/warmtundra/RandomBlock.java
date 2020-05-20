package com.joeldesante.warmtundra;

import org.bukkit.Material;
import java.util.Random;

public class RandomBlock {

    private Material[] materials = {
            Material.STONE,
            Material.COBBLESTONE,
            Material.DIRT,
            Material.OAK_LOG,
            Material.BIRCH_LOG,
            Material.DARK_OAK_LOG,
            Material.ANDESITE,
            Material.GRANITE,
            Material.IRON_ORE,
            Material.GOLD_ORE,
            Material.DIAMOND_ORE,
            Material.BLUE_CONCRETE,
            Material.RED_CONCRETE,
            Material.GREEN_CONCRETE,
            Material.ORANGE_CONCRETE,
            Material.YELLOW_CONCRETE,
            Material.BLACK_CONCRETE,
            Material.RED_CONCRETE,
            Material.BELL,
            Material.BONE_BLOCK,
            Material.WHITE_WOOL,
            Material.RED_WOOL,
            Material.ICE,
            Material.MELON,
            Material.CAKE
    };

    public Material getRandomMaterial(Random random) {
        return materials[random.nextInt(materials.length)];
    }

}
