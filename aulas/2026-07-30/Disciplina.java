
void main() {

    boolean sair = false;
    String nome;
    int count = 0;
    String[] dias = new String[5];

    nome = IO.readln("Entre com a sigla da disciplina: ");

    do {

        String aux = IO.readln("Entre com a dia da semana que você tem aula: ");

        if (aux.equals("nao")) {
            sair = true;
        }

        switch (aux.toLowerCase()) {
            case "seg", "ter", "qua", "qui", "sex", "nao":
                dias[count] = aux.toLowerCase();
                count++;

                break;
            default:
                System.out.println("Valor invalido");
        }

    } while (sair != true || count > 5);

    System.out.println("Na disciplina " + nome + " você tem aulas nos seguintes dias:");

    for (int i = 0; i < count - 1; i++) {

        System.out.println(dias[i]);
    }

}