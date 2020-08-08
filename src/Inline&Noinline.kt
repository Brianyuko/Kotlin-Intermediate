fun main(){
    checkToken("1010", generateToken, doNothing)
}
val generateToken: (String) -> String = { "Token: $it"}
val doNothing: () -> Unit = {}

inline fun checkToken(userInput: String, checkToken: (String) -> String,
                        noinline doNothing: () -> Unit){
    val secretKey = "Token: 1010"
    val userKey = checkToken(userInput)

    if (secretKey == userKey) print("Success")
    else print("Failed")
}