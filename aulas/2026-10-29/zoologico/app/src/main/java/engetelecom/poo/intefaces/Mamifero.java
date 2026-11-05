package engetelecom.poo.intefaces;

public interface Mamifero {

    public default String amamentar() {
        return "amamentar";
    }

    public default String mamar() {
        return "mamando";
    }
}
