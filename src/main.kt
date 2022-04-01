//1
//Assignment 6: Inheritance
//1.Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
//-calculateParkingFees(hours: Int) : Calculates andreturns the
//parking fees by multiplying the hours by 20(1 point)

fun main(){

    var car = Car("Mercedes", "GLE 350", "Black",8)
    car.identity()
    car.carryPeople(12)
    println(car.calculateParkingFees(12))

    var bus = Bus("Isuzu","NMR 85H MINI BUS","White",25)
    bus.identity()
    bus.carryPeople(20)
    println(bus.maxTripFare(117.7))
    println(bus.calculateParkingFees(7))

}
open class Car(var make:String,var model:Any, var color:String, var capacity:Int) {


    fun carryPeople(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            var x = people - capacity
            println("Over capacity buy $x people.")
        }
    }


    fun identity() {
        println("I am a $color $make $model ")
    }

    open fun calculateParkingFees(hours:Int):Int{
        var fees = hours * 20
        return fees
    }
}
//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method calledmaxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.
open class Bus( make:String, model:String, color:String, capacity:Int): Car(make, model, color, capacity){
  fun maxTripFare(fare: Double) :Double{
  var maxFare = fare * capacity
      return  maxFare
  }
    override fun calculateParkingFees(hours: Int):Int{
        var fee = hours * capacity
        return fee
    }
}