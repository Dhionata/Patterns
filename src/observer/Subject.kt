package observer

/*
Created by Dhionatã on 2/7/2022
*/
interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}