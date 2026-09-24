package poo.engtelecom;

public class Aluno {

   private String nome;
   private Endereco endereco;
   private int matricula;

    public Aluno(String nome, Endereco endereco, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", endereco=").append(endereco);
        sb.append(", matricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }
}
