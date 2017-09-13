package MyPlugins;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;;

public class Main extends JavaPlugin{
	
	@Override
    public void onEnable() {
       
    }
   
    @Override
    public void onDisable() {
       
    }
    
    @Override
    public boolean onCommand(CommandSender sender,
    		Command command,
    		String label,
    		String[] args) {
    	if(command.getName().equalsIgnoreCase("sp")) {
    		sender.sendMessage("Spawn Monster !!");
    		return true;
    	}
    	sender.sendMessage("On Command !!");
    	return false;
	}
}
