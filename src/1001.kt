fun main(args: Array<String>) {
    var myPerson = Person("Player")
    println(myPerson.toString())
    myPerson.gainXp(15)
    println(myPerson.toString())
    myPerson.gainXp(20)
    println(myPerson.toString())
    myPerson.gainXp(20)
    println(myPerson.toString())
    myPerson.gainXp(20)
    println(myPerson.toString())
    myPerson.gainXp(20)
    println(myPerson.toString())
    myPerson.gainXp(30)
    println(myPerson.toString())
    myPerson.gainXp(30)
    println(myPerson.toString())
    myPerson.Death(270)
    println(myPerson.toString())
}

class Person (var name : String,
              private var lvl: Int = 1,
              private var hp : Double = 100.0,
              var xp: Int = 0,
              private var nextLvlXp : Int = 10,
              var hp1 :Double = hp,
              var Deathpenalty : Double = hp){

    override fun toString(): String{
        return "Name: $name, Lvl: $lvl, Hp: $hp, xp: $xp, xp for next xp: $nextLvlXp"
    }

    fun gainXp (gainedXp : Int) {
        xp += gainedXp
        if (xp >= nextLvlXp){
            lvl += 1
            xp=xp-nextLvlXp
            nextLvlXp += 5
            hp +=20
            hp1=hp
            println("Lvl up " + hp1)
        }
    }

    fun Death (Deathpenalty: Int){
        hp -= Deathpenalty
        if (hp <= 0){
            xp = xp / 2
            hp=0.05*hp1
            println("Death..." +
                    "And now..." +
                    "Rise!")
        }


    }




}

fun Person.MyCollHAckingMethod(gainedXp: Int){
    xp += gainedXp
}