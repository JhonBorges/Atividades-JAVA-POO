import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double x = sc.nextDouble();
        double resultado = 3.14159 * Math.pow(x, 2);

        System.out.printf("O resultado é: %.4f", resultado);

        sc.close();

    }
}