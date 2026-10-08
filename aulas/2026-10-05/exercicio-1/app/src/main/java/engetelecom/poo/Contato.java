package engetelecom.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc, String rotuloEmail, String email, String rotuloTelefone, String telefone) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;

        this.telefones = new HashMap<String,Telefone>();
        this.emails = new HashMap<String,Email>();

        this.emails.put(rotuloEmail, new Email(email));
        this.telefones.put(rotuloTelefone, new Telefone(telefone));

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

    public HashMap<String, Telefone> getTelefones() {
        return telefones;
    }

    public boolean addTelefone(String rotulo, String telefone){

        telefones.put(rotulo, new Telefone(telefone));
        return true;

    }

    public HashMap<String, Email> getEmails() {
        return emails;
    }

    public boolean addEmail(String rotulo, String email){

        telefones.put(rotulo, new Telefone(email));
        return true;

    }

    public boolean updateEmail(String rotulo, String novoEmail, int indiceContatoNaLista){

        emails.replace(rotulo, new Email(novoEmail));
        return true;
    }

    public boolean updateTelefone(String rotulo, String novoTelefone, int indiceContatoNaLista){

        telefones.replace(rotulo, new Telefone(novoTelefone));
        return true;
    }

    public boolean removeTelefone(String rotulo, int indiceContatoNaLista){

        telefones.remove(rotulo, indiceContatoNaLista);
        return true;
    }

    public boolean removeEmail(String rotulo, int indiceContatoNaLista){

        telefones.remove(rotulo, indiceContatoNaLista);
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contato{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sobrenome='").append(sobrenome).append('\'');
        sb.append(", dataNasc=").append(dataNasc);
        sb.append(", telefones=").append(telefones);
        sb.append(", emails=").append(emails);
        sb.append('}');
        return sb.toString();
    }
}
