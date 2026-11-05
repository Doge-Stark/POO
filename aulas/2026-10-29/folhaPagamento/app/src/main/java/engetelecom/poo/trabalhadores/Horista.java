package engetelecom.poo.trabalhadores;

import engetelecom.poo.superClasse.Funcionario;

public class Horista extends Funcionario {
    private double valorPorHora;
    private int horasTrabalhadas;
    private int horasExtras;

    public Horista(String nome, double valorPorHora, int horasTrabalhadas, int horasExtras) {
        super(nome);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calculaSalario() {
        return valorPorHora * (horasTrabalhadas + (horasExtras*2));
    }
}
