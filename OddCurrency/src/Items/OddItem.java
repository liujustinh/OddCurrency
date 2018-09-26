package Items;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class OddItem implements Listener {
	
	public void giveItem(Player player, int amount) {
		ItemStack item = new ItemStack(Material.SLIME_BALL, amount); 
		ItemMeta meta = item.getItemMeta(); 
		meta.setDisplayName(ChatColor.GREEN + " " + ChatColor.BOLD + "OddCurrency");
		ArrayList<String> lore = new ArrayList<String>(); 
		lore.add(ChatColor.DARK_PURPLE + "Maybe you could spend it on something useful!"); 
		meta.setLore(lore);
		item.setItemMeta(meta); 
		player.getInventory().addItem(item); 
	}
}
