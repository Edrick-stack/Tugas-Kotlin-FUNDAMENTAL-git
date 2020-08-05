fun main() {
    val user = setUser("Edrick", "Create Innovation", 16)
    println(user)
}
fun setUser(name: String, hobby: String, age: Int) =
    "My name is $name \n I like $hobby and, \n I'm $age years old"