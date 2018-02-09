package matteroverdrive.items.food;

import com.astro.clib.api.render.ItemModelProvider;
import matteroverdrive.MatterOverdrive;
import matteroverdrive.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import com.astro.clib.api.render.ItemModelProvider;

/**
 * @author shadowfacts
 */
public class MOItemFood extends ItemFood implements ItemModelProvider {

    private String name;

    public MOItemFood(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(new ResourceLocation(Reference.MOD_ID, name));

        setCreativeTab(MatterOverdrive.TAB_OVERDRIVE_FOOD);
    }

    @Override
    public void initItemModel() {
        MatterOverdrive.PROXY.registerItemModel(this, 0, name);
    }

}
