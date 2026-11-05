package engetelecom.poo.animais;

import engetelecom.poo.intefaces.Aquatico;
import engetelecom.poo.intefaces.Mamifero;
import engetelecom.poo.intefaces.Terrestre;
import engetelecom.poo.superClasses.Oviparo;

public class Ornitorrinco extends Oviparo implements Mamifero, Aquatico, Terrestre {
    public Ornitorrinco(boolean possuiPenas, int idadeAnos, float pesoKg, String nome) {
        super(possuiPenas);
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
    }

    public String nadar() {
        return "O ornitorrinco " + nome + " começou a " + Aquatico.super.nadar() + "!";
    }

    @Override
    public String andar() {
        return "O ornitorrinco " + nome + " começou a " + Terrestre.super.andar() + "!";

    }

    @Override
    public String botarOvo() {
        return "O ornitorrinco " + nome + " " + super.botarOvo() + "!";
    }

    @Override
    public String mamar() {

        return "O ornitorrinco " + nome + " está " + Mamifero.super.mamar() + "!";

    }

    @Override
    public String amamentar() {

        return "O ornitorrinco " + nome + " está " + Mamifero.super.amamentar() + "!";

    }

}



