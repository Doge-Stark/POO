
package engtelecom.poo;

public class App {

    public static void main(String[] args) {

        int tamanho = Integer.parseInt(IO.readln("Entre com o tamanho da matriz: "));

        int[][] matrix = new int[tamanho][tamanho];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (i == j) ? 1 : 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                IO.print(matrix[i][j]);
            }
            IO.println();
        }
    }
}
