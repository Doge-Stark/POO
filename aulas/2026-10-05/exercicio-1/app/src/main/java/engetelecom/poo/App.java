
package engetelecom.poo;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    Agenda nova = new Agenda();
    public static void main(String[] args) throws InterruptedException {

        App app = new App();
        app.interfaceAgenda();


    }

    public int interfaceAgenda() throws InterruptedException {
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
                case 11: saida(); return 0;
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

    void saida() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            IO.print("\rSaindo.   ");
            Thread.sleep(500);

            IO.print("\rSaindo..  ");
            Thread.sleep(500);

            IO.print("\rSaindo...");
            Thread.sleep(500);
        }
        IO.print("\n".repeat(30));
        IO.println("\nPrograma encerrado!");
    }

}
