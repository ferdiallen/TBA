package Main

import Class.Extends
import java.util.*


fun main() {
    var x: Int
    println("Selamat datang di menu pencacah kata")
    println("Pilih proses yang ingin diambil: ")
    println("1.Dengan semua simbol")
    println("2.Dengan tanpa unique symbol")
    val Scan = Scanner(System.`in`)
    x = Scan.nextInt()
    if (x == 1) {
        var v: String = " "
        println("Masukkan Value")
        v = readLine().toString()
        val get = Extends()
        get.process(v)
    } else if (x == 2) {
        var v: String = " "
        println("Masukkan Value")
        v = readLine().toString()
        val get = Extends()
        get.process2(v)
    }


}
