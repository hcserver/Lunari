package luna;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String token = new GetToken().main();
        DiscordApi api = (DiscordApi)(new DiscordApiBuilder()).setToken(token).login().join();
        new EventHandler(api);
        new CommandHandler(api);
    }
}