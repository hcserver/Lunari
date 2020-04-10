package lunari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetToken {
    public String main() throws FileNotFoundException {
        String executionPath = System.getProperty("user.dir");
        File tokenFile = new File(executionPath+File.separator+"token.txt");
        try(Scanner myReader = new Scanner(tokenFile)) {
            return myReader.nextLine();
        }
    }
}