package engetelecom.poo;

public class Contador {

    // Atributos

    private int valorAtual = 0;

    public void incrementar(){
        valorAtual++;
    }

    public int mostrarContagem(){
        return valorAtual;
    }

    public void alterarValor(int valor){
        if(valor < 0 ){}else{
        valorAtual = valor;}
    }
}
