package engtelecom.poo;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        char[][] chars = new char[9][9];
        Scanner leitor = new Scanner(System.in);

        int aux = 0;

        while(leitor.hasNext()) {
            String linha = leitor.nextLine();
            char dados[] = linha.toCharArray();

            for (int j = 0; j < 9 && j < dados.length; j++) {
                chars[aux][j] = dados[j];
            }
            aux++;
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
               IO.print(chars[i][j]);
            }
        }
        leitor.close();
    }
}
