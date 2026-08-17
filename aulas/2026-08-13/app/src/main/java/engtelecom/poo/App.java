package engtelecom.poo;

public class App {
    public static void main(String[] args) {

        Carro fusca = new Carro();
        Carro ferrari = new Carro();
        String cor;
        fusca.definiCor(cor = IO.readln("Entre com a cor do Fusca: "));
        ferrari.definiCor(cor = IO.readln("Entre com a cor da ferrari: "));

        IO.println();
        IO.println("Cor do Fusca:" + fusca.obterCor());
        IO.println("Cor do Ferrari:" + ferrari.obterCor());
        IO.println();

        IO.println("----- TESTE DRIVE ( Fusca ) -----\n");

        // Acelerando e alcançando a velocidade max;

        IO.println("ACELERAÇÃO: \n");

        fusca.acelerar(20);
        medeVelocidade(fusca);
        fusca.acelerar(20);
        medeVelocidade(fusca);
        fusca.acelerar(30);
        medeVelocidade(fusca);
        fusca.acelerar(40);
        medeVelocidade(fusca);
        fusca.acelerar(100);

        IO.println();

        // Desaceleramdo até parar;

        IO.println("DESACELERAÇÃO: \n");
        
        fusca.freiar(10);
        medeVelocidade(fusca);
        fusca.freiar(20);
        medeVelocidade(fusca);
        fusca.freiar(30);
        medeVelocidade(fusca);
        fusca.freiar(40);
        medeVelocidade(fusca);
        fusca.freiar(100);

    }


    static void medeVelocidade(Carro veiculo) {
        if (veiculo.mostrarVelocidade() == 100) {
            IO.println("Velocidade máxima alcançada!");
        }
        if (veiculo.mostrarVelocidade() == 0) {
            IO.println("Carro está parado!");
        } else {
            IO.println("Velocidade atual: " + veiculo.mostrarVelocidade());
        }
    }


}



