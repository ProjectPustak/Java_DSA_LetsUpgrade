public class Question1 {
    public static void main(String[] args) {
        //Problem Description:
        /*
        Given a number A, we need to find the sum of its digits using recursion.
       */

        System.out.println("The Digit Sum is: "+Digit_Sum(345));

    }
    static int Digit_Sum(int n){

        if(n == 0){
            return 0;
        }

        int sum = Digit_Sum(n/10) +n%10;
        return sum;





    }
}