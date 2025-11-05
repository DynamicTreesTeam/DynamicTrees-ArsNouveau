package maxhyper.dtarsnouveau;

import com.dtteam.dynamictrees.data.GatherDataHelper;
import com.dtteam.dynamictrees.block.leaves.LeavesProperties;
import com.dtteam.dynamictrees.block.pod.Pod;
import com.dtteam.dynamictrees.registry.NeoForgeRegistryHandler;
import com.dtteam.dynamictrees.tree.family.Family;
import com.dtteam.dynamictrees.tree.species.Species;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DynamicTreesArsNouveau.MOD_ID)
public class DynamicTreesArsNouveau {
    public static final String MOD_ID = "dtarsnouveau";

    public DynamicTreesArsNouveau(IEventBus bus) {

        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::gatherData);

//        if (ModList.get().isLoaded("dynamictreesplus")){
//            modEventBus.register(PlusRegistries.class);
//        }

        NeoForgeRegistryHandler.setup(MOD_ID, bus);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void gatherData(final GatherDataEvent event) {
        GatherDataHelper.gatherAllData(
                MOD_ID, event,
                Family.REGISTRY,
                Species.REGISTRY,
                LeavesProperties.REGISTRY,
                Pod.REGISTRY);
    }

    public static ResourceLocation location(final String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

}