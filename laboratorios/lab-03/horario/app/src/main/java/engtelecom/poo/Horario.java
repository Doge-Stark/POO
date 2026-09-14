package engtelecom.poo;

public class Horario {

    int hora;
    int minuto;
    int segundo;


    public Horario(int hora, int minuto, int segundo) {
        this();
        if (setHora(hora) && setMinuto(minuto) && setSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto) {

        this(hora, minuto, 0);
    }

    public Horario(int hora) {
        this(hora, 0, 0);
    }

    public boolean setSegundo(int segundo) {
        if (verficador(59, segundo)) {
            this.segundo = segundo;
            return true;
        }

        return false;
    }

    public boolean setMinuto(int minuto) {
        if (verficador(59, minuto)) {
            this.minuto = minuto;
            return true;
        }

        return false;
    }

    public boolean setHora(int hora) {
        if (verficador(23, hora)) {
            this.hora = hora;
            return true;
        }

        return false;
    }

    private boolean verficador(int max, int n) {
        return (n >= 0 && n <= max);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(hora);
        sb.append(":").append(minuto);
        sb.append(":").append(segundo);
        return sb.toString();
    }

    public void porExtenso() {

        String hora = conversorExtenso(this.hora, true);
        String minuto = conversorExtenso(this.minuto, false);
        String segundo = conversorExtenso(this.segundo, false);

        switch (hora) {
            case "doze":
                hora = "meio dia";
                IO.println(hora + ", " + minuto + " minutos e " + segundo + " segundos");
                break;

            case "zero":
                hora = "meia noite";
                IO.println(hora + ", " + minuto + " minutos e " + segundo + " segundos");
                break;

            default:
                IO.println(hora + " horas, " + minuto + " minutos e " + segundo + " segundos");
                break;
        }

    }


    private String conversorExtenso(int n, boolean genero) {

        int unidade = n % 10;
        int dezena = n / 10;

        String resultado;

        if (dezena == 1 && unidade <= 5) {
            switch (unidade) {
                case 1:
                    return resultado = "onze";
                case 2:
                    return resultado = "doze";
                case 3:
                    return resultado = "treze";
                case 4:
                    return resultado = "quatorze";
                case 5:
                    return resultado = "quinze";
            }

        }

        String a = switch (dezena) {
            case 0 -> "zero";
            case 1 -> "dez";
            case 2 -> "vinte";
            case 3 -> "trinta";
            case 4 -> "quarenta";
            case 5 -> "cinquenta";

            default -> "";
        };

        String b = switch (unidade) {
            case 0 -> "zero";
            case 1 -> genero ? "uma" : "um";
            case 2 -> genero ? "duas" : "dois";
            case 3 -> "tres";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";

            default -> "";
        };

        if (dezena == 1 && unidade >= 6) {
            return resultado = a + "e" + b;
        }

        if (a == "zero" && b == "zero") {
            return resultado = "zero";
        }

        resultado = a + " e " + b;

        if (a == "zero") {
            resultado = b;
        }
        return resultado;

    }

    long retornaTotalemSegundos() {

        long total = 0;
        total += this.hora * 3600 + this.minuto * 60 + this.segundo;

        return total;
    }

    long diferencaSegundos(Horario outro) {

        long n1 = outro.retornaTotalemSegundos();
        long diferença = retornaTotalemSegundos() - n1;
        return diferença;
    }
}
