fun main() {
    val user = setUser( name= "Irfan", hobby= "Badminton", age= 16 )
    println(user)
}

fun setUser(name: String,hobby: String, age: Int) = "My name is $name, i like $hobby and I,m $age years old"