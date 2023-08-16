import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int [] arr = {5, -2, 3 , 1, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int b = sc.nextInt();
        int n = arr.length;
        int sum = 0 ;

        for (int i = 0 ; i < b;i++){
            sum += arr[i];
        }

        int ans = sum;

        int out = b-1;
        int in = n-1;

        while (out>=0){
            sum = sum-arr[out]+arr[in];
            ans = Math.max(ans,sum);
            out--;
            in--;
        }
        System.out.println("The Sum is: "+ans);




    }
}
