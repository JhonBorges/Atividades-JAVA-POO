package Entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> nomes = new ArrayList<>();

    public void adicionarTarefa(String tarefa){
        nomes.add(tarefa);
    }

    public void removerTarefa(int indice){
        int aux = indice -1;
        nomes.remove(aux);
    }

    public void listar(){
        if(nomes.isEmpty()){
            System.out.println("Lista vazia");
        }
        else{
            for (int i = 0; i < nomes.size(); i++){
                System.out.println((i+1)+" - "+nomes.get(i));
            }
        }
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

}
