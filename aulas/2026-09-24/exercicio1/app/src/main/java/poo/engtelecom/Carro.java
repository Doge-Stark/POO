package poo.engtelecom;

public class Carro {
    
    private String marca;
    private Motor propulsor;

    public Motor getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(Motor propulsor) {
        this.propulsor = propulsor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Carro(Motor propulsor, String marca) {
        this.propulsor = propulsor;
        this.marca = marca;
    }
    
    public void acelerar(int velocidade){

        this.propulsor.acelerar(velocidade);
    }
}
