package poo.engtelecom;

public class Motor {

 private int hp;
 private int giroAtual;
 private int cilindros;

    public Motor(int hp, int cilindros) {
        this.hp = hp;
        this.cilindros = cilindros;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGiroAtual() {
        return giroAtual;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public void acelerar(int velocidade){
        this.giroAtual += velocidade;
    }
}
