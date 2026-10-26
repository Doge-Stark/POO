package engetelecom.poo.status;

public class Personagem {

    protected int ataque;
    protected int vida;
    protected double velocidade;

    public Personagem() {
        this.ataque = 0;
        this.vida = 0;
        this.velocidade = 0;
    }

    public String atacar(){
        return "\nacerta com" + ataque + " de ataque!!";
    }

    public String mover(){
        return "\nMove-se com" + velocidade + " de velocidade!";

    }
}
