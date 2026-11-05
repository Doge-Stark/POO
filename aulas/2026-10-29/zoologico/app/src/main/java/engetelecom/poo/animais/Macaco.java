package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Aquatico;
import engetelecom.poo.intefaces.Mamifero;
import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.superClasses.Viviparo;

public class Macaco extends Viviparo implements Terrestre, Aquatico {
    public Macaco(int gestacaoMeses, int idadeAnos, float pesoKg, String nome) {
        super(gestacaoMeses);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }


    @Override
    public String mamar() {

        return "O macaco " + nome + " está mamando!";

    }

    @Override
    public String amamentar() {

        return "O macaco " + nome + " está amamentando!";
    }

    @Override
    public String reproduzir() {
        return "O macaco " + nome + " " + reproduzir() + "!";
    }

    public String nadar() {
        return "O macaco " + nome + " começou a nadar!";
    }

    @Override
    public String andar() {
        return "O macaco " + nome + " começou a andar!";

    }

    public String usarFerramentas() {
        return "O macaco " + nome + " está usando uma ferramenta que ele encontrou!";
    }

    public String escalar() {
        return "O macaco " + nome + " está escalando!";
    }

    @Override
    public String toString() {
        return "O macaco " +
                nome + " é um mamifero com " +
                idade + " anos, " + peso + " kg.";

    }


}
