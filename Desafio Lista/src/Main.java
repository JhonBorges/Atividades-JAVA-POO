import Entities.Menu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();

        int x;
        do {
            System.out.println("MENU");
            System.out.println("-----");
            System.out.println("1-Adicionar tarefa");
            System.out.println("2-Remover tarefa");
            System.out.println("3-Mostrar tarefas");
            System.out.println("0-Sair");
            System.out.print("Qual opção deseja: ");
            x = sc.nextInt();
            sc.nextLine();

            String tarefa;

            switch (x) {
                case 1:
                    System.out.println("----------------");
                    System.out.print("Qual tarefa deseja adicionar: ");
                    tarefa = sc.nextLine();
                    m.adicionarTarefa(tarefa);
                    System.out.println("----------------");
                    break;
                case 2:
                    System.out.println("----------------");
                    m.listar();
                    System.out.print("Qual tarefa deseja remover: ");
                    int indice = sc.nextInt();
                    m.removerTarefa(indice);
                    System.out.println("----------------");
                    break;
                case 3:
                    System.out.println("----------------");
                    m.listar();
                    System.out.println("----------------");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                default:
                    if (x != 0) {
                        System.out.println("----------------");
                        System.out.println("Essa opção é invalida!");
                        System.out.println("----------------");
                    }
            }

        } while (x != 0);

        sc.close();
    }
}