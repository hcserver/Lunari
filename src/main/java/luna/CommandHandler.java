package luna;

import org.javacord.api.DiscordApi;

// ===== Commands
import luna.Command.Ping;
import luna.Command.Pong;


public class CommandHandler {
    public CommandHandler(DiscordApi api) {
        api.addMessageCreateListener(event -> {
            new Ping(event);
            new Pong(event);
        });
    }
}