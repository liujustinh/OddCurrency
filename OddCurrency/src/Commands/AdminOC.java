package Commands;

import java.text.NumberFormat;
import java.text.ParsePosition;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;

import Items.OddItem;


public class AdminOC extends AbstractCommands {
	public AdminOC(com.iamajiu.OddCurrency.Main pl) {
		super("oc", "OddCurrency.admin", true); 
	}
	
	public static boolean isNumeric(String str) {
		  NumberFormat formatter = NumberFormat.getInstance();
		  ParsePosition pos = new ParsePosition(0);
		  formatter.parse(str, pos);
		  return str.length() == pos.getIndex();
		}
	
	private OddItem oc = new OddItem(); 

	@Override
	public void execute(CommandSender sender, String[] args) {
		if (args.length == 0 || args.length > 2) {
			sender.sendMessage("Incorrect usage. Correct usage: /oc [PlayerName] [Amount]"); 
			return;
		}
		if (args[0].length() <= 5) {
			sender.sendMessage("Player does not exist!");
			return;
		}
		Player receiver = Bukkit.getPlayer(args[0]); 
		if (!receiver.hasPlayedBefore() || !receiver.isOnline()) {
			sender.sendMessage("The player specified does not exist!");
			return;
		}
		if (!isNumeric(args[1])) {
			sender.sendMessage("Incorrect usage. Correct usage: /oc [PlayerName] [Amount]"); 
			return;
		}
		int amount = Integer.parseInt(args[1]); 
		
		oc.giveItem(receiver, amount); 
		
	}
	
}

