package Main

import java.util.*

fun main(){
    var v:String = " "

    println("Masukkan Value")
    v= readLine().toString()
    println("Hasilnya: $v")
    var z:CharArray = v.toCharArray()
    println(z.contentToString())
    println(z)
    var hasil:String = z.joinToString("")

    hasil=hasil.replace("\\s".toRegex(),"")
    val newstr = hasil.chunked(1).joinToString("-")
    println(newstr)
}
