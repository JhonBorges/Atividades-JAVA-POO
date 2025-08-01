import entities.Fisica;
import entities.Juridica;
import entities.TaxaContribuente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <TaxaContribuente> list = new ArrayList<>();

        System.out.print("Quantos contribuentes? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Dados da Taxa "+i+"# :");
            System.out.print("Individual ou Companhia (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Gasto em saude: ");
                double gastoSaude = sc.nextDouble();
                list.add(new Fisica(name, rendaAnual, gastoSaude));
            } else {
                System.out.print("Numero de funcionarios: ");
                int funcionarios = sc.nextInt();
                list.add(new Juridica(name, rendaAnual, funcionarios));
            }
        }

        System.out.println();
        System.out.println("TAXAS:");
        double sum = 0;
        for (TaxaContribuente contr : list){
            System.out.println(contr.getNome() + ": R$ "+ contr.taxa());
             sum += contr.taxa();
        }

        System.out.println();
        System.out.println("TOTAL ARRECADADO: R$ " + sum);

        sc.close();
    }
}