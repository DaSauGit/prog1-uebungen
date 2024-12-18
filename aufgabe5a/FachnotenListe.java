package aufgabe5a;

// IntList.java

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * IntList verwaltet ganze Zahlen als Liste.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 17.7.2024
 */
public final class FachnotenListe {
    private Element head;

    /**
     * Legt eine leere Liste an.
     * Der heimliche Parameter this verweist auf das neu allokierte Objekt.
     */
    public FachnotenListe() {
        this.head = null;
    }

    /**
     * F&uuml;gt eine Zahl am Listenanfang ein.
     * Der heimliche Parameter this verweist auf das Objekt des Aufrufs.
     * @param n die einzuf&uuml;gende Zahl
     * @return die Liste
     */
    public FachnotenListe insert(/* final IntList this, */ Fachnote n) {
        this.head = new Element(this.head, n);
        return this;
    }

    /**
     * Element speichert eine einzelne Zahl als Teil einer Liste.
     * Beipiel f&uuml;r eine statisch eingebettete Klasse.
     */
    private static final class Element {
        private final Element next;
        private final Fachnote n;

        private Element(/* final Element this, */ Element e, Fachnote n) {
            this.next = e;
            this.n = n;
        }
    }

    /**
     * Iterator speichert den aktuellen Zustand einer Listeniteration.
     * Beipiel f&uuml;r eine innere Klasse.
     */
    public final class Iterator {
        // private IntList IntList.this;
        private Element current = FachnotenListe.this.head;

        /**
         * pr&uuml;t, ob das Listenende erreicht ist.
         * Der heimliche Parameter this verweist auf das Objekt des Aufrufs.
         * @return false, wenn das Listenende erreicht ist, sonst true.
         */
        public boolean hasNext(/* final Iterator this */) {
            return this.current != null;
        }

        /**
         * liefert die aktuelle Zahl und iteriert zum n&auml;chsten Jahr.
         * Aufruf am Listenende liefert NoSuchElementException.
         * Der heimliche Parameter this verweist auf das Objekt des Aufrufs.
         * @return die aktuelle Zahl
         */
        public Fachnote next(/* final Iterator this */) {
            if (this.current == null) {
                throw new NoSuchElementException();
            }

            Element e = this.current;
            this.current = this.current.next;
            return e.n;
        }
    }
    /**
     *  Methode Iterator.
     * @return Scanner
     */
    public Scanner iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented"
                                            + " method 'Iterator'");
    }
}


