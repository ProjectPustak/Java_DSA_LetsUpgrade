import java.util.Scanner;

public class Qus4 {
    public static void main(String[] args) {
        //Skip Even Numbers Half Pyramid
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j += 2) {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
