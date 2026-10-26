package engetelecom.poo.desenhos;

public class Coordenada {
    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    protected int getY() {
        return y;
    }

    protected int getX() {
        return x;
    }
}
