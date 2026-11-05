package engetelecom.poo.superClasse;

public abstract class Funcionario {
        protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calculaSalario();

}
