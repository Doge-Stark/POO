package engtelecon.poo;

import java.util.Random;

public class App {

    static void main(String[] args) {

        Random r = new Random();

        int sorteado = r.nextInt(100);
        int resposta;
        String ajuda;
        int contagem = 0;

        IO.println("");
        IO.println("Bem-vindo ao jogo de adivinhação!!");

        do{

        resposta = Integer.parseInt(IO.readln("Insira um numero: "));

        ajuda = resposta<sorteado ? "maior" : "menor";

        if(resposta != sorteado) IO.println("Errou!! , o numero é " + ajuda + " que esse!!" );

        contagem++;

        }while( resposta != sorteado );

        IO.println("");
        IO.println("Parabéns, você acertou!");
        IO.println("Foram nescessarias " + contagem + " Tentativas.");
    }
}
