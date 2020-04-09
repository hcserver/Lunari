# Lunari
Discord bot made with javacord in gradle, JDK 14
# Setup
First you need to change the location of the token in
```
src/main/java/lunari/GetToken.java
```

```java
package lunari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetToken {
    public String main() throws FileNotFoundException {
        File myObj = new File("=====THE LOCATION OF TOKEN HERE!=====");
        Scanner myReader = new Scanner(myObj);
        return myReader.nextLine();
    }
}
```
