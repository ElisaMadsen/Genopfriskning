package ArrayListOpgave1;

import java.util.ArrayList;

public class ArrayListAssignment {

    public boolean doesArraylistContainString (ArrayList<String> array, String string){

        for (String strings : array ) {
            if (string == strings ){
                System.out.println("String has been found");

            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayListAssignment x = new ArrayListAssignment();

        ArrayList<String> hej = new ArrayList<>();

        hej.add("Hej");
        hej.add("Bye");

        x.doesArraylistContainString(hej, "Bye");
    }

}
