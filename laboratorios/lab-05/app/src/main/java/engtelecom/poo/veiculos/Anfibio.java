package engtelecom.poo.veiculos;

public abstract class Anfibio extends Veiculo {

    protected int capacidadeLastroAtual;
    protected final int CAPACIDADE_LASTRO_MAX;
    protected boolean rodasRecolhidas = false;


    public Anfibio(int VELOCIDADE_MAX, int capacidadeLastroAtual, int capacidadeLastroMax) {
        super(VELOCIDADE_MAX);
        this.capacidadeLastroAtual = capacidadeLastroAtual;
        CAPACIDADE_LASTRO_MAX = capacidadeLastroMax;
    }


    public boolean recolherEstendeRodas() {
        if (velocidadeAtual == 0) {
            rodasRecolhidas = !rodasRecolhidas;
            if (rodasRecolhidas) {
                esvaziarLastro();
            }
            return true;
        }
        return false;
    }

    public boolean esvaziarLastro() {
        capacidadeLastroAtual = 0;
        return true;
    }

    public boolean encherLastro() {
        if (rodasRecolhidas) {
            capacidadeLastroAtual = CAPACIDADE_LASTRO_MAX;
            return true;
        }
        return false;
    }
}
