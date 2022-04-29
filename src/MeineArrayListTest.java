import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester-Klasse für MeineArrayList.
 * @author Kevin Kurt (s76004@bht-berlin.de), Jan Zimmermann (s79873@bht-berlin.de), Alexander Mavrin (s53615@bht-berlin.de)
 * @version 1.0
 */
public class MeineArrayListTest {
    /**
     * Eine Beispiel-MeineArrayList.
     */
    MeineArrayList testList = new MeineArrayList(13, 2);

    /**
     * Test-Methode für die Methode egtSize().
     */
    @Test
    public void getSizeTest() {
        MeineArrayList ml = new MeineArrayList(10, 3);
        assertEquals(0, ml.getSize(), "Size wrong");
    }

    /**
     * Test-Methode für die Methode getCapacity().
     */
    @Test
    public void getCapacityTest() {
        MeineArrayList ml = new MeineArrayList(10, 3);
        assertEquals(10, ml.getCapacity(), "capacity wrong");
    }

    /**
     * Helper Methode um Logging zu vereinfachen.
     *
     * @param output eines oder mehrere Objekte die ausgegeben werden sollen.
     */
    public static void log(Object... output) {
        StringBuilder logString = new StringBuilder();

        for (Object element : output) {
            logString.append(" ").append(element.toString());
        }
        System.out.println(logString);
    }

    /**
     * Test-Methode für die Methode log().
     */
    @Test
    public void logTest() {
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");

        log(testList, "hello");

    }

    /**
     * Test-Methode für die Methode add().
     */
    @Test
    public void testAdd() {
        log("\ntestadd()");
        MeineArrayList addTestList = new MeineArrayList<>(10, 2);
        addTestList.add("Maria");
        addTestList.add("Joseph");
        addTestList.add("Jesus");
        addTestList.add("Eva");
        assertEquals(4, addTestList.getSize());
        assertEquals(10, addTestList.getCapacity());
        log("Inhalt des Arrays: " + addTestList);
        log("Anzahl der Array-Elemente:\t\tSoll = 4\tIst = " + addTestList.getSize());
        log("Array-Groesse:\t\t\t\tSoll = 13\tIst = " + addTestList.getCapacity());
    }

    /**
     * Test-Methode für die Methode add() mit Vergrößerung der MeineArrayList.
     */
    @Test
    public void testAddResize() {
        log("\ntestadd()");
        MeineArrayList addTestList = new MeineArrayList<>(2, 2);
        addTestList.add("Maria");
        addTestList.add("Joseph");
        assertEquals(2, addTestList.getSize());
        assertEquals(2, addTestList.getCapacity());
        addTestList.add("Jesus");
        assertEquals(3, addTestList.getSize());
        assertEquals(4, addTestList.getCapacity());
        log("Inhalt des Arrays: " + addTestList);
        log("Anzahl der Array-Elemente:\t\tSoll = 3\tIst = " + addTestList.getSize());
        log("Array-Groesse:\t\t\t\tSoll = 4\tIst = " + addTestList.getCapacity());
    }

    /**
     * Test-Methode für die Methode remove().
     */
    @Test
    public void testRemove() {
        log("\ntestRemoveEntry()");
        MeineArrayList removeTestList = new MeineArrayList<>(10, 2);
        String maria = "Maria";
        String joseph = "Joseph";
        String jesus = "Jesus";
        String eva = "Eva";
        String judas = "Judas";

        removeTestList.add(maria);
        removeTestList.add(joseph);
        removeTestList.add(jesus);
        removeTestList.add(eva);
        removeTestList.add(judas);

        log(removeTestList);

        log("Anzahl der Array-Elemente vor dem Loeschen: " + removeTestList.getSize());
        log("Inhalt des Arrays vor dem Loeschen: " + removeTestList);
        log("Geloescht wird Element 'Maria'.");
        removeTestList.remove(maria);
        assertEquals(4, removeTestList.getSize());
        log("Anzahl der Array-Elemente nach dem Loeschen: " + removeTestList.getSize());
        log("Inhalt des Arrays nach dem Loeschen: " + removeTestList);
    }

    /**
     * Test-Methode für die Methode removeAll().
     */
    @Test
    public void removeAll() {
        System.out.println("\ntestRemoveAll()");
        testList.add("Maria");
        testList.add("Joseph");
        testList.add("Jesus");
        log("Inhalt des Arrays vor dem Loeschen: " + testList.toString());
        testList.removeAll();
        assertEquals(0, testList.getSize());
        log("Inhalt des Arrays nach dem Loeschen: " + testList.toString());
    }

    /**
     * Test-Methode für die Methode get().
     */
    @Test
    public void testGet() {
        System.out.println("\ntestGet()");
        testList.add("Maria");
        testList.add("Joseph");
        testList.add("Jesus");
        assertEquals("Jesus", testList.get(2));
        log("Inhalt des Arrays: " + testList);
        log("Abgefragt wird Element 2.\t\tSoll-Wert = \"Jesus\" Ist-Wert \"" + testList.get(2) + "\"");
    }

    /**
     * Test-Methode für die Methode getSize().
     */
    @Test
    public void testGetSize() {
        log("\ntestGetSize()");
        testList.add("Maria");
        testList.add("Joseph");
        testList.add("Jesus");
        assertEquals(3, testList.getSize());
        log("Inhalt des Arrays: " + testList.toString());
        log("Anzahl der Array-Elemente:\t\tSoll = 3\tIst = " + testList.getSize());
    }
}

