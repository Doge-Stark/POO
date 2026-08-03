import java.util.Scanner;

public class Notas {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {

            String linha = leitor.nextLine();

            String[] dados =  linha.split(";");

            String nome = dados[0];
            String sexo = dados[1];
            double a1 = Double.parseDouble(dados[2]);
            double a2 = Double.parseDouble(dados[3]);

            double media = Math.round((a1 + a2) / 2);

            String passou = media >= 6 ? "Aprovad" : "Reprovad";

            passou = (sexo.equals("f")) ? passou + "a" : passou + "o"; 

            IO.println(nome + " -> " + passou);

        }
        leitor.close();
    }
}
