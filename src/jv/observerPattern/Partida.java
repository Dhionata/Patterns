package jv.observerPattern;

import java.util.ArrayList;

public class Partida implements Subject {
    public String nome;
    private final ArrayList<Observer> observers;
    private int mandante;
    private int visitante;
    private int tempo;
    public String nomeDoMandante;
    public String nomeDoVisitante;
    private String evento;

    public Partida(String nomeMandante, String nomeVisitante, String nome) {
        this.nome = nome;
        this.nomeDoMandante = nomeMandante;
        this.nomeDoVisitante = nomeVisitante;
        observers = new ArrayList<>();

    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(mandante, visitante, tempo, evento, nome);
        }
    }

    public void mudancaDeEstado() {
        notifyObservers();
    }

    public void fezGol(int mandante, int visitante, int tempo) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.tempo = tempo;
        this.evento = "Gol";
        mudancaDeEstado();
    }

    public void setResultadoPrimeiroTempo(int mandante, int visitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.evento = "Primeiro Tempo";
        mudancaDeEstado();
    }

    public void setResultado(int mandante, int visitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.evento = "Resultado da partida";
        mudancaDeEstado();
    }

    public void getEstado() {
        System.out.println("\n-- Partida --" +
                "\nnome: " + nome + '\'' +
                "\n-- Observadores --\n" + observers +
                "\n-- Placar --\n" +
                "\nmandantes: " + mandante +
                "\nvisitantes: " + visitante +
                "\ntime: " + tempo +
                "\nNome do mandante: " + nomeDoMandante +
                "\nNome do visitante: " + nomeDoVisitante);
    }
}
