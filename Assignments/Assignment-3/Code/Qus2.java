import java.util.Scanner;

public class Qus2 {
    public static void main(String[] args) {
        //Print a matrix of stars
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
