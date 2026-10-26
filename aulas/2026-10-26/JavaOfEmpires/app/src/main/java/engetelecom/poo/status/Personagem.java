package engetelecom.poo.status;

public class Personagem {

    protected int ataque;
    protected int vida;
    protected double velocidade;

    public Personagem(int ataque, int vida, double velocidade) {
        this.ataque = ataque;
        this.vida = vida;
        this.velocidade = velocidade;
    }

    public String atacar(){
        String bater = "acerta com " + ataque + " de ataque!!";
        return bater;
    }

    public String mover(){
        String andar = "Move-se com " + velocidade + " de velocidade!";
        return andar;

    }
}
