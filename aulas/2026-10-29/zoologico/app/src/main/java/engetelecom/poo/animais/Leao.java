package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.superClasses.Viviparo;

public class Leao extends Viviparo implements Terrestre {
    public Leao(int gestacaoMeses, int idadeAnos, float pesoKg, String nome) {
        super(gestacaoMeses);
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
    }

    public String mamar() {

        return "O leão " + nome + " está " + mamar() + "!";

    }

    @Override
    public String amamentar() {

        return "O leão " + nome + " está " + amamentar() + "!";
    }

    @Override
    public String reproduzir() {
        return "O leão " + nome + " " + reproduzir() + "!";
    }

    public String nadar() {
        return "O leão " + nome + " começou a " + nadar() + "!";
    }

    @Override
    public String andar() {
        return "O leão " + nome + " começou a " + andar() + "!";

    }

    public String predar(){ return "O leão " + nome + " começou a perseguir uma presa!";}

    public String rugir(){ return "O leão " + nome + " está rugindo!";}
}
