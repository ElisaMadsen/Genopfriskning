package SearchingOpgave7;

public class Searching {

    public int searchForString(String[] stringArray, String string) {

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equalsIgnoreCase(string)) {
            int index = i;
            return index;
         }
        }

        return -1;
    }

    public static void main(String[] args) {
        Searching searching = new Searching();

        String[] names = {"Elisa", "Laura", "Sara", "Søs"};
        String name = "mussemor";

        int x = searching.searchForString(names, name);
        System.out.println(x);

    }
}

