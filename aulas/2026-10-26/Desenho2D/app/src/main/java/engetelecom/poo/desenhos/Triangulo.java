package engetelecom.poo.desenhos;

public class Triangulo extends Forma2D{
    private Coordenada a1;
    private Coordenada l1;

    public Triangulo(String cor, Coordenada inicio, Coordenada a1, Coordenada l1) {
        super(cor, inicio);
        this.a1 = a1;
        this.l1 = l1;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calculaArea() {
        return 0;
    }

    @Override
    public String desenhar() {
        double powA = Math.pow(Math.abs((l1.getY() - inicio.getY())),2);
        double powB = Math.pow(a1.getX(), 2);
        double resultado = Math.sqrt(powA + powB);

        String parcial = String.format(" e hipotenusa: %.2f", resultado);

        return "Desenhando Triangulo retangulo de base: " + Math.abs((l1.getY() - inicio.getY())) + " com altura: " + a1.getX() + parcial;
    }
}
