
void main() {

    String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro" };

    int a;

    do {

        a = Integer.parseInt(IO.readln("Entre com o primeiro numero do mês: "));

    } while (a < 1 || a > 12);

    System.out.println(meses[a - 1]);

    for(int i = 0; i < meses.length; i++){
        System.out.print(meses[i] + " " );
    }

    System.out.println( " " );

    for(String valor : meses ){
        System.out.print(valor + " ");
    }
}