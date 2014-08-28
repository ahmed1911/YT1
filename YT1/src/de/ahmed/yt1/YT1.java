package de.ahmed.yt1;

import org.bukkit.plugin.java.JavaPlugin;

public class YT1 extends JavaPlugin
{

	@Override
	public void onEnable() 
	{
		getServer().getPluginManager().registerEvents(new PlayerJoinQuitListener(), this);
	}
	
}
