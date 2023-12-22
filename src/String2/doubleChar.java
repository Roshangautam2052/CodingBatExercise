/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

package String2;

public class doubleChar {
    public  static String doubleCharSolution(String str){
        // Defining an empty String
        String duplicate ="";
        for(int i = 0; i< str.length(); i++){
            // taking each character --> converting it into string and then concatenating with the empty string
            duplicate += String.valueOf(str.charAt(i))+ String.valueOf(str.charAt(i));
        }
        return duplicate;


    }
    public static void main(String[] args) {
        System.out.println(doubleCharSolution("The"));

    }
}
