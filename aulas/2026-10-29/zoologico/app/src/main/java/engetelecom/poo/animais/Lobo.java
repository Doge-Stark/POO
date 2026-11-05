package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Aquatico;
import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.superClasses.Viviparo;

public class Lobo extends Viviparo implements Terrestre {
    public Lobo(int gestacaoMeses, int idadeAnos, float pesoKg, String nome) {
        super(gestacaoMeses);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }

    @Override
    public String mamar() {

        return "O lobo " + nome + " está mamando!";

    }

    @Override
    public String amamentar() {

        return "O lobo " + nome + " está amamentando!";
    }

    @Override
    public String reproduzir() {
        return "O lobo " + nome + " " + reproduzir() + "!";
    }

    public String nadar() {
        return "O lobo " + nome + " começou a nadando!";
    }

    @Override
    public String andar() {
        return "O lobo " + nome + " começou a andar!";

    }

    public String liderar(){
        return "O lobo " + nome + " começou a liderar a matilha!";
    }

    public String uivar(){
        return "O lobo " + nome + " está uivando para a lua!";
    }

    @Override
    public String toString() {
        return "O lobo " +
                nome + " é um mamifero com " +
                idade + " anos, " + peso + " kg.";

    }
}
