// IntList.java
package aufgabe6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * IntList verwaltet ganze Zahlen als Liste.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 17.7.2024
 */
public final class LeistungsListe implements Iterable<Leistung> {
    private Element head;

    /**
     * Legt eine leere Liste an.
     */
    public LeistungsListe() {
        this.head = null;
    }

    /**
     * F&uuml;gt eine Zahl am Listenanfang ein.
     * @param n die einzuf&uuml;gende Zahl
     * @return die Liste
     */
    public LeistungsListe insert(Leistung n) {
        this.head = new Element(this.head, n);
        return this;
    }

    /**
     * Element speichert eine einzelne Zahl als Teil einer Liste.
     * Beipiel f&uuml;r eine statisch eingebettete Klasse.
     */
    private static final class Element {
        private final Element next;
        private final Leistung n;

        private Element(Element e, Leistung n) {
            this.next = e;
            this.n = n;
        }
    }

    @Override
    public Iterator<Leistung> iterator() {
        // Beispiel fuer eine anonyme lokale Klasse
        return new Iterator<Leistung>() {
            private Element current = LeistungsListe.this.head;

            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public Leistung next() {
                if (this.current == null) {
                    throw new NoSuchElementException();
                }

                Element e = this.current;
                this.current = this.current.next;
                return e.n;
            }
        };
    }
}

