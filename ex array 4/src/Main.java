import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("numero de rep: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int cont = 0;

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
                cont++;
            }
        }

        System.out.printf("%nO numero de pares são: %d", cont);
        sc.close();
    }
}