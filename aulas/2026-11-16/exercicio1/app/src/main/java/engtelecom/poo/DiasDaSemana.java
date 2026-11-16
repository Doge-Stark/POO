package engtelecom.poo;

public enum DiasDaSemana {

    DOMINGO(1,"Domingo"),
    SEGUNDA(2,"Segunda-Feira"),
    TERCA(3,"Terça-Feira"),
    QUARTA(4,"Quarta-Feira"),
    QUINTA(5,"Quinta-Feira"),
    SEXTA(6,"Sexta-Feira"),
    SABADO(7,"Sabado");

    public final int codigo;
    public final String extenso;

    DiasDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }


}
