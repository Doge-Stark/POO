package engtelecom.poo;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        int[][] chars = new int[9][9];
        Scanner leitor = new Scanner(System.in);

        int aux = 0;

        while (leitor.hasNext()) {
            String linha = leitor.nextLine();
            char dados[] = linha.toCharArray();

            for (int j = 0; j < 9 && j < dados.length; j++) {

                chars[aux][j] = (dados[j] == '.') ? 0 : 9;
            }
            aux++;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (chars[i][j] == 9) {

                    //mesma linha

                    if (j > 0 && chars[i][j - 1] != 9) {
                            chars[i][j - 1]++;

                    }
                    if (j < 8 && chars[i][j + 1] != 9) {
                        chars[i][j + 1]++;
                    }

                    //linha de cima

                    if (i > 0 && chars[i - 1][j] != 9) {
                        chars[i - 1][j]++;
                    }
                    if (i > 0 && j > 0 && chars[i - 1][j - 1] != 9) {
                        chars[i - 1][j - 1]++;
                    }
                    if (i > 0 && j < 8 && chars[i - 1][j + 1] != 9) {
                        chars[i - 1][j + 1]++;
                    }

                    //linha de baixo

                    if (i < 8 && chars[i + 1][j] != 9) {
                        chars[i + 1][j]++;
                    }
                    if (i < 8 && j < 8 && chars[i + 1][j + 1] != 9) {
                        chars[i + 1][j + 1]++;
                    }
                    if (i < 8 && j > 0 && chars[i + 1][j - 1] != 9) {
                        chars[i + 1][j - 1]++;
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                IO.print(chars[i][j]);
            }
            IO.println();
        }
        leitor.close();
    }
}
