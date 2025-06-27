import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("_____________________________");
        System.out.println("           TABELA   ");
        System.out.println("-----------------------------");
        System.out.println("1 - Cachorro Quente - R$ 4,00");
        System.out.println("2 -    X Salada     - R$ 4,50");
        System.out.println("3 -    X Bacon      - R$ 5,00");
        System.out.println("4 - Torrada Simples - R$ 2,00");
        System.out.println("5 - Refrigerente    - R$ 1,50");
        System.out.println("-----------------------------");

        System.out.print("Digite o codigo do produto que deseja: ");
        int cod = sc.nextInt();
        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        double multi = 0;

        switch (cod) {
            case 1:
                multi = 4.00 * qtd;
                break;
            case 2:
                multi = 4.50 * qtd;
                break;
            case 3:
                multi = 5.00 * qtd;
                break;
            case 4:
                multi = 2.00 * qtd;
                break;
            case 5:
                multi = 1.50 * qtd;
                break;
            default:
                System.out.println("Codigo invalido!");
                break;
        }


        System.out.println("RECIBO");
        System.out.println("------");
        System.out.printf("O VALOR TOTAL A SER PAGO É: R$ " + multi);

        sc.close();
    }
}