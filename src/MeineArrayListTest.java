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
        testList.add("Maria");
        testList.add("Joseph");
        testList.add("Jesus");
        testList.add("Eva");
        assertEquals(4, testList.getSize());
        assertEquals(13, testList.getCapacity());
        System.out.println("Inhalt des Arrays: " + testList.toString());
        System.out.println("Anzahl der Array-Elemente:\t\tSoll = 4\tIst = " + testList.getSize());
        System.out.println("Array-Groesse:\t\t\t\tSoll = 13\tIst = " + testList.getCapacity());      
    }

    @Test
    public void testRemove() {
        System.out.println("\ntestRemoveEntry()");
        testList.add("Maria");
        testList.add("Joseph");
        testList.add("Jesus");
        testList.add("Eva");
        testList.add("Judas");
        System.out.println("Anzahl der Array-Elemente vor dem Loeschen: " + testList.getSize());
        System.out.println("Inhalt des Arrays vor dem Loeschen: " + testList.toString());
        System.out.println("Geloescht wird Element 3."); 
        testList.remove(3);
        assertEquals(4, testList.getSize());
        System.out.println("Anzahl der Array-Elemente nach dem Loeschen: " + testList.getSize());
        System.out.println("Inhalt des Arrays nach dem Loeschen: " + testList.toString());
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

