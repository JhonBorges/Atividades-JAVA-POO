import entities.CalculadoraNumerica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraNumerica<Number> cal = new CalculadoraNumerica();
        System.out.print("valor 1: ");
        int val1 = sc.nextInt();
        System.out.print("valor 2: ");
        double val2 = sc.nextDouble();

        Double aux = cal.somar(val1, val2);

        System.out.println();
        System.out.println("soma: " + aux);
    }
}