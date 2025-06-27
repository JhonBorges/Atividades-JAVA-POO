import entities.Soma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        Soma[] vect = new Soma[n];

        int[] n1 = {2, 3, 4};
        vect[1] = new Soma(n1);

        System.out.println(vect[1].getValor(2));

        int[] n2 = {7, 7, 7};
        Soma s = vect[1];
        s.setValor(n2);
        System.out.println(vect[1].getValor(2));
        sc.close();
    }
}