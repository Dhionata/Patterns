package observer

/*
Created by Dhionatã on 2/7/2022
*/

class Human(var name: String) : Observer {
    var matchs: ArrayList<Match> = ArrayList()
    private var home = 0
    private var visitors = 0
    private var time = 0
    private lateinit var event: String
    lateinit var eventName: String
    lateinit var teamGol: String

    fun addEvent(match: Match) {
        matchs.add(match)
        eventName = match.nameOfEvent
        match.registerObserver(this)
    }

    fun removeEvent(match: Match) {
        matchs.remove(match)
        match.removeObserver(this)
        println("\nO curioso $name saiu!\n")
    }

    override fun update(
        homeTeamGoals: Int, awayTeamGoals: Int, time: Int, event: String, eventName: String, teamGol: String
    ) {
        home = homeTeamGoals
        visitors = awayTeamGoals
        this.time = time
        this.event = event
        this.eventName = eventName
        this.teamGol = teamGol
        display()
    }

    fun display() {
        println("\nNotificação para:  $name")
        when (event) {
            "Gol" -> println("Gol! do time $teamGol no minuto: $time'\n")
            "Primeiro Tempo" -> println(
                "-- Resultado do Primeiro Tempo --\nMandantes: $home\nVisitantes: $visitors"
            )
            "Resultado da partida" -> for (m: Match in matchs) {
                println("Resultado da match")
                println("${m.nameOfHome} $home, ${m.nameOfVisitor} $visitors\n")
            }
        }
    }

    override fun toString(): String {
        return ("\n--Humano --\nnome: $name")
    }

    fun gossip(match: Match) {
        println("\n-- Nome do Curioso --\n$name")
        addEvent(match)
        for (p: Match in matchs) {
            if (p.nameOfEvent == eventName) {
                p.getState()
            }
        }
        removeEvent(match)
    }
}
