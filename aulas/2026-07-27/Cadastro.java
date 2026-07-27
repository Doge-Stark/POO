
void main() {

    int idade = Integer.parseInt(IO.readln("Entre com sua idade: "));
    char sexo = IO.readln("Entre com seu sexo (m ou f): ").charAt(0);

    if (sexo != 'f' && idade > 18) {
        IO.println("Precisa apresentar atestado");
    }
        IO.println("Não precisa apresentar atestado");
}