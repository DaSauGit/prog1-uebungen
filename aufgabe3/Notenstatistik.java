// Notenstatistik.java
package aufgabe3;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Daniel Sauer
 * @version 12.11.24
 */
public final class Notenstatistik {
    private Notenstatistik() {
    }

    private static final Scanner EINGABE = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);

        int beruecksichtigt = 0;
        int bestandene = 0;
        double beste = 6.0;
        double schlechteste = 0.0;
        double alleNoten = 0.0;
        double durchBestandene = 0.0;
        System.out.println("Noten Ganze,Zehntel oder Ganze.Zehntel eingeben "
                + "(Ende mit Strg-D/Strg-Z):");

        while (EINGABE.hasNext()) {
            String note = EINGABE.next();

            if (note.length() != 3) {
                System.out.printf("Note %s wird wegen Formatfehler"
                                + " ignoriert!%n", note);
            } else {
                char c1 = note.charAt(0);
                char c2 = note.charAt(1);
                char c3 = note.charAt(2);

                if (c2 != ',' && c2 != '.') {
                        System.out.printf("Note %s wird wegen Formatfehler"
                                        + " ignoriert!%n", note);
                        break;
                }
                if (!Character.isDigit(c1) && !Character.isDigit(c3)) {
                    System.out.printf("Note %s wird wegen Formatfehler"
                                            + " ignoriert!%n", note);
                    // break;
                }
                switch (c1) {
                case '1', '2', '3':
                    switch (c3) {
                    case '0', '3', '7':
                        String speicher1 = c1 + "." + c3;
                        double speicher = Double.parseDouble(speicher1);
                        bestandene++;
                        durchBestandene = durchBestandene + speicher;
                        break;
                    default:
                        System.out.printf("Note %s wird wegen "
                                       + "Nachkommastelle %c ignoriert!%n",
                                       note, c3);
                    }
                    break;

                case '4':
                    
                    if (c3 != '0') {
                        System.out.printf("Note %s wird wegen "
                                        + "Nachkommastelle %c ignoriert!%n",
                                        note, c3);
                        
                    } else {
                        String speicher1 = c1 + "." + c3;
                        double speicher = Double.parseDouble(speicher1);
                        bestandene++;
                        durchBestandene = durchBestandene + speicher;
                    }
                    break;
                case '5':
                    if (c3 != '0') {
                        System.out.printf("Note %s wird wegen "
                                        + "Nachkommastelle %c ignoriert!%n",
                                        note, c3);
                        
                    }
                    break;
                default:
                    System.out.printf("Note %s wird wegen Vorkommastelle"
                                    + " %c ignoriert!%n", note, c1);
                    break;
                }
                String speicher1 = c1 + "." + c3;
                double speicher = Double.parseDouble(speicher1);
                beruecksichtigt++;
                alleNoten = alleNoten + speicher;
                if (beste > speicher) {                        
                    beste = speicher; 
                }
                if (schlechteste < speicher) {
                    schlechteste = speicher;
                }
            }

        }
        System.out.println("");
        System.out.printf("Anzahl beruecksichtigter Noten: %d%n",
                        beruecksichtigt);
        System.out.printf("Anzahl Bestandene: %d%n", bestandene);
        if (beruecksichtigt != 0) {
            System.out.printf("Beste Note: %.1f%n", beste);
            System.out.printf("Schlechteste Note: %.1f%n", schlechteste);
            System.out.printf("Durchschnitt Bestandene: %.1f%n", durchBestandene
                            / bestandene);
            System.out.printf("Durchfallquote: %.1f%% %n", 100.0
                            * (beruecksichtigt - bestandene) / beruecksichtigt);
        }

    }
}