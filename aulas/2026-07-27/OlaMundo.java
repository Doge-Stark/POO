void saudacao(){
    IO.println("Olá mundo 2");
}

void saudacaoMelhorada(String mensagem){
    IO.println("Ola " + mensagem);
}

void main(){

    IO.println("Olá mundo");

    saudacao();

    String nome = IO.readln("Entre com seu nome: ");

    saudacaoMelhorada(nome); 



}