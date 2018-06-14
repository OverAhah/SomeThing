fun main(args: Array<String>) {
    var myPerson = Person(readLine() ?: "Player")
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
    myPerson.Death(280)
    println(myPerson.toString())
}

class Person (var name : String,
              private var lvl: Int = 1,
              var Int : Int = 10,
              var Dex : Int = 10,
              var Str : Int = 10,
              private var hp : Double = 100.0,
              var mp : Double = 100.0,
              var xp: Int = 0,
              private var nextLvlXp : Int = 10,
              var hp1 : Double = hp,
              var mp1 : Double = mp,
              var Deathpenalty : Double = hp){

    override fun toString(): String{
        return "Name: $name, Lvl: $lvl, Str : $Str, Dex: $Dex, Int: $Int, Hp: $hp, Mp: $mp, xp: $xp, xp for next xp: $nextLvlXp"
    }

    fun gainXp (gainedXp : Int) {
        xp += gainedXp
        if (xp >= nextLvlXp){
            lvl += 1
            xp=xp-nextLvlXp
            nextLvlXp += 5
            Str += 3
            Dex += 3
            Int += 3
            hp = 10 * Str.toDouble()
            mp = 10 * Int.toDouble()
            hp1 = hp
            mp1 = mp
            println("Lvl up " + hp1)
        }
    }

    fun Death (Deathpenalty: Int){
        hp -= Deathpenalty
        if (hp <= 0){
            xp = xp / 2
            hp = 0.05 * hp1
            mp = 0.05 * mp1
            println("Death...")
            println("And now...")
            println("Rise!")
        }
    }




}

fun Person.MyCollHAckingMethod(gainedXp: Int){
    xp += gainedXp
}