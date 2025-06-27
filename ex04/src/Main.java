import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C,D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int difereca = (A * B) - (C * D);

        System.out.printf("A Diferença é: %d", difereca);
        sc.close();
    }
}