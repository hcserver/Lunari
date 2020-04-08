package luna.Command;

public class IsCommand {
    public static boolean Check(String messageContent, String command) {
        return messageContent.startsWith("!" + command);
    }
}
