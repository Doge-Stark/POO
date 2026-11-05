package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Mamifero;
import engetelecom.poo.intefaces.TerrestreAlado;
import engetelecom.poo.superClasses.Viviparo;

public class Morcego extends Viviparo implements TerrestreAlado {
    public Morcego(int gestacaoMeses, int idadeAnos, float pesoKg, String nome) {
        super(gestacaoMeses);
        this.idade = idadeAnos;
        this.peso = pesoKg;
        this.nome = nome;
    }

    @Override
    public String voar() {
        return "O morcego " + nome + " começou a " + TerrestreAlado.super.voar() + "!";
    }

    @Override
    public String andar() {
        return "O morcego " + nome + " começou a " + TerrestreAlado.super.andar() + "!";

    }

    @Override
    public String reproduzir() {
        return "O morcego " + nome + " " + reproduzir() + "!";
    }

    @Override
    public String mamar() {

        return "O morcego " + nome + " está " + mamar() + "!";

    }

    @Override
    public String amamentar() {

        return "O morcego " + nome + " está " + amamentar() + "!";

    }

    public String localizar() {
        return "O morcego " + nome + " usou sua ecolocalização!";
    }

    public String dependurar() {
        return "O morcego " + nome + " está dependurado de cabeça para baixo!";
    }

    @Override
    public String toString() {
        return "O morcego " +
                nome + " é um mamifero com " +
                idade + " anos, " + peso + " kg.";

    }
}
