package aufgabe6;

/**
 * This class represents a collection of predefined subjects
 * and provides functionality to check the validity of a subject.
 */
abstract class Faecher {
    private static final String[] FAECHER = new String[]{"Digitaltechnik",
        "Softwaremodellierung", "Algebra", "Programmiertechnik"};

    /**
     * Checks whether a given subject is permissible based
     * on the predefined list of subjects.
     *
     * @param fach the name of the subject to check
     * @return true if the subject is permitted,
     * false otherwise
     */
    public static boolean istZulaessig(String fach) {
        for (String faecher : FAECHER) {
            if (fach.equals(faecher)) {
                return true;
            }
        }
        return false;
    }
}
