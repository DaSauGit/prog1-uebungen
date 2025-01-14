package aufgabe6;

import java.io.PrintWriter;

public class HtmlFormat {
    public static void ausgeben(PrintWriter writer, String[] name, LeistungsListe leistung) {
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"de\">");
        writer.println("<head>");
        writer.println("<meta charset=\"utf-8\">");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
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
                if (!l.istBestanden()) {
                    writer.print("<tr><td style=\"color:red\">" + l.getFach() + "</td><td>L</td><td>nicht ausreichend " + l.getNote() + "</td></tr>\n");
                } else {
                    writer.print("<tr><td>" + l.getFach() + "</td><td>L</td><td>" + l.getNote() + "</td></tr>\n");
                }
            } else {
                if (!l.istBestanden()) {
                    writer.print("<tr><td style=\"color:red\">" + l.getFach() + "</td><td>S</td><td>nicht bestanden</td></tr>\n");
                } else {
                    writer.print("<tr><td>" + l.getFach() + "</td><td>S</td><td>bestanden</td></tr>\n");
                }
            }


            writer.println("</tr>");
        }
        writer.println("</table>");
        writer.println("<hr>");
        writer.println("L = Leistungsnachweis, S = Schein");
        writer.println("</body>");
        writer.println("</html>");
    }
}
