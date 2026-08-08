
package engetelecom.poo;

public class App {

    public static void main(String[] args) {

        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));

        String mes = IO.readln("Entre com o mês: ");

        String resultado = "";
        switch (mes.toLowerCase()) {

            case "outubro", "novembro" -> resultado = "Primavera";
            case "janeiro", "fevereiro" -> resultado = "Verão";
            case "abril", "maio" -> resultado = "Outono";
            case "julho", "agosto" -> resultado = "Inverno";

            case "março","marco" -> resultado = (dia <= 20 ? "Verão" : "Outono");
            case "junho" -> resultado = (dia <= 21 ? "Inverno" : "Outono");
            case "setembro" -> resultado = (dia <= 22 ? "Primavera" : "Inverno");
            case "dezembro" -> resultado = (dia <= 21 ? "Verão" : "Primavera");

            default -> resultado = ("Mês invalido");

        }

        IO.println("# Saida:");
        IO.println(resultado);

    }
}