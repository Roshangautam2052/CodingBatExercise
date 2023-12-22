/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */


package Logic2;

public class makeChocolate {
    public static int  makeChocolateFunction(int small, int big, int goal){
        int remainder = goal/5;
        if(remainder>=big) remainder = big;
        if(small>= goal - remainder*5) return goal-remainder*5;
        return -1;
    }
    public static void main(String[]args){
        //Testing for the values of small, big and goal
        System.out.println(makeChocolateFunction(4,1,9));

    }
}
