package engetelecom.poo.status;



public class Aldeao extends Personagem {

    public Aldeao() {
        super(1,25,0.8);
    }

    @Override
    public String atacar() {
        return "Aldeao " + super.atacar() ;
    }

    @Override
    public String mover() {
        return "Aldeao " + super.mover();
    }
}
