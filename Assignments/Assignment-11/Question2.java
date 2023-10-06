public class Question2 {
    public static void main(String[] args) {
        //Write a program to find the factorial of the given number A using recursion.
        System.out.println(factorial(3));
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }

        int fact1 = factorial(n-1);
        int fn = fact1*n;
        return fn;





    }
}
