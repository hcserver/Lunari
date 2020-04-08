package lunari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetToken {
    public String main() throws FileNotFoundException {
        File myObj = new File("C:/Workspace/Lunari/src/main/resources/token.txt");
        Scanner myReader = new Scanner(myObj);
        return myReader.nextLine();
    }
}