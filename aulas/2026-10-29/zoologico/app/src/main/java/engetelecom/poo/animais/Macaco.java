package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Aquatico;
import engetelecom.poo.intefaces.Mamifero;
import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.superClasses.Viviparo;

public class Macaco extends Viviparo implements Terrestre, Aquatico {
    public Macaco(int gestacaoMeses, int idadeAnos, float pesoKg, String nome) {
        super(gestacaoMeses);
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
    }


    @Override
    public String mamar() {

        return "O macaco " + nome + " está " + mamar() + "!";

    }

    @Override
    public String amamentar() {

        return "O macaco " + nome + " está " + amamentar() + "!";
    }

    @Override
    public String reproduzir() {
        return "O macaco " + nome + " " + reproduzir() + "!";
    }

    public String nadar() {
        return "O macaco " + nome + " começou a " + Aquatico.super.nadar() + "!";
    }

    @Override
    public String andar() {
        return "O macaco " + nome + " começou a " + Terrestre.super.andar() + "!";

    }

    public String usarFerramentas() {
        return "O macaco " + nome + " está usando uma ferramenta que ele encontrou!";
    }

    public String escalar() {
        return "O macaco " + nome + " está escalando!";
    }


}
