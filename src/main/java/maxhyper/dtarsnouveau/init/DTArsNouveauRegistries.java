package maxhyper.dtarsnouveau.init;

import maxhyper.dtarsnouveau.DynamicTreesArsNouveau;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTArsNouveauRegistries {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DynamicTreesArsNouveau.MOD_ID);

    public static final RegistryObject<SoundEvent> FRUIT_BONK = registerSound("falling_fruit.bonk");

    public static RegistryObject<SoundEvent> registerSound (String name){
        return SOUNDS.register(name, ()-> new SoundEvent(DynamicTreesArsNouveau.location(name)));
    }

//    @SubscribeEvent
//    public static void registerPodType(final TypeRegistryEvent<Pod> event) {
//        event.registerType(DynamicTreesArsNouveau.location("falling_palm"), FallingCoconutPod.TYPE);
//    }
//
//    @SubscribeEvent
//    public static void onGenFeatureRegistry (final RegistryEvent<GenFeature> event) {
//        DTEcologicsGenFeatures.register(event.getRegistry());
//    }

}
