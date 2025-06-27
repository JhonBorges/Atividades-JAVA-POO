import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String valor = (x < 0)? "Negativo" : "Positivo";

        System.out.println(valor);

        sc.close();


    }
}