import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num: ");
        int n = sc.nextInt();


        for (int i = 0; i <arr.length ; i++) {
            if(n==arr[i]){
                System.out.println("The Index is in "+i + "th Position");
            }
        }
    }
}
