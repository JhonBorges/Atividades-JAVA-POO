import Entities.Client;
import Entities.Enums.OrderStatus;
import Entities.Order;
import Entities.Orderitem;
import Entities.Product;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter client Data:");
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();
        System.out.print("Birthdate: ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(),fmt);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 1; i <= n; i++){
            System.out.println("Enter " + i + "#  item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            Product product = new Product(productName, price);

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Orderitem orderitem = new Orderitem(quantity, price, product);

            order.addItem(orderitem);
        }

        System.out.println("ORDER:");
        System.out.println(order);

        sc.close();
    }
}