package engetelecom.poo;

public class Batedeira {

    private boolean ligado = false;
    private int velocidade = 0;

    public void ligarDesligar(){
        ligado = !ligado;
    }

    public void alterarVelocidade(int n){

        if(isLigado()){
        velocidade = (velocidade + n) > 10 ? 10 : velocidade + n;}
    }

    public int informaVelocidade(){
        return velocidade;
    }

    public boolean isLigado(){
        return ligado;
    }

}
