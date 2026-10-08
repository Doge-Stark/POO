package engetelecom.poo;

public class Telefone {

   private String valor;

    public Telefone(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Telefone{");
        sb.append("valor='").append(valor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
