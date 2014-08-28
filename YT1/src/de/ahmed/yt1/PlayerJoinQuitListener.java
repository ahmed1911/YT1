package de.ahmed.yt1;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuitListener implements Listener
{

	@EventHandler
	public void onJoin(PlayerJoinEvent event)
	{
		event.setJoinMessage("§a" + event.getPlayer().getName() + " §9hat das Spiel betreten.");
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent event)
	{
		event.setQuitMessage("§c" + event.getPlayer().getName() + " §9hat das Spiel verlassen.");
	}
	
}
