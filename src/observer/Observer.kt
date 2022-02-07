package observer

/*
Created by Dhionatã on 2/7/2022
*/
interface Observer {
    fun update(homeTeamGoals: Int, awayTeamGoals: Int, time: Int, event: String, eventName: String, teamGol: String)
}