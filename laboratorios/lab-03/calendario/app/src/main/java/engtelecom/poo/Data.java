package engtelecom.poo;

public class Data {

    private int ano;
    private int mes;
    private int dia;

    public Data(int ano, int mes, int dia) {
        this();
        if (verificador(dia, mes, ano)) {
            this.ano = ano;
            this.mes = mes;
            this.dia = dia;
        }
    }

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
    }

    public Data(int dia) {
        this(1970, 1, dia);
    }

    public Data(int mes, int dia) {
        this(1970, mes, dia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (verificador(dia, this.mes, this.ano)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (verificador(this.dia, mes, this.ano)) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    boolean verificadorBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean verificador(int dia, int mes, int ano) {
        int qtd_dias;
        switch (mes) {
            case 1:
                qtd_dias = 31;
                break;
            case 2:
                qtd_dias = verificadorBissexto(ano) ? 29 : 28;
                break;
            case 3:
                qtd_dias = 31;
                break;
            case 4:
                qtd_dias = 30;
                break;
            case 5:
                qtd_dias = 31;
                break;
            case 6:
                qtd_dias = 30;
                break;
            case 7:
                qtd_dias = 31;
                break;
            case 8:
                qtd_dias = 31;
                break;
            case 9:
                qtd_dias = 30;
                break;
            case 10:
                qtd_dias = 31;
                break;
            case 11:
                qtd_dias = 30;
                break;
            case 12:
                qtd_dias = 31;
                break;
            default:
                return false;
        }
        return dia >= 1 && dia <= qtd_dias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        if (dia <= 9) {
            sb.append("0").append(dia);
        } else {
            sb.append("").append(dia);
        }
        sb.append("/");
        if (mes <= 9) {
            sb.append("0").append(mes);
        } else {
            sb.append("").append(mes);
        }
        sb.append("/").append(ano);
        return sb.toString();
    }

    String dataPorExtenso() {

        String mesExtenso = "";
        String resultado;

        switch (mes) {
            case 1:
                mesExtenso = "janeiro";
                break;
            case 2:
                mesExtenso = "fevereiro";
                break;
            case 3:
                mesExtenso = "março";
                break;
            case 4:
                mesExtenso = "abril";
                break;
            case 5:
                mesExtenso = "maio";
                break;
            case 6:
                mesExtenso = "junho";
                break;
            case 7:
                mesExtenso = "julho";
                break;
            case 8:
                mesExtenso = "agosto";
                break;
            case 9:
                mesExtenso = "setembro";
                break;
            case 10:
                mesExtenso = "outubro";
                break;
            case 11:
                mesExtenso = "novembro";
                break;
            case 12:
                mesExtenso = "dezembro";
                break;
        }

        resultado = this.dia + " de " + mesExtenso + " de " + this.ano;

        return resultado;

    }
}
