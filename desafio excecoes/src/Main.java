import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.println("Conta");
            System.out.print("Numero: ");
            Integer number = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double balance = sc.nextDouble();
            System.out.print("Limite de saque: ");
            Double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number,holder,balance,withdrawLimit);

            System.out.println();
            System.out.print("Entre com o valor de saque: ");
            Double amount = sc.nextDouble();


            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
            sc.close();
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Formato errado");
        }
    }
}