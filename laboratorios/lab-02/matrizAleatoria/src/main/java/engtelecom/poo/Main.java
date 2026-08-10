package engtelecom.poo;

import java.util.Random;

public class Main {
    static void main() {

        String[][] matrix = new String[9][9];

        Random r = new Random();

        int linha = r.nextInt(9);
        int coluna = r.nextInt(9);
        int A = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = ".";
            }
        }

        do {

            if (matrix[linha][coluna].equals("*")) {
                linha = r.nextInt(9);
                coluna = r.nextInt(9);
            }

            matrix[linha][coluna] = "*";
            linha = r.nextInt(9);
            coluna = r.nextInt(9);
            A++;

        } while (A != 9);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                IO.print(matrix[i][j]);
            }
            IO.print("\n");
        }
    }
}

