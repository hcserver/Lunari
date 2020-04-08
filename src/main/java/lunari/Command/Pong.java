package lunari.Command;

import org.javacord.api.event.message.MessageCreateEvent;

public class Pong {
    public Pong(MessageCreateEvent event) {
        String MessageContent = event.getMessageContent().toLowerCase();
        if(IsCommand.Check(MessageContent, "pong")){
            event.getChannel().sendMessage("Ping!");
        }
    }
}