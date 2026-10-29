package engetelecom.poo.desenhos;

public class Linha extends Forma{

    private Coordenada fim;


    public Linha(String cor, Coordenada inicio, Coordenada fim) {
        super(cor, inicio);
        this.fim = fim;
    }

    @Override
    public String desenhar() {
        return "Desenhando linha a partir de " + inicio.toString() + " até " + fim.toString();
    }
}
