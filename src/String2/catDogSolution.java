/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

package String2;

public class catDogSolution {
    public static boolean catDog(String str) {
        int catCounter = 0;
        int dogCounter = 0;
        // Iterating over the string and counting the number of cat and dog in the string
        for(int i = 0; i< str.length()-2; i++){
            if(str.substring(i, i+3).equals("cat")) catCounter++;
            if(str.substring(i, i+3).equals("dog")) dogCounter++;
        }
        if(catCounter == dogCounter) return true;
        else return false;

    }
    public static void main(String[] args) {
        System.out.println(catDog("1cat1cadodog"));

    }
}
