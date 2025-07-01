import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate dataFinal = LocalDate.of(2001,11,20);
        LocalDate dataInicial = LocalDate.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.printf("O meu aniversario e %s%n",fmt.format(dataFinal));

        long diasFaltando = ChronoUnit.DAYS.between(dataFinal, dataInicial);

        System.out.println(diasFaltando + " dias faltando");

    }
}