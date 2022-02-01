package ProperCaseOpgave5;

public class ProperCase {

    public String properCase (String string){
        String newString = "";
        String[] stringToArray = string.split(" ");

        for (int i = 0; i < stringToArray.length; i++) {
            if (stringToArray[i] == stringToArray[i].toUpperCase()) {

            } else if (stringToArray[i].length() <= 3){
                stringToArray[i] = stringToArray[i].toLowerCase();

            } else{
                stringToArray[i] = stringToArray[i].toLowerCase();
                stringToArray[i] = stringToArray[i].substring(0,1).toUpperCase() + stringToArray[i].substring(1);
            }

            newString = newString + stringToArray[i] + " ";
        }
        return newString;
    }


        public static void main(String[] args) {
            ProperCase properCaseMain = new ProperCase();

            String test = "HEJ jeg HEDDEr Adam";

            String completeSentence = properCaseMain.properCase(test);
            System.out.println(completeSentence);

        }
}
