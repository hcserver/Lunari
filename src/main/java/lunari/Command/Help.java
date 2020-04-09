package lunari.Command;

import lunari.Event.Message;
import org.javacord.api.event.message.MessageCreateEvent;

public class Help {
    public Help(MessageCreateEvent event) {
        String MessageContent = event.getMessageContent().toLowerCase();
        if(IsCommand.Check(MessageContent, "help")){
            event.getChannel().sendMessage("Work in progress");
        }
    }
}
