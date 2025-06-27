import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i * 10);
        }

        System.out.println("Digite um valor: ");
        int x = sc.nextInt();

        if (numeros.contains(x)) {
            System.out.println("Numero encontrado!");
            System.out.println("Na posição: "+ numeros.indexOf(x));
        } else {
            System.out.println("Número não encontrado na lista.");
        }
        sc.close();
    }
}