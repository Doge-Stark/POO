package engetelecom.poo;

public class Pessoa {

    private String nome;
    private String email;
    private final int id;
    private static int contador = 0;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        id = ++contador;
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\nID: ").append(id);
        sb.append("\nNome: ").append(nome);
        sb.append("\nEmail: ").append(email);

        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getNome() { return nome; }

    public String getEmail() { return email; }
}

