package engtelecom.poo;

public class Robozinho {

    private final int MAX_BATERIA = 100;
    private final int MIN_BATERIA = 0;
    private boolean status;  // ligado ou desligado
    private int bateria;
    private String nome;
    private final int id;
    private static int totalRobozinhos = 0;

    //instanciar e trocar os dados;

    public Robozinho(String nome) {
        this.status = false;
        this.nome = nome;
        id = ++totalRobozinhos;
        this.bateria = 100;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // mudar de status e retornar informações;

    public void ligarDesligar(){
        status = !status;
    }

    public boolean informaEstado(){
        return status;
    }

    public static int retornaTotalRobozinhos(){
        return totalRobozinhos;
    }


    // bateria;

    private void gastaBateria(){
        bateria = Math.max(0,bateria - 10);
        if (bateria == 0) {
            status = false;
        }
    }

    public void carregarBateria(){
        bateria = Math.min(MAX_BATERIA, bateria + 10);
    }

    public int retornaBateria(){
        return bateria;
    }


    // ações / movimentação;



}
