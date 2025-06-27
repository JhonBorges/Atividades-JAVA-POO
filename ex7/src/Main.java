import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double rest = x % 2;

        if (rest == 0) {
            System.out.println("Esse numero é par");
        }
        else {
            System.out.println("Esse numero impar");
        }

        sc.close();

    }
}