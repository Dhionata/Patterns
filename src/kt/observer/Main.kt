package kt.observer

/*
Created by Dhionatã on 2/7/2022
*/
fun main() {
    //Grupo
    val match = Match("Clássico", "Corinthias", "Flamengo")
    val match2 = Match("Indiferente", "Santos", "Fluminence")

    //usuários
    val user = Human("Allan")
    val user2 = Human("Bruna")
    val user3 = Human("Dhionatã")

    //participa de match
    //Allan
    user.addEvent(match)

    //Bruna
    user2.addEvent(match)
    user2.addEvent(match2)

    //Dhionatã
    user3.addEvent(match2)

    //Eventos

    //Flamengo x Corinthians
    match.scored(1, 0, 23)
    match.scored(1, 1, 25)
    match.setFirstHalfResult(1, 1)
    match.scored(2, 1, 90)
    match.setResult(2, 1)
    user3.gossip(match)
    match.getState()

    //Segundo Jogo, Fluminence x Santos
    println("\n-- segundo jogo--")
    match2.scored(0, 1, 90)
    match2.setResult(0, 1)
    val user4 = Human("Marcos")
    user4.gossip(match2)
    match2.getState()
}