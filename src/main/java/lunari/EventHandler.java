package lunari;

import org.javacord.api.DiscordApi;

// ===== Events
import lunari.Event.Message;

public class EventHandler {
    public EventHandler(DiscordApi api) {
        new Message(api);
    }
}