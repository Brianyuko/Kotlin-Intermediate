fun main(){

    // Null Safety
    var name: String? = "Abdul"
    // name = null
    println(name)

    // Safe call
    val result = name?.length
    println(result)

    // Elvis Operator
    val result2 = name?.length ?: "Ini Null"
    println(result2)

    // Not-Null assertion
    val result3 = name!!.length
    // Program akan berhenti sampai sini jika nilainya null
    println(result3)

}