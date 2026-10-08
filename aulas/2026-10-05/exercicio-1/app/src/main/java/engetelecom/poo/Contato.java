package engetelecom.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;

        this.telefones = new HashMap<String,Telefone>();
        this.emails = new HashMap<String,Email>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String rotulo, String telefone){

        if(telefones.containsKey(rotulo)){
            return false;
        }
        telefones.put(rotulo, new Telefone(telefone));
        return true;

    }

    public boolean addEmail(String rotulo, String email){

        if(emails.containsKey(rotulo)){
            return false;
        }
        emails.put(rotulo, new Email(email));
        return true;

    }

    public boolean updateEmail(String rotulo, String novoEmail){

        Email email1 = emails.get(rotulo);
        if( email1 != null) { email1.setValor(novoEmail);
            return true;
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String novoTelefone){

        Telefone tel1 = telefones.get(rotulo);
        if( tel1 != null) { tel1.setValor(novoTelefone);
            return true;
        }
        return false;
    }

    public boolean removeTelefone(String rotulo){

        return telefones.remove(rotulo) != null;
    }

    public boolean removeEmail(String rotulo){

        return emails.remove(rotulo) != null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("• Nome: ").append(nome ).append(" ").append(sobrenome).append("\n");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        sb.append("• Data de nascimento: ").append(dataNasc.format(formato)).append("\n");

        if(telefones.size() > 0) {
            sb.append(" Telefones:").append("\n");
            telefones.forEach(((rotulo, telefone) -> sb.append("    - ").append(rotulo).append(" -> ").append(telefone)));
        }

        if(emails.size() > 0) {
            sb.append(" Emails:").append("\n");
            emails.forEach(((rotulo, e) -> sb.append("    - ").append(rotulo).append(" -> ").append(e)));
        }
        return sb.toString();

    }
}
