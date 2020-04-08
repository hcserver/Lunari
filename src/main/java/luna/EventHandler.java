package luna;

import org.javacord.api.DiscordApi;

// ===== Events
import luna.Event.Message;

public class EventHandler {
    public EventHandler(DiscordApi api) {
        new Message(api);
    }
}