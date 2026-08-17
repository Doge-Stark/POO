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
        if (velocidadeAtual < 100) {
            velocidadeAtual = (velocidadeAtual + n > 100) ? 100 : velocidadeAtual+n;
        } else if (velocidadeAtual == 100){
             IO.println("Velocidade máxima alcançada!");
        }
    }

    public void freiar(int n) {
        if (velocidadeAtual != 0) {
            velocidadeAtual = (velocidadeAtual - n < 0) ? 0 : velocidadeAtual-n;
        } else if (velocidadeAtual == 0){
        IO.println("Carro está parado!");
    }
    }

    public int mostrarVelocidade() {
        return velocidadeAtual;
    }
}

