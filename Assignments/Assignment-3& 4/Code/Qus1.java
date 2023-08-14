import java.util.Scanner;

public class Qus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String stars = "";
        for (int i = 0; i < N; i++) {
            stars += "*";
        }
        System.out.println(stars);
    }
}