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
        final StringBuilder sb = new StringBuilder().append(hora);
        sb.append(":").append(minuto);
        sb.append(":").append(segundo);
        return sb.toString();
    }

    public String porExtenso(){

        String hora;
        String minuto;
        String segundo;





    }


    private String conversorExtenso(int n){

        int unidade = n % 10;
        int dezena = n / 10;

        String resultado;

        String a = switch (dezena){
            case 2 -> "Vinte ";
            case 3 -> "Trinta ";
            case 4 -> "Quarenta ";
            case 5 -> "Cinquenta ";

            default -> "";
        };

        String b = switch (unidade){
            case 1 -> "Um";
            case 2 -> "Dois";
            case 3 -> "Tres";
            case 4 -> "Quatro";
            case 5 -> "Cinco";
            case 6 -> "Seis";
            case 7 -> "Sete";
            case 8 -> "Oito";
            case 

            default -> "";
        };

        In


    }
}
