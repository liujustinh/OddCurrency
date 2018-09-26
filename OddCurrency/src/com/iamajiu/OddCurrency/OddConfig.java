package com.iamajiu.OddCurrency;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class OddConfig extends AbstractConfig{

	public OddConfig(Main main) {
		super(main, "config.yml");
		newConfig(); 
	}
	
	public void newConfig() {
		if (!config.contains("Items")) {
			config.set("Items.Slot1.Price", 0); 
			config.set("Items.Slot1.Name", " ");
			config.set("Items.Slot1.Command", " ");
			config.set("Items.Slot2.Price", 0); 
			config.set("Items.Slot2.Name", " ");
			config.set("Items.Slot2.Command", " ");
			config.set("Items.Slot3.Price", 0); 
			config.set("Items.Slot3.Name", " ");
			config.set("Items.Slot3.Command", " ");
			config.set("Items.Slot4.Price", 0); 
			config.set("Items.Slot4.Name", " ");
			config.set("Items.Slot4.Command", " ");
			config.set("Items.Slot5.Price", 0); 
			config.set("Items.Slot5.Name", " ");
			config.set("Items.Slot5.Command", " ");
			config.set("Items.Slot6.Price", 0); 
			config.set("Items.Slot6.Name", " ");
			config.set("Items.Slot6.Command", " ");
			config.set("Items.Slot7.Price", 0); 
			config.set("Items.Slot7.Name", " ");
			config.set("Items.Slot7.Command", " ");
			config.set("Items.Slot8.Price", 0); 
			config.set("Items.Slot8.Name", " ");
			config.set("Items.Slot8.Command", " ");
			config.set("Items.Slot9.Price", 0); 
			config.set("Items.Slot9.Name", " ");
			config.set("Items.Slot9.Command", " ");
			save(); 
			return;
		}
	}
	
	public void tellConsole(String message) {
	    Bukkit.getConsoleSender().sendMessage(message);
	}
	
	public ArrayList<ItemStack> parseConfig() {
		ArrayList<ItemStack> items = new ArrayList<ItemStack>(); 
		String slot = "Slot"; 
		String temp = "Slot1";  
		String price, name, command; 
		for (int i = 0, b = 1; i < 9; ++i, ++b) {
			ItemStack itemslot = new ItemStack(Material.BOOK, 1); 
			ItemMeta itemmeta = itemslot.getItemMeta(); 
			temp = slot + b + "."; 
			price = "Items." + temp + "Price"; 
			name = "Items." + temp + "Name"; 
			command = "Items." + temp + "Command"; 
			itemmeta.setDisplayName(config.getString(name));
			ArrayList<String> lore = new ArrayList<String>(); 
			lore.add(ChatColor.GOLD + "Price: " + config.getInt(price) + "]"); 
			lore.add(ChatColor.GRAY + config.getString(command)); 
			itemmeta.setLore(lore);
			itemslot.setItemMeta(itemmeta);
			items.add(itemslot);
		}
		return items;
	}
	
	
}
