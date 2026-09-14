package engtelecom.poo;

public class retangulo {

    private int largura;
    private int altura;
    private String code;

    private static final int ALTURA_MIN = 2;
    private static final int LARGURA_MIN = 2;


    public retangulo() {

        this.largura = 4;
        this.altura = 3;
        this.code = "ASCII";
    }

    public retangulo(String code, int largura, int altura) {

        this();
        if (setLargura(largura) && setAltura(altura)) {this.altura = altura;
        this.largura = largura; }
        setCode(code);

    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if (largura >= LARGURA_MIN) {
            this.largura = largura;
            return true;
        } else {
            return false;
        }

    }

    public String getCode() {
        return code;
    }

    public boolean setCode(String code) {
        if (code != "ASCII" && code != "UTF8") {
            return false;
        } else {
            this.code = code;
            return true;
        }
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if (altura >= ALTURA_MIN) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }
    }

    int retornaArea() {
        int area = this.largura * this.altura;
        return area;
    }

    int retornaPerimetro() {

        int perimetro = 2 * (largura + altura);
        return perimetro;

    }


    @Override public String toString() {

        String ces = code == "ASCII" ? "\u250c" : "+";
        String csd = code == "ASCII" ? "\u2510" : "+";
        String linha = code == "ASCII" ? "\u2500" : "-";
        String reta = code == "ASCII" ? "\u2502" : "|";
        String cei = code == "ASCII" ? "\u2514" : "+";
        String cdi = code == "ASCII" ? "\u2518" : "+";

    final StringBuilder sb = new StringBuilder(ces);
        for (int i = 0; i < largura-2; i++) {
            sb.append(linha);
        }
        sb.append(csd).append("\n");
        for (int i = 0; i <altura-2; i++) {
            sb.append(reta);
            for (int j = 0; j < largura -2; j++) {
                sb.append(" ");
            }
            sb.append(reta).append("\n");
        }
        sb.append(cei);
        for (int i = 0; i < largura-2; i++) {
            sb.append(linha);
        }
        sb.append(cdi);

    return sb.toString();
}}
