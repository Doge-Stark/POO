package engtelecom.poo;

public class Carro {

    // atributos

    private String cor;
    private int velocidadeAtual;


    public void definiCor(String novaCor) {
        cor = novaCor;
    }

    public String obterCor() {
        return cor;
    }

    public void acelerar(int n) {
        if (velocidadeAtual < 100 && velocidadeAtual + n <= 100) {
            velocidadeAtual = velocidadeAtual + n;
        }
    }

    public void freiar(int n) {
        if (velocidadeAtual != 0 && velocidadeAtual - n >= 0) {
            velocidadeAtual = velocidadeAtual - n;
        }
    }

    public int mostrarVelocidade() {
        return velocidadeAtual;
    }
}

