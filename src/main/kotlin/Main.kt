fun main() {
    println(information("Winfrida",22,"Kenya"))
    val myString = "Hello"
    val length = getStringLength(myString)
    println(length)
    identifyMe("Winfrida")
    println(replaceVowelsWith("Hello World"))

}
//1. Write a function that takes in 3 parameters, name, age, and country,
// and returns a String with this structure “Hi, my name is x, I am y years
// old and I am from z.” Where x, y, and z are the provided name, age, and country
// respectively.
fun information(name:String,age:Int,country:String):String{
    return ("Hi my is $name , I am $age years old and I am from $country")

}
//Write a function that takes in a String and returns its length
fun getStringLength(inputString: String): Int {
    return inputString.lengthremotea nts out “That’s me!” when
// your name is passed to it, otherwise,
// it prints out “I don’t know who that is”
fun identifyMe(name: String) {
    val myName = "Winfrida"
    if (name == myName) {
        println("That's me!")
    } else {
        println("I don't know who that is")
    }
}
//Write a Kotlin function that takes in a string will all the vowels replaces by the character
// ‘*’. Use string interpolation to generate the output.
fun replaceVowelsWith(str: String): String {
    val vowels = "aeiouAEIOU"
    var result = ""

    for (c in str) {
        if (c in vowels) {
            result += "*"
        } else {
            result += c
        }
    }

    return "Input: $str Output: $result"
}