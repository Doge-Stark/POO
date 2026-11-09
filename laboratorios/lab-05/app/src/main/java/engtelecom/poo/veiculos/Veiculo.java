package engtelecom.poo.veiculos;

public abstract class Veiculo {

    protected int velocidadeAtual;
    protected final int VELOCIDADE_MAX;


    public Veiculo(int VELOCIDADE_MAX) {
        this.VELOCIDADE_MAX = VELOCIDADE_MAX;
        this.velocidadeAtual =  0;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean acelerar(){
        if( velocidadeAtual <= VELOCIDADE_MAX){
            velocidadeAtual++;
            return true;
        }
        return false;
    }

    public boolean freiar(){
        if( velocidadeAtual >= 0){
            velocidadeAtual--;
            return true;
        }
        return false;
    }

}
