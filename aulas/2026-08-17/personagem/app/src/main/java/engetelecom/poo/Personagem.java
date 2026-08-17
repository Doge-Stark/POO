package engetelecom.poo;

public class Personagem {
    
    private int vida;
    private int forca;
    private int agilidade;

    public void preencherAtributos() {
        vida = 100;
        forca = 10;
        agilidade = 10;
    }

    public int informaVida() {
        return vida;
    }

    public int informaForca() {
        return forca;
    }

    public int informaAgilidade() {
        return agilidade;
    }
    
    public void uparVida(int n){
        vida =+ n;
    }

    public void uparAgilidde(int n){
        agilidade += n;
    }

    public void uparforca(int n){
        forca += n;
    }

    public void subirNivel(){
        vida += 100;
        forca += 100;
        agilidade += 100;
    }

    public void up(int i) {
        
    }
}
