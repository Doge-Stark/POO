
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {

            String linha = leitor.nextLine();

            IO.println(linha.toUpperCase());

        }

        leitor.close();

    }
}
