package entelecom.poo.entidades;

public class Telefone {


    protected int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private  Dimensao dimensao;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPeso() {
        return peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dimensao=" + dimensao +
                '}';
    }
}
