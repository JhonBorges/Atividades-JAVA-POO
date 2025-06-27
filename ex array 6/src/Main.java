import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai digitar? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] sum = new int[n];

        System.out.println("VALORES A: ");
        for (int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("VALORES B: ");
        for (int i = 0; i < vectB.length; i++){
            vectB[i] = sc.nextInt();
        }

        System.out.println("A SOMA DOS RESULTANTES");

        for (int i = 0; i < sum.length; i++){
            sum[i] = vectA[i] + vectB[i];
            System.out.println(sum[i]);
        }

        sc.close();
    }
}