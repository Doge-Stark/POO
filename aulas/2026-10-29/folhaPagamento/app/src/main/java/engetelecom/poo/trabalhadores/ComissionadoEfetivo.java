package engetelecom.poo.trabalhadores;

public class ComissionadoEfetivo extends Comissionado{

    private double salarioFixo;

    public ComissionadoEfetivo(String nome, double comissaoPercentual, double totalVendas, double salarioFixo) {
        super(nome, comissaoPercentual, totalVendas);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calculaSalario() {
        return salarioFixo + super.calculaSalario() ;
    }
}
