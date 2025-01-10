package aufgabe6;

public class Faecher {
    private static final String[] FAECHER = new String[] {"Digitaltechnik", "Softwaremodellierung", "Algebra", "Programmiertechnik"};
    public static boolean istZulaessig(String fach) {
        for (String faecher : FAECHER) {
            if (fach.equals(faecher)) {
               return true; 
            }
        }
        return false;
    }
}
