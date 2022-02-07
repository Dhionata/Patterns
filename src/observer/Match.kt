package observer

/*
Created by Dhionatã on 2/7/2022
*/
class Match(val nameOfEvent: String, val nameOfHome: String, val nameOfVisitor: String) : Subject {
    private var observers: ArrayList<Observer> = ArrayList()
    private lateinit var event: String
    private lateinit var teamGol: String
    private var home: Int = 0
    private var visitor: Int = 0
    private var time: Int = 0

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(home, visitor, time, event, nameOfEvent, teamGol)
        }

    }

    fun scored(home: Int, visitor: Int, time: Int) {
        this.home = home
        this.visitor = visitor
        this.time = time
        this.event = "Gol"
        this.teamGol = if (home > visitor) nameOfHome else nameOfVisitor
        notifyObservers()
    }

    fun setFirstHalfResult(home: Int, visitor: Int) {
        this.home = home
        this.visitor = visitor
        this.event = "Primeiro Tempo"
        notifyObservers()
    }

    fun setResult(home: Int, visitor: Int) {
        this.home = home
        this.visitor = visitor
        this.event = "Resultado da partida"
        notifyObservers()
    }

    fun getState() {
        println(
            "-- Partida --\nnome: $nameOfEvent\n-- Observadores --$observers\n-- Placar --\nMandantes: $home " +
                    "Visitantes: $visitor \nTempo de jogo: $time\nNome do mandante: $nameOfHome\nNome do visitante: " +
                    nameOfVisitor
        )
    }
}