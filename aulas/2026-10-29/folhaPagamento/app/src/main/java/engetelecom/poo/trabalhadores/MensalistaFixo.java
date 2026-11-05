package engetelecom.poo.trabalhadores;

import engetelecom.poo.superClasse.Funcionario;

public class MensalistaFixo extends Funcionario {
    private double fixo;

    public MensalistaFixo(String nome, double fixo) {
        super(nome);
        this.fixo = fixo;
    }

    @Override
    public double calculaSalario() {
        return fixo;
    }
}
