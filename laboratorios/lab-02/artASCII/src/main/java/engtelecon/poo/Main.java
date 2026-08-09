package engtelecon.poo;

import java.util.Locale;

public class Main {

    static void main(String[] args) {

        int largura;
        int altura;
        int dimensao;

        IO.println("\n Bem-Vindo ao ASCII art\n");
        IO.println("Opções disponiveis: Losango, Triângulo retângulo, Retângulo Vazado\n");

        String forma = IO.readln("Entre com o formato: ");
        forma.toLowerCase();

        switch (forma.toLowerCase()) {

            case "retangulo vazado", "retângulo vazado":
                largura = Integer.parseInt(IO.readln("Entre com a largura do " + forma + ": "));
                altura = Integer.parseInt(IO.readln("Entre com a altura do " + forma + ": "));

                IO.println("\nJava ASCIIart retângulo " + altura + " x " + largura + ".\n");
                imprimeRetangulo(largura, altura);

                break;

            case "triângulo retângulo", "triangulo retangulo":
                dimensao = Integer.parseInt(IO.readln("Entre com a dimensao do " + forma + ": "));

                IO.println("\nJava ASCIIart triângulo " + dimensao + ".\n");
                imprimeTriangulo(dimensao);

                break;
            case "losango":
                dimensao = Integer.parseInt(IO.readln("Entre com a dimensao do " + forma + ": "));

                IO.println("\nJava ASCIIart losângulo " + dimensao + ".\n");
                imprimelosango(dimensao);

                break;
            default:
                IO.println("Opção de formato invalida!\n");
        }
        IO.print("\n");


    }

    static void imprimeRetangulo(int largura, int altura) {
        for (int i = 0; i < largura; i++) {
            IO.print("*");
        }

        for (int i = 0; i < altura - 2; i++) {
            IO.print("\n*");
            for (int j = 0; j < largura - 2; j++) {
                IO.print(" ");
            }
            IO.print("*");
        }
        IO.print("\n");
        for (int i = 0; i < largura; i++) {
            IO.print("*");
        }
    }

    static void imprimeTriangulo(int dimensao) {
        for (int i = dimensao; i > 0; i--) {
            for (int j = 0; j < dimensao - i + 1; j++) {
                IO.print("*");
            }
            IO.print("\n");
        }
    }

    static void imprimelosango(int dimensao) {

        if (dimensao % 2 == 0) {
            dimensao++;
        }

        int meio = (dimensao / 2) + 1;
        int aux = meio;
        int num = 1;

        // imprime a metade de cima menos o meio

        for (int a = 0; a < meio - 1; a++) {

            for (int i = 0; i < aux - 1; i++) {
                IO.print(" ");
            }
            for (int i = 0; i < num; i++) {
                IO.print("*");
            }

            aux--;
            num += 2;
            IO.println("");
        }

        // Imprime a parte do meio

        for (int k = 0; k < dimensao; k++) {
            IO.print("*");
        }
        IO.println("");

        // Imprime a metade de baixo menos o meio

        aux = 2;
        num = dimensao - 2;

        for (int a = 0; a < meio - 1; a++) {

            for (int i = 0; i < aux - 1; i++) {
                IO.print(" ");
            }
            for (int i = 0; i < num; i++) {
                IO.print("*");
            }

            aux++;
            num -= 2;
            IO.println("");
        }
    }
}


