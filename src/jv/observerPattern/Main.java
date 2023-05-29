package jv.observerPattern;

public class Main {

    public static void main(String[] args) {
        //Grupo
        Partida partida = new Partida("Flamengo", "Corinthias", "Clássico");
        Partida partida2 = new Partida("Fluminence", "Santos", "Indiferente");

        //usuários
        Humano user = new Humano("Allan");
        user.adicionarEvento(partida);

        Humano user2 = new Humano("Bruna");
        user2.adicionarEvento(partida);
        user2.adicionarEvento(partida2);

        Humano user3 = new Humano("Dhionatã");
        user3.adicionarEvento(partida2);

        //eventos
        partida.fezGol(1, 0, 23);
        partida.fezGol(1, 1, 25);
        partida.setResultadoPrimeiroTempo(1, 1);
        partida.fezGol(2, 1, 90);
        partida.setResultado(2, 1);

        user3.souCurioso(partida);
        partida.getEstado();

        System.out.println("\n-- segundo jogo--");
        partida2.fezGol(0, 1, 90);
        partida2.setResultado(0, 1);

        Humano user4 = new Humano("Marcos");

        user4.souCurioso(partida2);
        partida2.getEstado();

    }
}