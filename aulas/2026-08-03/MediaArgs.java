public class MediaArgs {

    public static void main(String[] args) {

        if (args.length == 2) {

            double a1 = Double.parseDouble(args[0]);
            double a2 = Double.parseDouble(args[1]);

            double media = Math.round((a1 + a2) / 2);

            String linha = media >= 6 ? "Aprovado - Media: " : "Reprovado - Media: ";
            IO.println(linha + media);

        } else{
            IO.println("O programa precisa de 2 argumentos");
        }
    }
}
