package com.joeldesante.warmtundra;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class WarmTundra extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new TundraChunkGenerator();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
