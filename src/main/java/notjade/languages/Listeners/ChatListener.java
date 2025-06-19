package notjade.languages.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {
        if(event.getMessage().contains(".arb")) {
            event.getPlayer().sendMessage("Listener working");
        }
    }

}

