package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.superClasses.Viviparo;

public class Gato extends Viviparo implements Terrestre {
    public Gato(int gestacaoMeses, int idadeAnos, float pesoKg, String nome) {
        super(gestacaoMeses);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }

    @Override
    public String mamar() {

        return "O gato " + nome + " está " + mamar() + "!";

    }

    @Override
    public String amamentar() {

        return "O gato " + nome + " está " + amamentar() + "!";
    }

    @Override
    public String reproduzir() {
        return "O gato " + nome + " " + reproduzir() + "!";
    }

    public String nadar() {
        return "O gato " + nome + " começou a " + nadar() + "!";
    }

    @Override
    public String andar() {
        return "O gato " + nome + " começou a " + andar() + "!";

    }

    public String miar(){
        return "O gato " + nome + " está miando!";
    }

    public String arranhar(){
        return "O gato " + nome + " começou a arranhar!";
    }

    @Override
    public String toString() {
        return "O gato " +
                nome + " é um oviparo com " +
                idade + " anos, " + peso + " kg.";

    }

}
