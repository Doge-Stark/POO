package engtelecom.poo;

public class Motor {

    private boolean estado;
    private String tipo;

    public Motor(String tipo) {
        this.estado = false;
        this.tipo = tipo;
    }

    public void ligarDesligar(){
        this.estado = !estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isligado(){
        return estado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("| Motor: ");
        sb.append("estado: ").append(estado);
        sb.append(" , tipo: ").append(tipo).append(" | ");
        return sb.toString();
    }
}
