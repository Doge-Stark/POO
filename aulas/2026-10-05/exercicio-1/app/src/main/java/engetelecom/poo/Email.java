package engetelecom.poo;

public class Email {

    private String valor;

    public Email(String valor) {
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
        final StringBuilder sb = new StringBuilder("Email{");
        sb.append("valor='").append(valor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
