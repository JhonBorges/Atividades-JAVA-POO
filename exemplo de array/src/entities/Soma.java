package entities;

public class Soma {
    private int[] valor;

    public Soma(int[] valor){
        this.valor = valor;
    }

    public int getValor(int indice) {
        return valor[indice];
    }

    public void setValor(int[] valor) {
        this.valor = valor;
    }
}
