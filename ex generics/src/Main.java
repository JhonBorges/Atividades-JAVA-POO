import service.Caixa;

public class Main {
    public static void main(String[] args) {
        Caixa<Object> dados = new Caixa<>();

        dados.pegar(4);
        dados.pegar("Quatro");
        dados.pegar(4.0);

        dados.verDados();

    }
}