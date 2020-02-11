package unloader;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;

@Mod(
	modid = Mod.MODID,
	name = Mod.NAME,
	version = "@VERSION@",
	acceptableRemoteVersions = "*"
)
public class Unloader {
	public static final String MODID = "unloader";
	public static final String NAME = "Unloader";

	private final TickHandler handler = null;

	@Mod.EventHandler
	public static void onServerStarting(FMLServerStartingEvent event) {
		handler = new TickHandler();
		MinecraftForge.EVENT_BUS.register(handler);
	}

	@Mod.EventHandler
	public static void onServerStopped(FMLServerStoppedEvent event) {
		MinecraftForge.EVENT_BUS.unregister(handler);
		handler = null;
	}
}
