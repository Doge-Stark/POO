package engetelecom.poo.desenhos;

public class Circulo extends Forma{

    int raio;

    public Circulo(String cor, Coordenada inicio, int raio) {
        super(cor, inicio);
        this.raio = raio;
    }

    public double calcularPerimetro(){
        return  2 * Math.PI * raio;
    }

    public double calculaArea(){
        return  3.14 * (Math.pow(raio,2));
    }

    public double calculaDiametro(){
        return 2*raio;
    }


    @Override
    public String desenhar() {
        return "Desenhando Circulo a partir de " + inicio.toString() + " com " + calculaDiametro()+ " de diametro.";
    }

}
