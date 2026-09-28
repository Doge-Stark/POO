package engtelecom.poo;

import java.util.ArrayList;

public class Aviao {

private final int MAX_MOTORES = 8;
private final int MIN_MOTORES = 1;

private int tripulantes;
private int passageiros;
private int combustivel;
private boolean estado;
private int numMotores;
private ArrayList<Motor> propulsores;

    public Aviao(int tripulantes, int passageiros, int combustivel, int numMotores, String tipoMotor) {
        this.tripulantes = tripulantes;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
        this.estado = false;

        this.numMotores = Math.min(Math.max(MIN_MOTORES, numMotores),MAX_MOTORES);
        this.propulsores = new ArrayList<>();
        for (int i = 0; i < numMotores; i++) {
            propulsores.add(new Motor(tipoMotor));
        }
    }

    public void ligarDesligar(){
        this.estado = !estado;
                propulsores.forEach(motor -> motor.setEstado(estado));
    }

    public boolean isligado(){
        return estado;
    }

    public void ligarDesligarMotor(int num){
        propulsores.get(num).ligarDesligar();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aviao: \n");
        sb.append("tripulantes: ").append(tripulantes);
        sb.append("\npassageiros: ").append(passageiros);
        sb.append("\ncombustivel: ").append(combustivel);
        sb.append("\nestado: ").append(estado);
        sb.append("\nnumMotores: ").append(numMotores);
        sb.append("\npropulsores: ").append(propulsores);
        sb.append("\n------------------------------------");
        return sb.toString();
    }
}

