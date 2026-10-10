
package engetelecom.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    Agenda nova = new Agenda();

    public static void main(String[] args) {

        App app = new App();
        app.interfaceAgenda();

//        nova.addContato(new Contato("Pedro", "Inácio",  LocalDate.of(2004,5,9)));
//
//        nova.addContato(new Contato("João", "Heitor",  LocalDate.of(2004,3,9)));
//        nova.addTelefone("Casa","5548984192831",0);
//        nova.addTelefone("Casa","5548909090909",1);
//
//        nova.addEmail("Pessoal", "Pedro.i09@aluno.ifsc.edu.br",0);
//        nova.addEmail("Pessoal", "Joao.h09@aluno.ifsc.edu.br",1);

//        IO.print(nova);

    }

    public int interfaceAgenda() {
        int i = 0;
        while (i != 11) {
            IO.println(
                    """                         
                            ===================== MENU AGENDA ========================
                            
                                           Escolha a opção desejada: 
                            
                                           1 - Adicionar contato.
                                           2 - Adcionar Telefone.
                                           3 - Adicionar Email.
                                           4 - Procurar contato.
                                           5 - Remover Telefone.
                                           6 - Remover Email.
                                           7 - Update Telefone.
                                           8 - Update Email.
                                           9 - Remover contato.
                                           10 - Listar contatos.
                                           11 - Sair
                            
                            =========================================================
                            """
            );
            i = Integer.parseInt(IO.readln("Entre com a opção: "));

            switch (i) {
                case 1: adicionarNovoContato(nova);
                    break;
                case 2: adicionarNovoTelefone(nova);
                    break;
                case 3: adicionarNovoEmail(nova);
                    break;
                case 4: procurarContato(nova);
                    break;
                case 5: removerTelefone(nova);
                    break;
                case 6: removerEmail(nova);
                    break;
                case 7: updateTelefone(nova);
                    break;
                case 8: updateEmail(nova);
                    break;
                case 9: removeContato(nova);
                    break;
                case 10: listarContatos(nova);
                    break;
                    default: IO.println("\nOpção invalida!!!\n");
            }
        }
        return 0;
    }

    void adicionarNovoContato(Agenda nova){

        String nome = IO.readln("Insira o nome do contado: ");
        String sobrenome = IO.readln("Insira o sobrenome do contado: ");
        String dataNasc = IO.readln("Insira a data de nascimento do contado (dia/mês/ano): ");

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataNasc, formato);

        nova.addContato(new Contato(nome, sobrenome, data));
    }

    void adicionarNovoTelefone(Agenda nova){

        int indice = Integer.parseInt(IO.readln("Insira o indice do contado: "));
        String novoTelefone = IO.readln("Insira o numero a ser adicionado: ");
        String rotulo = IO.readln("Insira o rotulo do numero: ");

        nova.addTelefone(rotulo,novoTelefone,indice-1);
    }

    void adicionarNovoEmail(Agenda nova){

        int indice = Integer.parseInt(IO.readln("Insira o indice do contado: "));
        String email = IO.readln("Insira o email a ser adicionado: ");
        String rotulo = IO.readln("Insira o rotulo do email: ");

        nova.addEmail(rotulo,email,indice-1);

    }

    void procurarContato(Agenda nova){

        String nome = IO.readln("Insira o nome e sobrenome do contato: ");

        String[] partes = nome.split(" ");

        String a = partes[0];
        String b = partes[1];

        IO.println(nova.findContato(a,b));
    }

    void removerTelefone(Agenda nova){

        int indice = Integer.parseInt(IO.readln("Insira o indice do contado: "));
        String rotulo = IO.readln("Insira o rotulo do telefone: ");

        nova.removeTelefone(rotulo,indice-1);
    }

    void removerEmail(Agenda nova){

        int indice = Integer.parseInt(IO.readln("Insira o indice do contado: "));
        String rotulo = IO.readln("Insira o rotulo do email: ");

        nova.removeEmail(rotulo,indice-1);

    }

    void updateTelefone(Agenda nova){

        int indice = Integer.parseInt(IO.readln("Insira o indice do contado: "));
        String rotulo = IO.readln("Insira o rotulo do telefone que deseja atualizar: ");
        String telefone = IO.readln("Insira o novo telefone: ");

        nova.updateTelefone(rotulo,telefone,indice-1);

    }

    void updateEmail(Agenda nova){

        int indice = Integer.parseInt(IO.readln("Insira o indice do contado: "));
        String rotulo = IO.readln("Insira o rotulo do email que deseja atualizar: ");
        String email = IO.readln("Insira o novo email: ");

        nova.updateEmail(rotulo,email,indice-1);

    }

    void removeContato(Agenda nova){
        int indice = Integer.parseInt(IO.readln("Insira o indice do contado a ser removido: "));
        nova.removeContato(indice-1);
    }

    void listarContatos(Agenda nova){

        IO.println(nova);
    }
}
