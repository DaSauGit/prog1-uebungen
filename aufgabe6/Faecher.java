package aufgabe6;

public class Faecher {
    private final String[] FAECHER = new String[] {"Digitaltechnik", "Softwaremodellierung", "Algebra", "Programmiertechnik"};
    public boolean istZulaessig(String fach) {
        for (String faecher : FAECHER) {
            if (fach == faecher) {
               return true; 
            }
        }
        return false;
    }
}
