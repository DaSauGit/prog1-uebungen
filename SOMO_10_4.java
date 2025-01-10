import java.util.Scanner;
import java.util.regex.*;

public class SOMO_10_4 {

    private static final Scanner EINGABE = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bitte gib eine Uhrzeit mit dem Format hh:mm ein!");
        String uhrzeit = EINGABE.next();
        System.out.println(Pattern.matches("(([01]\\d)|(2[0-3])):[0-5]\\d", uhrzeit));
    }
}
