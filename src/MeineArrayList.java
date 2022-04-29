/**
 * a very simplified version of java.util.ArrayList
 *
 * @param <E>
 */

public class MeineArrayList<E> {
    private E[] list;
    private int size;
    private int capacity;
    private int increment;

    /**
     * constructs a MeineArrayList-Object with initial capacity c
     * and increment inc
     *
     * @param c   the initial capacity
     * @param inc the number of positions that will be added
     *            when the list is made bigger
     */
    public MeineArrayList(int c, int inc) {
        capacity = c;
        list = (E[]) new Object[c];
        size = 0;
        increment = inc;
    }

    /**
     * Methode um die aktuelle verwendete Kapazität der MeineArrayList zu erhalten.
     * @return die verwendete Kapazität der MyArrayList
     */
    public int getSize() {
        return size;
    }

    /**
     * Methode um die aktuelle Kapazität der MeineArrayList zu erhalten.
     * @return die Kapazität der MyArrayList
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Methode um das an Index i gespeicherte Objekt abzurufen.
     * @param i der Index des Objektes
     * @return das Objekt
     */
    public Object get(int i) {
        return list[i];
    }

    /**
     * Methode um ein Element zur MeineArrayList hinzuzufügen.
     * @param e das Element welches hinzugefügt werden soll
     */
    public void add(E e) {
        // Check ob die MeineArrayList voll ist.
        // Ist sie voll, wird das interne Array gegen ein neues ersetzt,
        // welches um increment größer ist als das alte Array
        if(this.size == this.capacity) {
            E[] newList = (E[]) new Object[this.capacity + this.increment];
            // Befüllen des neuen Arrays
            for(int i = 0; i < this.size; i++) {
                newList[i] = (E) this.get(i);
            }
            this.list = newList;
            this.capacity = newList.length;
        }
        // Das neue Element hinzufügen und size anpassen
        this.list[size] = e;
        this.size++;
    }

    /**
     * Methode um ein Element aus der MeineArrayList zu entfernen.
     * @param e das zu entfernende Element
     */
    public void remove(E e) {
        if (this.size > 0) {
            // Iteration über das Array
            // Wenn das abgerufene Element gleich e ist, so werden die nachfolgenden Indexpositionen
            // bis einschl. des vorletzten Elements um eine Stelle "nach links" gerückt.
            for (int i = 0; i < this.size; i++) {
                if(this.list[i].equals(e)) {
                    for(int j = i; i < this.size-1; i++) {
                        this.list[i] = this.list[i+1];
                    }
                    // das letzte Element des Arrays wird 'manuell' gelöscht
                    this.list[size-1] = null;
                }
            }
            // size anpassen
            this.size--;
            // Wird der Inhalte der MeineArrayList um mehr als increment verkleinert,
            // so wird das interne Array ausgetauscht
        }
    }

    /**
     * Methode um alle Elemente der MeineArrayList zu löschen.
     * Alle Inhalte werden gelöscht und die Größe der MeineArrayList auf increment zurückgesetzt.
     */
    public void removeAll() {
        this.list = (E[]) new Object[increment];
        this.size = 0;
    }

    /**
     * Methode um eine MeineArrayList als String auszugeben.
     * @return die MeineArrayList als String
     */
    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for(int i = 0; i < this.size; i++) {
            if (this.list[i] != null) {
                returnString.append(this.list[i].toString()).append(", ");
            }
        }
        return returnString.toString();
    }

}