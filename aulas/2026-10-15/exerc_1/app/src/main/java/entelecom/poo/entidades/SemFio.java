package entelecom.poo.entidades;

public class SemFio extends Telefone {

    private double frequencia;
    private int canais;
    private int distanciaOperacao;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, int distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

   public String toString(){

    return super.toString() + " Frequencia: " + frequencia + " Canais: " + canais + " Distancia de operação: " + distanciaOperacao;

   }

}
