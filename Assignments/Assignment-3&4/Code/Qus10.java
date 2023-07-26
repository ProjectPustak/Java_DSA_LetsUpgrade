import java.util.Scanner;

public class Qus10 {
    //From down to top
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
