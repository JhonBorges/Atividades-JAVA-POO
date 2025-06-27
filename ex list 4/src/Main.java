import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Double> notas = new ArrayList<>();

        notas.add(5.5);
        notas.add(7.0);
        notas.add(8.2);
        notas.add(6.1);

        System.out.println("NOTAS");
        System.out.println("----------");

        for (double nota : notas){
            System.out.println(nota);
        }

        for (int i = 0; i < notas.size(); i++){
            if (notas.get(i) < 7.0){
                notas.set(i, notas.get(i)+ 0.5);
            }
        }

        System.out.println("NOTAS ATUALIZADAS");
        System.out.println("-------------");
        for (double nota : notas){
            System.out.println(nota);
        }
    }
}