import java.util.Scanner;

public class SOMO_10_4 {
private static final Scanner EINGABE = new Scanner(System.in);

    public static void main(String[] args) {
        boolean istZeit;
        System.out.println("Bitte gib eine Uhrzeit mit dem Format hh:mm ein!");
        String uhrzeit = EINGABE.next();

        char c1 = uhrzeit.charAt(0);
        char c2 = uhrzeit.charAt(1);
        char c3 = uhrzeit.charAt(2);
        char c4 = uhrzeit.charAt(3);
        char c5 = uhrzeit.charAt(4);

        String h = "" + c1 + c2;
        String m = "" + c4 + c5;

        Integer stunde = Integer.valueOf(h);
        int minute = Integer.parseInt(m);
        char zeichen = c3;

        if (stunde < 24 && stunde >= 0) {
            if (minute < 60 && minute >= 0) {
                if (zeichen ==':') {
                    istZeit = true;
                } else{
                    istZeit = false;
                }
            } else{
                istZeit = false;
            }
        } else{
            istZeit = false;
        }
        System.out.println(istZeit);
    }
}
