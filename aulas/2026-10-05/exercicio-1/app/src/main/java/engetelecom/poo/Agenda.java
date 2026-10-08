package engetelecom.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addContato(Contato contato) {

        contatos.add(contato);
        return true;

    }

    public boolean removeContato(int indiceDoContato){

        return this.contatos.remove(indiceDoContato) != null;

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

        return contatos.get(indiceContatoNaLista).addTelefone(rotulo, telefone);
    }

    public boolean addEmail(String rotulo, String email, int indiceContatoNaLista){

        return contatos.get(indiceContatoNaLista).addEmail(rotulo, email);
    }

    public boolean removeTelefone(String rotulo, int indiceContatoNaLista){

        return contatos.get(indiceContatoNaLista).removeTelefone(rotulo);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n================== Agenda ===================\n\n");

        contatos.forEach(((c) -> sb.append(c).append("\n").append("---------------------------------------------\n\n")));
        sb.append("=============================================");
        return sb.toString();
    }
}
