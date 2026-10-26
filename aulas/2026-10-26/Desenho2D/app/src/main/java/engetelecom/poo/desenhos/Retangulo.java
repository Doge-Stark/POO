package engetelecom.poo.desenhos;

public class Retangulo extends Forma{
    private Coordenada vertice2;


    public Retangulo(String cor, Coordenada inicio, Coordenada vertice2) {
        super(cor, inicio);
        this.vertice2 = vertice2;
    }

    public double calculaArea(){
      return (Math.abs((vertice2.getY() - inicio.getY())) * Math.abs((vertice2.getX() - inicio.getX())));
    }

    public double calculaPerimetro(){
        return (Math.abs((vertice2.getY() - inicio.getY())) + Math.abs((vertice2.getX() - inicio.getX())));
    }

    @Override
    public String desenhar() {
        return "Desenhando retangulo a partir de " + inicio.toString() + " até " + vertice2.toString() + " com " + calculaArea() + " de área";
    }
}
