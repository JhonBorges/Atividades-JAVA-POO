import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("joao");
        nomes.add("maria");
        nomes.add("pedro");
        nomes.add("maria");
        nomes.add("ana");
        nomes.add("joao");

        Set<String> nomesUnicos = new LinkedHashSet<>(nomes);
        Set<String> ordenados = new TreeSet<>(nomesUnicos);

        for (String nome : nomesUnicos){
            System.out.println(nome);
        }
        System.out.println("--------");
        for (String nomeOrdenado : ordenados){
            System.out.println(nomeOrdenado);
        }

    }
}