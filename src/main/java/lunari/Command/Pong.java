package lunari.Command;

import org.javacord.api.event.message.MessageCreateEvent;

public class Pong {
    public Pong(MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase("!pong")) {
            event.getChannel().sendMessage("Ping!");
        }
    }
}