package lunari;

import org.javacord.api.DiscordApi;

// ===== Commands
import lunari.Command.Ping;
import lunari.Command.Help;


public class CommandHandler {
    public CommandHandler(DiscordApi api) {
        api.addMessageCreateListener(event -> {
            new Ping(event, api);
            new Help(event, api);
        });
    }
}