package engtelecom.poo.modelos;

import engtelecom.poo.interfaces.TracaoIntegral;
import engtelecom.poo.veiculos.Veiculo;

public class ChevroletS10 extends Veiculo implements TracaoIntegral {
    public ChevroletS10() {
        super(180);
    }

    public boolean abrirFecharCacamba(){
        if(velocidadeAtual == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean ativarDesativarTração() {
        if(velocidadeAtual == 0 ){
            return true;
        }
        return false;
    }
}
