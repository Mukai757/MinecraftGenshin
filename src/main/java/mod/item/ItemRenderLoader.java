package mod.item;


import org.lwjgl.opengl.GL11;

import mod.item.ItemLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModel;


public class ItemRenderLoader
{
	public final ResourceLocation modelResource = new ResourceLocation("modid:yourModelLocation/yourModel.obj");
	public final ResourceLocation texture = new ResourceLocation("modid:yourTextureLocation/yourTexture.png");

	//public IModel model = AdvancedModelLoader.loadModel(modelResource);
    public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
       // BlockLoader.registerRenders();
    }
    /*
    public void renderItem(ItemRenderType type, ItemStack stack, Object... data) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().renderEngine.bindTexture(this.texture); //Not 100% sure if I got this right, but you bing the texture here.
        //Do all your GL11 rotations, scales, and translaters here...
        this.model.renderAll(); //Finally render the model
        GL11.glPopMatrix();
}
 **/   
}
	