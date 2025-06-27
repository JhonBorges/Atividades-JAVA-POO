import Entities.Rent;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            sc.nextLine();
            System.out.println("Rent #"+ i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int rentRoom = sc.nextInt();

            vect[rentRoom] = new Rent(name, email);
        }

        for (int i = 0; i < vect.length; i++){
            if (vect[i] != null){
                System.out.println("Busy rooms:");
                System.out.println(i + ":" + vect[i]);
            }
        }
        sc.close();
    }
}