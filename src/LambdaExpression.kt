fun main(){
    // High Order Function (HOF)

    // Lambda Expressions

    // Parameter -> Return Type = { value (body lambda) }
    val square : (Int) -> Int = { value -> value * value}

    val squareOther = { value: Int -> value * value}

    // if one parameter, use it
    val lessThan : (Int) -> Boolean = { it < 20}

    // Anonymous Function
    val generateToken = fun(x: String) : String = "Token: $x"

    println(square(30))
    println(squareOther(16))
    println(lessThan(23))
    println(lessThan(19))
    println(generateToken("#nabungGan"))

    // Lambda Expression, passing parameter
    val generateToken2 : (String) -> String = { "Token: $it" }
    fun checkToken(userInput: String, createToken: (String) -> String){
        val secretKey = "Token: 2020"
        val userKey = createToken(userInput)

        if (secretKey == userKey) print("Success")
        else print("Failed")
    }
    // Passing parameter generateToken2
    checkToken("2022", generateToken2)
}