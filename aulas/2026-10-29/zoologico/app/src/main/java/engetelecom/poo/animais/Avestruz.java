package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.intefaces.TerrestreAlado;
import engetelecom.poo.superClasses.Oviparo;

public class Avestruz extends Oviparo implements Terrestre {
    public Avestruz(boolean possuiPenas, int idadeAnos, float pesoKg, String nome) {
        super(possuiPenas);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }


    @Override
    public String andar() {
        return "O avestruz " + nome + " começou a andar!";

    }

    @Override
    public String botarOvo() {
        return "O avestruz " + nome + " " + super.botarOvo() + "!";
    }

    public String correr() {
        return "O avestruz " + nome + " está correndo!";
    }

    public String esquartejar() {

        return "O avestruz " + nome + " esquartejou sua presa!";
    }

    @Override
    public String toString() {
        return "O avestrus " +
                nome + " é um oviparo com " +
                idade + " anos, " + peso + " kg.";

    }
}
