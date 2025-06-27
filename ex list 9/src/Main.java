import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);
        numeros.add(3);

        System.out.println("LISTA ORIGINAL");
        System.out.println("--------------");
        for (int numero : numeros){
            System.out.print(numero);
        }

        Collections.sort(numeros);
        System.out.println();
        System.out.println("LISTA ORGANIZADA");
        System.out.println("----------------");
        for (int numero : numeros){
            System.out.print(numero);
        }
    }
}