fun main(args: Array<String>) {

}

open class Item {}

class Weapon (var LvlRequired : Int = 2,
              var Class : String = "Mage") : Item()

open class Armor(var LvlRequired: Int =1,
                  var StrRequired : Int = 10) : Item()

class Potion (var Class: String = "Thief",
                   var LvlRequired: Int = 1) : Item()

class MagicItem (var IntRequired: Int = 20,
                      Class: String = "Mage") :Item()
