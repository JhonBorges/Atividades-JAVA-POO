import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> cores = new ArrayList<>();

        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Roxo");
        cores.add("Laranja");

        List<String> sub = cores.subList(1,3);
        System.out.println(sub);

        cores.clear();
        System.out.println("ATUALIZADO:");
        System.out.println(cores);
    }
}