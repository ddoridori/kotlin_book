
fun main(){
    println(strLen("abc"))  // 3
    println(strLen(null))   // 0
}

fun strLen(s: String?): Int = s?.length ?: 0

