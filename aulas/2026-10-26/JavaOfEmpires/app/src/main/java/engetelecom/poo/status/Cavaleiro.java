package engetelecom.poo.status;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        super(3,50,2);
    }

    @Override
    public String atacar() {
        return "Cavaleiro " + super.atacar();
    }

    @Override
    public String mover() {
        return "Cavaleiro " + super.mover();
    }
}
