package engtelecom.poo;

public enum Planeta {
    TERRA(3),
    MARTE(4),
    MERCURIO(1),
    JUPITER(5),
    SATURNO(6),
    NETUNO(8),
    VENUS(2),
    URANO(7);

    public final int posicao;


    Planeta(int posicao) {
        this.posicao = posicao;
    }

    public static Planeta getByCodigo(int posicao){
        for( Planeta p: Planeta.values()){
                if(posicao == p.posicao){
                    return p;
                }
        }
        throw new IllegalArgumentException("código inválido");
    }
}
