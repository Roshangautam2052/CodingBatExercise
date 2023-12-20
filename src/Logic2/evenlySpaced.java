/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

package Logic2;

public class evenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
        int medium =0;
        if(a ==b && b==c) return true;
        else if(a<b && a>c || a>b && a<c) {
            medium = a;
            return (Math.abs(medium-b)== Math.abs(medium-c));
        }
        else if(b<a && b>c || b>a && b<c) {
            medium = b;
            return (Math.abs(medium-a)== Math.abs(medium-c));
        }
        else if(a==b|| b==c || a==c ) return false;
        medium=c;
        return (Math.abs(medium-a)== Math.abs(medium-b));
    }

    public static void main(String[] args) {
        boolean value = evenlySpaced(2, 4, 6);
        System.out.println(value);
    }
}
