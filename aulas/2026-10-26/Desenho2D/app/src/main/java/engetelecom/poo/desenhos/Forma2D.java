package engetelecom.poo.desenhos;

public abstract class Forma2D extends Forma{


    public Forma2D(String cor, Coordenada inicio) {
        super(cor, inicio);
    }

    public abstract double calcularPerimetro();

    public abstract double calculaArea();

}
