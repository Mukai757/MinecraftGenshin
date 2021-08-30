package mod.block;

import Creates.*;
import mod.Loader.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Block_sweet_flower extends Block {
	public Block_sweet_flower()
    {
        super(Material.GROUND);
        this.setUnlocalizedName("sweetflower");
        this.setHardness(0.5F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(CreativeTabsLoader.tabArms);
    }

}
