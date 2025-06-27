import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual valor vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double mediaVetor = soma / n;
        System.out.printf("MEDIA VETOR: %.3f%n", mediaVetor);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < mediaVetor) {
                System.out.printf("%.1f", vect[i]);
            }
        }

        sc.close();
    }
}