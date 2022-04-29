public class MeineArrayListTester {
    public static void main(String[] args) {
        String a = "Hallo";
        String b = "Welt";

        MeineArrayList testList = new MeineArrayList(4, 2);
        log("Capacity:", testList.getCapacity());
        log("Size:", testList.getSize());

        testList.add(a);
        log("Capacity:", testList.getCapacity());
        log("Size:", testList.getSize());
        log(testList.toString());
        testList.add(b);
        log("Capacity:", testList.getCapacity());
        log("Size:", testList.getSize());
        log(testList.toString());

        log(testList.get(0));
        log(testList.get(1));
    }

    /**
     * Helper method to make logging a bit easier.
     *
     * @param output One of multiple objects to print out.
     */
    public static void log(Object... output) {
        StringBuilder logString = new StringBuilder();

        for (Object element : output) {
            logString.append(" ").append(element.toString());
        }
        System.out.println(logString);
    }
}
