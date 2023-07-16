import java.util.Scanner;

public class Qus9 {
    public static void main(String[] args) {
        //Summation Game
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
