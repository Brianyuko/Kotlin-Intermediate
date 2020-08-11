import java.lang.Exception
import java.lang.IllegalArgumentException

fun main(){

    // Throw
    val formField = 'p'
    // val formField = '2'
    val result = if (formField in 'a'..'z') formField
    else throw  IllegalArgumentException("Huruf antara a sampai z")

    println("Result $result")

    // Try Catch
    val nickName = "Angel"
    // val nickName = "32423"
    try {
        nickName.toInt()
        println(nickName)
    }catch (e: Exception){
        println("tidak bisa name ke int")
        e.printStackTrace()
    }finally {
        println("Testing Done")
    }
}