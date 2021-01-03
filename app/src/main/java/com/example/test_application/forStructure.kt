package com.example.test_application

import java.util.*
import kotlin.system.measureNanoTime

fun main() {
    //Paco-----------------------------

    if(false && true) println("Esto no se va a imprimir")

    if(true || false){
        println("Esto se va a imprimir")
    }

    //Lalo-----------------------------
    // For loop
    println("For loop: ")
    for (i in 0..10) { println(i) }

    // ForEach
    println("\nFor each: ")
    (0..10).forEach { println(it) }

    println("ForLoop Time: " + measureNanoTime {
        for (i in 0 until 10000) { var myVariable = 2 }
    })

    println("ForEach Time: " + measureNanoTime {
        (0 until 10000).forEach { var myVariable = 2 }
    })

    /*
        Int range --> use for-loop.
        If it is collection --> use forEach.
        If it uses continue and break --> use for-loop.
    */

    //Leo-----------------------------
    val input = Scanner(System.`in`)
    print("Ingrese el numero del mes del año: ")
    when(input.nextInt())
    {
        in 1..3 -> println("Es primavera!")
        in 4..6-> println("Es verano!")
        in 7..9 -> println("Es otoño!")
        in 10..12 -> println("Es invierno!")
        !in 1..12 -> println("Ingresar mes terrestre")

    }


    val something: Any = 345678
    when(something)
    {
        is Int -> println("Es entero")
        is String -> println("Es entero")
        is Double -> println("Es entero")
        else -> println("No se cual mas F")
    }

    //Jose----------------------------------
    print("for (indice in 9 downTo 1 print(indice) = ")
    for (indice in 9 downTo 1 step 2) print("$indice ")
    println()

    var myTexto = "Computadora"

    for(letter in myTexto){
        println("letter")
    }

    // Jorge ------------------------------
    // mis while
    var edad = 12
    while (edad <= 18) {
        if (edad < 18) {
            println("Menor de edad")
        } else println("Ya eres legal")
        edad++;
    }

    var flag : Boolean = true
    var attempts = 1
    val answer  = 9
    val reader = Scanner(System.`in`)
    while (flag){
        println("¿Cuánto es 5+4?")
        var input = reader.nextInt()
        if (input == answer){
            flag = false
            println("Correcto")
            println("Le tomó $attempts intentos")
        }
        else {
            println("Incorrecto")
            attempts +=1
        }
    }

    //Jaume-------------------------------
    var y: Int = 1
    when (y) {
        1 -> println("y = 1")
        2 -> println("y = 2")
        else -> {
            print("pos nada")
        }

    }
    print("Ingrese el numero del dia de la semana")
    var semana: Int = readLine()!!.toInt()
    when (semana) {
        1 -> println("es lunes")
        2 -> println("es martes")
        3 -> println("es miercoles")
        4 -> println("es jueves")
        5 -> println("es viernes")
        6 -> println("es sabado")
        7 -> println("es domingo")
        else -> {
            print("no existe ese dia >:v")
        }
    }

//Diego Galvan--------------------------------
    //Uso de ciclo do-while
//Concatenar 5 veces el texto ingresado por el usuario
//Mostrar la cadena de texto que se forma
//Ejercicio 1
    var counter = 0 // contador
    var sentence = "" // concatenara los valores ingresados
    do{
        println("Ingresa una palabra: ")
        /* readLine().toString te permite leer los datos que ingresa
        el usuario, convertirlo a tipo de dato String y almacenarlos en word*/
        val word= readLine().toString()
        sentence += " $word" // concatenacion
        counter++ // aumento de contador
    } while (counter < 5) // condicion a seguir hasta que no se cumpla
    println("Oracion formada: ")
    println("\t $sentence") // resultado

//Ejercicio 2
    var question: String
    do {
        println("¿Eres soltero? Si/No")
        question = readLine().toString()
        println("Bien gallo")
    } while(question.elementAt(0) == 's' || question.elementAt(0) == 'S') // el simbolo ! permite negar sin hacer uso de false
    println("Soldado caido")

}