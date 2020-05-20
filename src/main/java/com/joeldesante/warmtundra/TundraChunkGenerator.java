package com.joeldesante.warmtundra;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class TundraChunkGenerator extends ChunkGenerator {

    RandomBlock rb = new RandomBlock();

    public TundraChunkGenerator() {}

    /**
     * Generates the chunk given an offset.
     *
     * In our case we will be pulling simplex noise data from a variety of classes and
     * then processing/filtering it to meet our needs.
     *
     * @param world
     * @param random
     * @param chunkX
     * @param chunkZ
     * @param biome
     * @return ChunkData given an offset X and Z
     */
    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {

        ChunkData data = createChunkData(world);
        world.setSpawnLocation(0,255, 0);

        // Generate some land
        if(random.nextInt(1000) > 950 || (chunkX == 0 && chunkZ == 0)) {
            for(int x = 0; x < 16; x++) {
                for (int z = 0; z < 16; z++) {

                    data.setBlock(x,0, z, Material.BEDROCK);

                    for (int y = 2; y < 255; y++) {
                        data.setBlock(x, y, z, rb.getRandomMaterial(random));
                    }

                }
            }
        }


        return data;
    }

}
