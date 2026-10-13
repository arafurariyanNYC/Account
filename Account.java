import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Account {
    private String username;

    public Account(String requestedName) throws FileNotFoundException {
        if (isAvailable(requestedName)) {
            username = requestedName;
        } else {
            throw new FileNotFoundException("Username not available");
        }
    }

    public String getUsername() {
        return username;
    }

    public static boolean isAvailable(String str) throws FileNotFoundException {
        File f = new File("usernames.txt");
        java.util.Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            if (s.nextLine().equals(str))
                return false;
        }
        return true;
    }
}

