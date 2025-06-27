import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double passo1;
        double passo2;
        double passo3;
        double media = 0;
        double soma = 0;

        for (int i = 1; i <= N; i++) {
            passo1 = sc.nextDouble();
            passo2 = sc.nextDouble();
            passo3 = sc.nextDouble();
            media = (passo1 * 2.0 + passo2 * 3.0 + passo3 * 5.0) / 10;
            System.out.println(media);
        }

        sc.close();
    }
}