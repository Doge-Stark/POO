package engtelecom.poo;

public class retangulo {

    private int largura;
    private int altura;
    private String code;

    private static final int ALTURA_MIN = 1;
    private static final int LARGURA_MIN = 1;


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

//    @Override
//    public String toString() {
//        if (code == "ASCII") {
//
//        }else if (code == "UTF8") {
//
//        }
//    }
}
