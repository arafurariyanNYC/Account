
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account account = new Account("Luis-Cruz");
        System.out.println(account.getShortenedName());
        account = new Account("Arafur Rahman-Ariyan");
        System.out.println(account.getShortenedName());
        account = new Account("Syed-Ali");
        System.out.println(account.getShortenedName());
    }
}