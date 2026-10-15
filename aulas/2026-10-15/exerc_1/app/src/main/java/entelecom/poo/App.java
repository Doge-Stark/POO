
package entelecom.poo;

import entelecom.poo.entidades.Dimensao;
import entelecom.poo.entidades.SemFio;
import entelecom.poo.entidades.Telefone;

public class App {
    public static void main(String[] args) {

        Telefone a1 = new Telefone(101, "abc123", "novo", 2, new Dimensao(1,2,3));

        IO.println(a1);

        SemFio b1 = new SemFio(101, "abc123", "novo", 2, new Dimensao(1,2,3), 1.8,10,100);

        IO.println(b1);

    }
}
