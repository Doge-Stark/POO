package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Aquatico;
import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.superClasses.Oviparo;

public class Penguim extends Oviparo implements Terrestre, Aquatico {
    public Penguim(boolean possuiPenas, int idadeAnos, float pesoKg, String nome) {
        super(possuiPenas);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }


    public String nadar() {
        return "O penguim " + nome + " começou a " + Aquatico.super.nadar() + "!";
    }

    @Override
    public String andar() {
        return "O penguim " + nome + " começou a " + Terrestre.super.andar() + "!";

    }

    @Override
    public String botarOvo() {
        return "O penguim " + nome + " " + super.botarOvo() + "!";
    }

    public String deslizar() {

        return "O penguin " + nome + "  começou a deslizar!";
    }

    public String vigiarOvo() {
        return "O penguin" + nome + " está protegendo o Ovo!";
    }

    @Override
    public String toString() {
        return "O penguim " +
                nome + " é um oviparo com " +
                idade + " anos, " + peso + " kg.";

    }

}