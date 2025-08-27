import Entities.Emplyoee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many employees will be registered: ");
        int n = sc.nextInt();

        List<Emplyoee> emp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Emplyoee %d#%n", i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            emp.add(new Emplyoee(id, name, salary));
        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        int salaryIncrease = sc.nextInt();


        Emplyoee found = null;

        while (found == null) {
            for (Emplyoee e : emp) {
                if (salaryIncrease == e.getId()) {
                    found = e;
                    break;
                }

            }
            if (found == null){
                System.out.println("ID does exist");
                System.out.print("ID valid: ");
                salaryIncrease = sc.nextInt();
            }
        }

            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            found.alterarSalario(percentage);

        for(Emplyoee e : emp){
            System.out.println(e);
        }
        sc.close();
    }
}