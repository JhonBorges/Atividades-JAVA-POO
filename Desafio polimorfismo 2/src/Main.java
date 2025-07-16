import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Quantos produtos serão adquiridos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Produto #" + i + ":");
            System.out.print("O produto é Usado, Importado ou Nacional (u/i/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preço: R$ ");
            Double price = sc.nextDouble();

            if (ch == 'u') {
                System.out.print("Data de fabricação: ");
                sc.nextLine();
                LocalDate date = LocalDate.parse(sc.nextLine(),fmt);
                list.add(new UsedProduct(name, price, date));

            } else if (ch == 'i') {
                System.out.print("Taxa de importação: R$ ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));

            } else {
                list.add(new Product(name, price));
            }
            System.out.println();
        }

        System.out.println("PRODUTOS:");
        for (Product product : list){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}