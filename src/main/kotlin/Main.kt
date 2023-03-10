fun main() {
    val y = Car("Toyota", "Nganya", "blue", 40 )
    y.carry(56)
    y.identity()
    println( y.calculateParkingFees(2))


    val bus2 = Bus("Scania","3s","green",68)
    println( bus2.maxTripFare(200.0))
    println(bus2.calculateParkingFees(3))
    bus2.identity()



}
//one
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people: Int){
        var b = people-capacity
        if (people ==capacity)
            println("Carrying capacity $people passengers.")
        else println("Over capacity by $b people.")
    }

    fun identity(){
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours:Int):Int{
        var  fee= hours*20
        return fee

    }

}
//two
class Bus(make:String,model:String, color:String,capacity:Int):Car(make,model,color,capacity){
fun maxTripFare(fare:Double):Double{
    return capacity * fare
}
    override fun calculateParkingFees(hours: Int):Int{
       // super.calculateParkingFees(hours)
        var fees = hours* capacity
        return fees

    }

}

