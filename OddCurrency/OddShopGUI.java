package com.iamajiu.OddCurrency;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class OddShopGUI implements Listener {
	
	public void tellConsole(String message) {
	    Bukkit.getConsoleSender().sendMessage(message);
	}
	
	private OddConfig ocfg = Main.getPlugin(Main.class).getData(); 
	
	public void openShop(Player player) {
		tellConsole("4");
		Inventory inv = Bukkit.getServer().createInventory(null, 9, ChatColor.DARK_BLUE + " " + ChatColor.BOLD + "OddShop");
		ArrayList<ItemStack> items = ocfg.parseConfig(); 
		for (int i = 0; i < 9; ++i) {
			inv.setItem(i, items.get(i));
		}
		player.openInventory(inv);
		return;
	}
}
