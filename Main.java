import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account account = new Account("Arafur Rahman-Ariyan");
        System.out.println(account.getUsername());
    }
}
