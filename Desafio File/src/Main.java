import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();
        File path = new File(caminho);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Produto> produto = new ArrayList<>();

            while (line != null) {
                String lineConvert = line.replace(";", ",");
                System.out.println(lineConvert);
                String[] corte = lineConvert.split(",");

                String nome = corte[0];
                Double precoUnitario = Double.parseDouble(corte[1]);
                Integer quantidade = Integer.parseInt(corte[2]);

                Produto p = new Produto(nome, precoUnitario, quantidade);
                produto.add(p);

                line = br.readLine();
            }

            File out = new File(path.getParent(), "out");

            //verificar se tem a pasta out
            if (!out.exists()) {
                out.mkdir();
                System.out.println();
                System.out.println("Dados criados com sucesso...");
            }


            File total = new File(out, "total.csv");

            //escrever dentro do arquivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(total))) {
                for (int i = 0; i < produto.size(); i++) {
                    Produto p = produto.get(i);
                    String nome = p.getNome();
                    Double totalValor = p.total();

                    bw.write(nome + ";" + totalValor);
                    bw.newLine();
                }

                //verificar o resultado pelo console
                for (Produto produto1 : produto) {
                    System.out.println(produto1.getNome() + ", " + produto1.total());
                }
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}