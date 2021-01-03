// Author: Eduardo Mayida
/**
 * Mobile Apps Development
 */

package com.example.test_application

import java.math.BigDecimal
import java.math.RoundingMode

fun main(){

    var myAge:Float = 55.5F
    println("My Age "+ myAge)

    var cadena: String = "holi"
    var caracter: Char = 'b'
    println(cadena)
    println(caracter)

    var semester:Byte = 7
    println("semestre: " + semester)

    val bool = true
    if(bool) println(":D")
    else println(":(")

    fun typeLong(): Long {
        var num:Long = 3456L
        return num
    }

    fun main(){
        println(typeLong())
    }

    var doADouble: Double = 200.57
    var anotherDouble: Double = 154.23
    println(BigDecimal(doADouble+anotherDouble).setScale(2, RoundingMode.HALF_EVEN))

}