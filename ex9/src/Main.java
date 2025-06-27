import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora_inicial = sc.nextInt();
        int hora_final = sc.nextInt();
        int duracao;

        if (hora_inicial < hora_final){
            duracao = hora_final - hora_inicial;
        }
        else {
            duracao = 24 + hora_final - hora_inicial;
        }

        System.out.println("O JOGO DUROU: " + duracao);
        sc.close();


    }
}