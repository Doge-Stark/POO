
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
        while (i < 10) {
            IO.println(
                    """
                            =================== MENU AGENDA ==========================
                            
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
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
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

}
