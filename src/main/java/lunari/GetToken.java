package lunari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetToken {
    public String main() throws FileNotFoundException {
        File myObj = new File(GetExecutionPath()+"/token.txt");
        Scanner myReader = new Scanner(myObj);
        return myReader.nextLine();
    }
    private static String GetExecutionPath(){
        String absolutePath = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        absolutePath = absolutePath.substring(0, absolutePath.lastIndexOf("/"));
        absolutePath = absolutePath.replaceAll("%20"," ");
        return absolutePath;
    }
}