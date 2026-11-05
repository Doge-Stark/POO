package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Aquatico;
import engetelecom.poo.superClasses.Viviparo;

public class Baleia extends Viviparo implements Aquatico {
    public Baleia(int gestacaoMeses, int idadeAnos, float pesoKg, String nome) {
        super(gestacaoMeses);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }
    public String nadar() {
        return "A baleia " + nome + " começou a nadar!";
    }

    @Override
    public String reproduzir() {
        return "A baleia " + nome + " " + reproduzir() + "!";
    }

    @Override
    public String mamar() {

        return "A baleia " + nome + " está mamando!";

    }

    @Override
    public String amamentar() {

        return "A baleia " + nome + " está amamentar!";

    }

    public String borrifarAgua() {
        return "A baleia " + nome + " boffirou agua por seu espiráculo !";
    }

    public String cantar() {
        return "A baleia " + nome + " começou a cantar!";
    }

    @Override
    public String toString() {
        return "A Baleia " +
                nome + " é um mamifero com " +
                idade + " anos, " + peso + " kg.";

    }
}
