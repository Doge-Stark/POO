package engetelecom.poo.status;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(2,35,1);
    }

    @Override
    public String atacar() {
        return "Arqueiro " + super.atacar();
    }

    @Override
    public String mover() {
        return "Arqueiro " + super.mover();
    }
}
