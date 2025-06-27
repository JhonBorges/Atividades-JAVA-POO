import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");

        System.out.println(nomes.contains("Bruno"));

        nomes.remove("Carla");

        System.out.println(nomes.isEmpty());

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}