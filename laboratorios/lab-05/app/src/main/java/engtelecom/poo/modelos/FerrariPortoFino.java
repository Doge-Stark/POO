package engtelecom.poo.modelos;

import engtelecom.poo.interfaces.Conversivel;
import engtelecom.poo.veiculos.Veiculo;

public class FerrariPortoFino extends Veiculo implements Conversivel {

    private boolean estabilidade = false;
    public FerrariPortoFino() {
        super(320);
    }

    public boolean ligarEstabilidade(){
        estabilidade = !estabilidade;
        return true;
    }

    @Override
    public boolean abrirFecharCapota() {
        if (velocidadeAtual == 0) {
            return true;
        }
        return false;
    }
}
