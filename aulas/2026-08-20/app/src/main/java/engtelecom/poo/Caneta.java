package engtelecom.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private final double CONSUMO;

    public Caneta(double CONSUMO, String cor, double nivelTinta) {
        this.CONSUMO = CONSUMO;
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(String cor, double nivelTinta) {
        this(0.01 , cor , nivelTinta);
    }

    public Caneta(String cor) {
        this(cor, 100);
    }

    public Caneta() {
        this("Preto");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(double nivelTinta) {
        this.nivelTinta = Math.min(Math.max(0, nivelTinta), 100);
    }

    public double desenhar(int x1, int y1, int x2, int y2) {
        double consumido;

        consumido = (CONSUMO * Math.sqrt(Math.exp(x2 - x1) + Math.exp(y2 - y1)));

        if (nivelTinta >= consumido){
            nivelTinta -= consumido;
            return consumido;
        }
        return -1;
    }
}
