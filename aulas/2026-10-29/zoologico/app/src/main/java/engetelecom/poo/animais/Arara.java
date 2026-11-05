package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Aquatico;
import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.intefaces.TerrestreAlado;
import engetelecom.poo.superClasses.Oviparo;


public class Arara extends Oviparo implements TerrestreAlado {
    public Arara(boolean possuiPenas, int idadeAnos, float pesoKg, String nome) {
        super(possuiPenas);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }

    @Override
    public String voar() {
        return "A arara " + nome + " começou a " + TerrestreAlado.super.voar() + "!";
    }

    @Override
    public String andar() {
        return "A arara " + nome + " começou a " + TerrestreAlado.super.andar() + "!";

    }

    @Override
    public String botarOvo() {
        return "A arara " + nome + " " + super.botarOvo() + "!";
    }

    public String imitar() {
        return "A arara " + nome + " está imitando!";
    }

    public String quebrarSementes() {

        return "A arara " + nome + " quebrou uma semente!";
    }

    @Override
    public String toString() {
        return "A Arara " +
                nome + " é um oviparo com " +
                idade + " anos, " + peso + " kg.";

    }
}
