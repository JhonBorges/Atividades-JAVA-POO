package entities;

public class Fisica extends TaxaContribuente {

    private Double gastoSaude;

    public Fisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double taxa() {
        double aux;
        if (getRendaAnual() < 20000.00) {
            aux = (getRendaAnual() * 15 / 100) - (getGastoSaude() * 50 / 100);
        } else{
            aux = (getRendaAnual() * 25 / 100) - (getGastoSaude() * 50 / 100);
        }
        return aux;
    }
}
