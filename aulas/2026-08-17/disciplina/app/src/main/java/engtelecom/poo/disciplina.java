package engtelecom.poo;

public class disciplina {

    private String name;
    private double prova1;
    private double prova2;
    private double prova3;
    private int faltas;
    private double media;

    public void preencherFaltas(int n){
        faltas = n;
    }

    public void preencherName(String n){
        name = n;
    }

    public void notas(double n[]){
        prova1 = n[0];
        prova2 = n[1];
        prova3 = n[2];
    }

    public double mediaFinal(){
      return media = Math.round((prova1 + prova2 + prova3)/3);
    }

   public String passou() {

       if (media >= 6 && faltas <= 20) {
           return "Aprovado";
       } return "Reprovado";
   }

   public String informaNome(){
        return name;
   }
}
