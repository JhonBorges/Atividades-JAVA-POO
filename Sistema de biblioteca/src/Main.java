import Entities.Capitulo;
import Entities.Editora;
import Entities.Livro;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DA BIBLIOTECA");
        System.out.print("Qual o nome do livro? ");
        String nomeLivro = sc.nextLine();
        System.out.print("Faz parte de qual editora? ");
        String editora = sc.nextLine();

        Editora e = new Editora(editora);
        Livro livro = new Livro(nomeLivro, e, LocalDateTime.now());

        System.out.print("Quantos titulos e paginas tem? ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
            System.out.print("Qual o nome do "+i+" titulo: ");
            sc.nextLine();
            String titulo = sc.nextLine();
            System.out.print("Quantas paginas tem? ");
            Integer paginas = sc.nextInt();

            Capitulo cap = new Capitulo(titulo, paginas);
            livro.addCapitulo(cap);
        }
        System.out.println(livro);
        sc.close();
    }
}