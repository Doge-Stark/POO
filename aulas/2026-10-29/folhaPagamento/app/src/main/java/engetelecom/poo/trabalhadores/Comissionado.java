package engetelecom.poo.trabalhadores;

import engetelecom.poo.superClasse.Funcionario;

public class Comissionado extends Funcionario {

    private double comissaoPercentual;
    private double totalVendas;

    public Comissionado(String nome, double comissaoPercentual, double totalVendas) {
        super(nome);
        this.comissaoPercentual = comissaoPercentual;
        this.totalVendas = totalVendas;
    }

    @Override
    public double calculaSalario() {
        return comissaoPercentual * totalVendas;
    }
}
