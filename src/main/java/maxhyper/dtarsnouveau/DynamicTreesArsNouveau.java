package maxhyper.dtarsnouveau;

import com.ferreusveritas.dynamictrees.api.GatherDataHelper;
import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DynamicTreesArsNouveau.MOD_ID)
public class DynamicTreesArsNouveau {
    public static final String MOD_ID = "dtarsnouveau";

    public DynamicTreesArsNouveau() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::gatherData);

//        if (ModList.get().isLoaded("dynamictreesplus")){
//            modEventBus.register(PlusRegistries.class);
//        }

        RegistryHandler.setup(MOD_ID);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void gatherData(final GatherDataEvent event) {
        GatherDataHelper.gatherTagData(MOD_ID, event);
        GatherDataHelper.gatherLootData(MOD_ID, event);
    }

    public static ResourceLocation location(final String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}