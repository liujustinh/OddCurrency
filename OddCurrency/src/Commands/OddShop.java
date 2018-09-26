package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.iamajiu.OddCurrency.OddShopGUI;

public class OddShop extends AbstractCommands {
	
	public void tellConsole(String message) {
	    Bukkit.getConsoleSender().sendMessage(message);
	}

	public OddShop(com.iamajiu.OddCurrency.Main pl) {
		super("ocshop", "OddCurrency.default", false); 
	}

	private OddShopGUI shop; 
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		if (args.length >= 1) {
			sender.sendMessage("Incorrect usage. Correct: /ocshop");
			return;
		}
		Player receiver = (Player) sender; 
		shop.openShop(receiver); 
		return;
	}
	
	
}
