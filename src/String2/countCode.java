/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

package String2;

public class countCode {
    public static int countCodeSolution(String str){
        int count = 0;
        String value = new String();
        for(int i = 0; i<=str.length()-4;i++){
            value = str.substring(i, i+4);
            if(value.startsWith("co")&& value.endsWith("e")){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countCodeSolution("cozfxxcope"));

    }
}
