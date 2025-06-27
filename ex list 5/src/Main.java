import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();

        double soma = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Digite um valor: ");
            Double num = sc.nextDouble();
            notas.add(num);
            soma += notas.get(i);
        }

        double media = soma / 5;

        System.out.println("NOTAS:");
        for (double nota : notas){
            System.out.print(nota + ", ");
        }
        System.out.println();
        System.out.println("Media: "+ media);

        sc.close();
    }
}