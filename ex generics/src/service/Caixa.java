package service;
import java.util.ArrayList;
import java.util.List;

public class Caixa<T>{
    private List<T> dado = new ArrayList<>();
    private T aux;

    public T getAux() {
        return aux;
    }

    public void setAux(T aux) {
        this.aux = aux;
    }

    public void pegar(T valor){
        aux = valor;
        dado.add(aux);
    }


    public void verDados(){
        for(T valor : dado){
            System.out.println(valor);
        }
    }
}
