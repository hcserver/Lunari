package lunari.Command;

import lunari.Event.Message;
import org.javacord.api.DiscordApi;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class Help {
    public Help(MessageCreateEvent event, DiscordApi api) {
        String MessageContent = event.getMessageContent().toLowerCase();
        if(IsCommand.Check(MessageContent, "help")){
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Help for "+api.getYourself().getName());
            event.getChannel().sendMessage("Work in progress");
        }
    }
}
