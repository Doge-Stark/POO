package engetelecom.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda(ArrayList<Contato> contatos) {

        ArrayList<Contato> contatos1 = new ArrayList<>();
    }

    public boolean addContato(Contato contato) {

        contatos.add(contato);
        return true;
    }

    public boolean removeContato(Contato contato) {
        contatos.remove(contato);
        return true;
    }

    public ArrayList<Contato> findContato(String nome, String sobreNome){

        ArrayList<Contato> encontrados = new ArrayList<>();

        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)
                    && c.getSobrenome().equalsIgnoreCase(sobreNome)) {
                encontrados.add(c);
            }
        }

        return encontrados;

    }

    public boolean addTelefone(String rotulo, String telefone, int indiceContatoNaLista){

        contatos.get(indiceContatoNaLista).getTelefones().put(rotulo, new Telefone(telefone));
        return true;
    }

    public boolean addEmail(String rotulo, String email, int indiceContatoNaLista){

        contatos.get(indiceContatoNaLista).getEmails().put(rotulo, new Email(email));
        return true;
    }

    public boolean removeTelefone(String rotulo, int indiceContatoNaLista){

        contatos.get(indiceContatoNaLista).getTelefones().remove(rotulo);
        return true;
    }

    public boolean addEmail(String rotulo, int indiceContatoNaLista){

        contatos.get(indiceContatoNaLista).getEmails().remove(rotulo);
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agenda{");
        sb.append("contatos=").append(contatos);
        sb.append('}');
        return sb.toString();
    }
}
