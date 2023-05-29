package jv.observerPattern;

import java.util.ArrayList;

public class Humano implements Observer {
    public String nome;
    public ArrayList<Partida> partidas = new ArrayList<>();
    private int mandantes;
    private int visitantes;
    private int tempo;
    private String acontecimento;
    public String nomeEvento;

    public Humano(String nome) {
        this.nome = nome;
    }

    public void adicionarEvento(Partida partida) {
        partidas.add(partida);
        nomeEvento = partida.nome;
        partida.registerObserver(this);
    }

    public void removerEvento(Partida partida) {
        partidas.remove(partida);
        partida.removeObserver(this);
        System.out.println("O curioso " + this.nome + " saiu!");
    }

    @Override
    public void update(int golsMandantes, int golsVisitantes, int tempo, String acontecimento, String nomeEvento) {
        this.mandantes = golsMandantes;
        this.visitantes = golsVisitantes;
        this.tempo = tempo;
        this.acontecimento = acontecimento;
        this.nomeEvento = nomeEvento;
        display();
    }

    public void display() {
        System.out.println("\n" + nome);
        switch (acontecimento) {
            case "Gol" -> System.out.println("Gol! " + "Minuto: " + tempo + "'\n");
            case "Primeiro Tempo" -> System.out.println("-- Resultado do Primeiro Tempo --\n" +
                    "Mandantes: " + mandantes + "\nVisitantes: " + visitantes);
            case "Resultado da partida" -> {
                for (Partida m : partidas) {
                    System.out.println("Resultado da partida");
                    System.out.println(m.nomeDoMandante + " " + mandantes + " - " + visitantes + " "
                            + m.nomeDoVisitante + "\n");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\n--Humano --" +
                "\nnome: " + nome;
    }

    public void souCurioso(Partida partida) {
        System.out.println("Nome do Curioso --\n" + this.nome);
        adicionarEvento(partida);
        for (Partida p : this.partidas) {
            if (p.nome.equals(this.nomeEvento)) {
                p.getEstado();
            }
        }
        removerEvento(partida);
    }
}
