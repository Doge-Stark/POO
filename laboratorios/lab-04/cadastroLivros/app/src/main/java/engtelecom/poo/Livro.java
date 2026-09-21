package engtelecom.poo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

public class Livro {

    private String  isbn;
    private String titulo;
    private String autor;
    private int ano;


    public Livro(String  isbn, String titulo, String autor, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("isbn: ").append(isbn).append("\n");
        sb.append("titulo: ").append(titulo).append("\n");
        sb.append("autor: ").append(autor).append("\n");
        sb.append("ano: ").append(ano);
        sb.append("\n").append(codigoDeBarra());
        return sb.toString();
    }

    public String codigoDeBarra(){
        int largura = 60;
        int altura = 5;
        StringBuilder saida = new StringBuilder();

        try{

            EAN13Writer write = new EAN13Writer();

            BitMatrix matriz = write.encode(isbn, BarcodeFormat.EAN_13, largura, 1);

            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < matriz.getWidth();j++) {
                    if(matriz.get(j,0)){
                        saida.append("\u2588");
                    }else{
                        saida.append(" ");
                    }
                    saida.append("\n");
                }
            }

        }catch (Exception e){}

        return saida.toString();

    }









}
