import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int arm = 0;
        int cont = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] > arm){
                arm = vect[i];
                cont = i;
            }
        }

        System.out.println("O MAIOR VALOR: " + arm);
        System.out.println("A POSIÇÃO: " + cont);

        sc.close();
    }
}