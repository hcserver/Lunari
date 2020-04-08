package lunari.Event;

import org.javacord.api.DiscordApi;

public class Message {
    public Message(DiscordApi api) {
        api.addMessageCreateListener(event -> {
            if(event.getMessage().getContent().startsWith("money")){
                event.getChannel().sendMessage("That is a jew word");
            }
        });
    }
}
