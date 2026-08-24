package engetelecom.poo;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Carro {

    private String cor;
    private int velocidadeAtual;
    private final int VELOCIDADE_MAX = 100;
    private static final int VELOCIDADE_MIN = 0;


    public Carro(String cor) {
        this.cor = cor;
        this.velocidadeAtual = 0;
    }

    public static int getVelocidadeMin() {
        return VELOCIDADE_MIN;
    }

    public void definiCor(String novaCor) {
        cor = novaCor;
    }

    public String obterCor() {
        return cor;
    }

    public void acelerar(int n) {
        if (velocidadeAtual < VELOCIDADE_MAX) {
            velocidadeAtual = (velocidadeAtual + n > VELOCIDADE_MAX) ? VELOCIDADE_MAX : velocidadeAtual+n;
        }
    }

    public void freiar(int n) {
        if (velocidadeAtual != VELOCIDADE_MIN) {
            velocidadeAtual = (velocidadeAtual - n < VELOCIDADE_MIN) ? VELOCIDADE_MIN : velocidadeAtual-n;

        }
    }

    public int mostrarVelocidade() {
        return velocidadeAtual;
    }
}
