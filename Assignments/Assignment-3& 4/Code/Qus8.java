import java.util.Scanner;

public class Qus8 {
    public static void main(String[] args) {
        //Odd Game 1
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i += 2) {
            System.out.print(i + " ");
        }
    }
}
