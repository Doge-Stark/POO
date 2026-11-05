package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.superClasses.Viviparo;

public class Cachorro extends Viviparo implements Terrestre {
    public Cachorro(int gestacaoMeses, int idadeAnos, float pesoKg, String nome) {
        super(gestacaoMeses);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }

    @Override
    public String mamar() {

        return "O cachorro " + nome + " está " + mamar() + "!";

    }

    @Override
    public String amamentar() {

        return "O cachorro " + nome + " está " + amamentar() + "!";
    }

    @Override
    public String reproduzir() {
        return "O cachorro " + nome + " " + reproduzir() + "!";
    }

    public String nadar() {
        return "O cachorro " + nome + " começou a " + nadar() + "!";
    }

    @Override
    public String andar() {
        return "O cachorro " + nome + " começou a " + andar() + "!";

    }

    public String latir(){
        return "O cachorro " + nome + " começou latir!";
    }

    public String farejar(){
        return "O cachorro " + nome + " está farejando algo!";
    }

    @Override
    public String toString() {
        return "O cachorro " +
                nome + " é um mamifero com " +
                idade + " anos, " + peso + " kg.";

    }
}
