package entities;

public class Juridica extends TaxaContribuente{
    private int funcionarios;

    public Juridica(String nome, Double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double taxa(){
        int porcentagem;
        if (getFuncionarios() > 10){
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }
}
