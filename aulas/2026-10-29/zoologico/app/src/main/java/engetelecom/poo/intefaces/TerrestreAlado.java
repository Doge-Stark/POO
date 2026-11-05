package engetelecom.poo.intefaces;

public interface TerrestreAlado extends Terrestre {

    default String voar() {
        return "Voar";
    }
}
