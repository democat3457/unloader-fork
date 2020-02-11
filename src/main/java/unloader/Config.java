package unloader;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.LangKey;

@Config(modid = UnloaderMod.MODID)
@Config.LangKey(UnloaderMod.MODID+".config.title")
public class Config {
	@Name("blacklistDims")
	@Comment({
		"List of dimensions you don’t want to unload.",
		"Can be dimension name or ID. Uses regular expressions.",
	})
	@LangKey(UnloaderMod.MODID+".config.blacklistDims")
	public static String[] blacklistDims = {"0", "overworld"};

	@Name("unloadCheck")
	@Comment({
		"Time (in ticks) to wait before checking dimensions",
	})
	@LangKey(UnloaderMod.MODID+".config.unloadCheck")
	public static Integer unloadInterval = 600;
}
