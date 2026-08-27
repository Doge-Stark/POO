package engtelecom.poo;

public class Ponto {

    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distanciaPontos(Ponto b){

        double novo = ((Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2))));

        return novo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append("").append(x);
        sb.append(", ");
        sb.append("").append(y);
        sb.append(")");

        return sb.toString();
    }

}

