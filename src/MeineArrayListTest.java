import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MeineArrayListTest {

    MeineArrayList testList = new MeineArrayList(13, 2);

    @Test
    public void getsizeMyArrayList() {
        MeineArrayList ml = new MeineArrayList(10, 3);
        assertEquals(0, ml.getSize(),"Size wrong");
    }
    @Test
    public void getcapacityMyArrayList() {
        MeineArrayList ml = new MeineArrayList(10, 3);
        assertEquals(10, ml.getCapacity(),"capacity wrong");
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

    @Test
    public void logtest() {
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");

        log(testList, "hello");

    }

    @Test
    public void testadd() {
        System.out.println("\ntestadd()");
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

    @Test
    public void testAddResize() {
        System.out.println("\ntestadd()");
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

    @Test
    public void testRemove() {
        log("\ntestRemoveEntry()");
        MeineArrayList removeTestList = new MeineArrayList<>(10, 2);
        String Maria = "Maria";
        String Joseph = "Joseph";
        String Jesus = "Jesus";
        String Eva = "Eva";
        String Judas = "Judas";

        removeTestList.add(Maria);
        removeTestList.add(Joseph);
        removeTestList.add(Jesus);
        removeTestList.add(Eva);
        removeTestList.add(Judas);

        log(removeTestList);

        log("Anzahl der Array-Elemente vor dem Loeschen: " + removeTestList.getSize());
        log("Inhalt des Arrays vor dem Loeschen: " + removeTestList);
        log("Geloescht wird Element 'Maria'.");
        removeTestList.remove(Maria);
        assertEquals(4, removeTestList.getSize());
        System.out.println("Anzahl der Array-Elemente nach dem Loeschen: " + removeTestList.getSize());
        System.out.println("Inhalt des Arrays nach dem Loeschen: " + removeTestList);
    }

    @Test
    public void removeAll() {
        System.out.println("\ntestRemoveAll()");
        testList.add("Maria");
        testList.add("Joseph");
        testList.add("Jesus");
        System.out.println("Inhalt des Arrays vor dem Loeschen: " + testList.toString());
        testList.removeAll();
        assertEquals(0, testList.getSize());
        System.out.println("Inhalt des Arrays nach dem Loeschen: " + testList.toString());
    }

    @Test
    public void testget() {
        System.out.println("\ntestget()");
        testList.add("Maria");
        testList.add("Joseph");
        testList.add("Jesus");
        assertEquals("Jesus", testList.get(2));
        System.out.println("Inhalt des Arrays: " + testList.toString());
        System.out.println("Abgefragt wird Element 2.\t\tSoll-Wert = \"Jesus\" Ist-Wert \"" + testList.get(2) + "\"");
    }

    @Test
    public void testGetSize() {
        System.out.println("\ntestGetSize()");
        testList.add("Maria");
        testList.add("Joseph");
        testList.add("Jesus");
        assertEquals(3, testList.getSize());
        System.out.println("Inhalt des Arrays: " + testList.toString());
        System.out.println("Anzahl der Array-Elemente:\t\tSoll = 3\tIst = " + testList.getSize());
    }
}

