package com.joeldesante.warmtundra.generators;

import org.bukkit.Material;
import org.bukkit.block.Block;

public interface Generator {
    double generate(int x, int y);
    void addLayer(int maxHeight, Material mat);
}
