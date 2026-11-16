package engtelecom.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {

    private String nome;
    private DiasDaSemana[] dias;


    public Disciplina(String nome, DiasDaSemana[] dias) {
        this.nome = nome.toUpperCase();
        this.dias = dias;
    }

    public String getNome() {
        return nome;
    }

    public DiasDaSemana[] getDias() {
        return dias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n• Dia da semana: ").append(dias).append("\n");
        sb.append("• Dias da semana:").append("\n");
        for (int i = 0; i < dias.length; i++) {
            sb.append(" - " + dias[i].extenso).append("\n");
        }
        return sb.toString();
    }
}
