fun main(){
    // High Order Function (HOF)

    // Lambda Expressions

    // Parameter -> Return Type = { value (body lambda) }
    val square : (Int) -> Int = { value -> value * value}

    val squareOther = { value: Int -> value * value}

    // if one parameter, use it
    val lessThan : (Int) -> Boolean = { it < 20}

    println(square(30))
    println(squareOther(16))
    println(lessThan(23))
    println(lessThan(19))
}