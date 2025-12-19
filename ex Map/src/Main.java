import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String parth = "C:\\Users\\jhonm\\Desktop\\teste\\votos.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(parth))){
           String line = br.readLine();
            Map<String, Integer> cand = new HashMap<>();
           while (line != null){
               String[] fields = line.split(";");
               String nome = fields[0];
               Integer votos = Integer.parseInt(fields[1]);
               cand.put(nome, cand.getOrDefault(nome, 0) + votos);
               line = br.readLine();
           }
           for (Map.Entry<String, Integer> entry : cand.entrySet()){
               System.out.println("nome: " + entry.getKey() + " votos: " + entry.getValue());
           }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}