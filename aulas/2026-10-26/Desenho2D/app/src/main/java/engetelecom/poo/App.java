
package engetelecom.poo;

import engetelecom.poo.desenhos.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<Forma>();

        formas.add(new Linha("Vermelho", new Coordenada(1, 1),new Coordenada(5,5)));
        formas.add(new Circulo("Azul", new Coordenada(1,1), 10));
        formas.add(new Retangulo("Laranja", new Coordenada(1,1),new Coordenada(2,2)));
        formas.add(new Triangulo("Rosa", new Coordenada(0,0),new Coordenada(10,10),new Coordenada(5,5)));

        formas.forEach(e -> IO.println(e.desenhar()));

    }
}
