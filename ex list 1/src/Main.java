import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> nomeFruta = new ArrayList<>();

        int i = 0;
        while (i < 3) {
            nomeFruta.add(sc.next());
            i++;
        }

        for(String fruta : nomeFruta){
            System.out.println(fruta);
        }

        sc.close();
    }
}