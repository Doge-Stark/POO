package engtelecom.poo.modelos;

import engtelecom.poo.interfaces.Conversivel;
import engtelecom.poo.interfaces.TracaoIntegral;
import engtelecom.poo.veiculos.Anfibio;
import engtelecom.poo.veiculos.Veiculo;

public class WaterCarPanther extends Anfibio implements Conversivel, TracaoIntegral {

    private int tempGeladeira;
    private int TEMP_GELADEIRA_MAX = 10;

    public WaterCarPanther() {
        super(72, 0, 100);
        this.tempGeladeira = 20;
    }

    @Override
    public boolean ativarDesativarTração() {
        if(velocidadeAtual == 0 && !rodasRecolhidas){
            return true;
        }
        return false;
    }

    @Override
    public boolean abrirFecharCapota() {
        if (velocidadeAtual == 0) {
            return true;
        }
        return false;
    }

    public boolean regularTempGeladeira(int temp){
        if(tempGeladeira == TEMP_GELADEIRA_MAX) {
            return false;
        }
        tempGeladeira = temp;
        return true;
    }
}
