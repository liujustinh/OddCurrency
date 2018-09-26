package com.iamajiu.OddCurrency;


import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import Commands.AbstractCommands;

public class Main extends JavaPlugin implements Listener {
	 
	public OddConfig oddconfig; 
	
	@Override 
	public void onEnable() {
		getLogger().info("Loading data and config files...");
	       if (!getDataFolder().exists()) {
	    	   getLogger().info("Creating new configuration files...");
	    	   getDataFolder().mkdirs(); 
	       }
	       Bukkit.getPluginManager().registerEvents(this, this);
	       
	       this.oddconfig = new OddConfig(this); 
	       
	       AbstractCommands.registerCommands(this);
	       
	}
	
	@Override 
	public void onDisable() {
		oddconfig.save(); 
	}
	
	public OddConfig getData() {
		OddConfig temp = this.oddconfig; 
		return temp; 
	}
}
