public class Media {

    public static void main(String[] args) {

        double a1 = Double.parseDouble(IO.readln("Entre com a nota da A1:"));
        double a2 = Double.parseDouble(IO.readln("Entre com a nota da A2: "));

        double media = Math.round((a1 + a2) / 2);

        String LINHA = media >= 6 ? "Aprovado - Media: " : "Reprovado - Media: ";
        IO.println(LINHA + media);
    }

}