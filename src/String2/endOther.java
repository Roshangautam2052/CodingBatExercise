package String2;

public class endOther {
    public static boolean endOtherSolution(String a, String b){
        String aCopy = a.toLowerCase();
        String bCopy = b.toLowerCase();
        if(aCopy.endsWith(bCopy) || bCopy.endsWith(aCopy)) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(endOtherSolution("Hiabc", "abc"));

    }
}
