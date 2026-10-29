package engetelecom.poo.desenhos;

public abstract class Forma {

    protected String cor;
    protected Coordenada inicio;

    public Forma(String cor, Coordenada inicio) {
        this.cor = cor;
        this.inicio = inicio;
    }

    public abstract String desenhar();

}
