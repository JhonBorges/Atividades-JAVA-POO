import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Acesso NEGADO");
            senha = sc.nextInt();
        }

        System.out.println("Acesso PERMITIDO");
        sc.close();

    }
}