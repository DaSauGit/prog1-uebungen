package aufgabe6;

import java.io.PrintWriter;

/**
 * The HtmlFormat class is responsible for generating
 * an HTML representation
 * of a performance list, including student names and
 * their corresponding grades.
 * The output is written to the provided PrintWriter
 * object in a structured HTML format.
 */
abstract class HtmlFormat {
    /**
     * Generates an HTML report of grades and outputs
     * it using the specified
     * PrintWriter. The report includes the subject,
     * type of grade evaluation
     * (Leistungsnachweis or Schein), and the grade or
     * result for each entry
     * in the provided LeistungsListe.
     *
     * @param writer the PrintWriter used to output
     *               the generated HTML
     * @param name an array of names associated with
     *             the report
     * @param leistung the LeistungsListe object
     *                 containing the performance entries
     */
    public static void ausgeben(PrintWriter writer, String[] name,
                                LeistungsListe leistung) {
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"de\">");
        writer.println("<head>");
        writer.println("<meta charset=\"utf-8\">");
        writer.println("<meta name=\"viewport\" content=\"width=device-width"
                + ", initial-scale=1.0\">");
        writer.println("<style>");
        writer.println("table { width:100%; }");
        writer.println("th { text-align:left; }");
        writer.println("</style>");
        writer.println("<title>Notenspiegel</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Notenspiegel f&uuml;r");
        for (String n : name) {
            writer.println(n);
        }
        writer.println("</h1>");
        writer.println("<hr>");
        writer.println("<table>");
        writer.print("<tr>");
        writer.print("<th>Fach:</th>");
        writer.print("<th>Art:</th>");
        writer.print("<th>Note:</th>");
        writer.print("</tr>");
        for (Leistung l : leistung) {
            //Art
            //benotung
            if (l.istBenotet()) {
                switch (l.getNote()) {
                case "1,0", "1,3", "1,5":
                    writer.print("<tr><td>" + l.getFach()
                            + "</td><td>L</td><td>sehr gut ("
                            + l.getNote() + ")</td></tr>\n");
                    break;
                case "1,7", "2,0", "2,3", "2,5":
                    writer.print("<tr><td>" + l.getFach()
                            + "</td><td>L</td><td>gut (" + l.getNote()
                            + ")</td></tr>\n");
                    break;
                case "2,7", "3,0", "3,3", "3,5":
                    writer.print("<tr><td>" + l.getFach()
                            + "</td><td>L</td><td>befriedigend ("
                            + l.getNote() + ")</td></tr>\n");
                    break;
                case "3,7", "4,0":
                    writer.print("<tr><td>" + l.getFach()
                            + "</td><td>L</td><td>ausreichend ("
                            + l.getNote() + ")</td></tr>\n");
                    break;
                default:
                    writer.print("<tr><td style=\"color:red\">"
                        + l.getFach() + "</td><td>L</td><td>nicht ausreichend ("
                        + l.getNote() + ")</td></tr>\n");
                    break;
                }
            } else {
                if (!l.istBestanden()) {
                    writer.print("<tr><td style=\"color:red\">"
                            + l.getFach() + "</td><td>S</td><td>nicht "
                            + " bestanden</td></tr>\n");
                } else {
                    writer.print("<tr><td>" + l.getFach()
                            + "</td><td>S</td><td>bestanden</td></tr>\n");
                }
            }
        }
        writer.println("</table>");
        writer.println("<hr>");
        writer.println("L = Leistungsnachweis, S = Schein");
        writer.println("</body>");
        writer.println("</html>");
    }
}
