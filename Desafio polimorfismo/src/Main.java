import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employee = new ArrayList<>();

        System.out.print("Quantos funcionarios tem? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionario #" + i + " :");
            System.out.print("O funcionario é tercerizado? (y/n) ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Horas de trabalho: ");
            Integer hour = sc.nextInt();
            System.out.print("Valor por hora: R$ ");
            Double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Valor de custos: ");
                Double additionalCharge = sc.nextDouble();
                employee.add(new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge));
            } else {
                employee.add(new Employee(name, hour, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAGAMENTOS: ");
        for(Employee emp : employee){
            System.out.println(emp.getName() + " , R$ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}