import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();

        int soma = x + y;

        System.out.println("SOMA:" + soma);

        sc.close();
    }
}
