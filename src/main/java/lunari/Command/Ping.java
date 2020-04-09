package lunari.Command;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ping {
    public Ping(MessageCreateEvent event, DiscordApi api) {
        String MessageContent = event.getMessageContent().toLowerCase();
        if(IsCommand.Check(MessageContent, "ping")){
            String ip = "162.159.129.233";
            String time = "";
            String pingCmd = "ping " + ip;
            Runtime runtime = Runtime.getRuntime();
            try {
                Process process = runtime.exec(pingCmd);
                BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String inputLine = in.readLine();
                while ((inputLine != null)) {
                    if (inputLine.length() > 0 && inputLine.contains("time")) {
                        time = inputLine.substring(inputLine.indexOf("time"));
                        break;
                    }
                    inputLine = in.readLine();
                }
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Connection Strength");
                embed.setDescription("Speed: "+time);
                embed.setFooter("TTL = Time To Live");
                embed.setColor(Color.CYAN);
                event.getChannel().sendMessage(embed);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}