package engetelecom.poo.superClasses;

public class Viviparo extends Animal implements engetelecom.poo.intefaces.Mamifero {

    int gestacao;

    public Viviparo(int gestacao) {
        this.gestacao = gestacao;
    }

    public String reproduzir() {
        return "teve um filhote";
    }
}
