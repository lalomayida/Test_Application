package com.example.test_application

fun main(){
    var intValue:Boolean = false;
    var stringValue: String = "Me llamo Juan? "

    var resultado2:String = stringValue + " " + intValue.toString()

    println(resultado2)
    println("$resultado2")

    var str1 = 11
    var str2: String? = str1 as? String
    println("El string es " + str2)

    var a: Int = 10
    var b: Int = 5
    var c: Int = a+b
    println("la suma es: "+ c)
    println("la suma es:  $c")

    // Ejemplo uso de /
    var dividendo: Byte = 54
    var divisor: Byte = 6
    var resultado: Int = dividendo/divisor

    println("El resultado es "+resultado)
    println("El resultado es $resultado")

    val once:Int = 11
    val veinte:Int = 20

    val resta:Int = veinte-once
    println(veinte)
    println("El resultado es:"+resta)

    val num1:Int = 5
    val num2:Int = 6
    val producto:Int = num1 * num2
    println("Sintaxis completa\n\tEl producto es: " + producto )
    println("Sintaxis abreviada\n\tEl producto es: $producto")

    if(a<b)
        print("$a es menor que "+ b)
    else
        print("$b es menor que "+ a)

    var rand: Int = (Math.random() * (50 - 0 + 1)).toInt()

    if(rand > 25) println("El numero $rand es mayor a 25")
    else println("El numero $rand es menor a 25")

    var miNumero = 10
    var miOtroNumero = 12
    println("El resultado es " + (miNumero != miOtroNumero))
    println("El resultado es ${(miNumero != miOtroNumero)}")

    var goles: Byte = 2
    var golesVuelta : Byte = 2
    if (golesVuelta <= goles){
        println("No se logró, solo se hicieron $golesVuelta y necesitaban "+(goles+1))
    }
    else println("Se jugó y se ganó, gg")


    var valueOne:Boolean = false;
    var valueTwo:Boolean = true;

    if (valueOne == valueTwo) println("=") else println("!=");

    val doce:Int = 12
    val veintiuno:Int = 21

    var r = 5
    r %= 10
    println(r)


    if(veinte>once)
        print("El numero mayor es: $veintiuno")
    else
        print("El numero menor es: $doce")

    val tamaño: Long = Math.round((Math.random() * 10) + 10)
    val promedio:Int = 15
    val importa:Boolean = true
    if (importa && tamaño >= promedio)
        println("Bien compadre. $tamaño")
    else
        println("Camara no te agüites. $tamaño")

    var xer: Int = 1
    xer *= 5
    println("El resultado es " + xer)
    println("El resultado es $xer")

    var loop = 5
    while (loop > 0){
        println("Despegue en $loop")
        //println("Despegue en "+loop)
        loop--
        if(loop == 0){
            println("Despegue!")
        }
    }

    var x: Int = 5
    for(i in 1..3)
    {
        x += 1
        println("Final x: $x")
    }

    var counterVariable:Int = 30;
    for (i in 8 downTo 0 step 2) {
        counterVariable -= 1;
        println(counterVariable);
    }

    var y: Int = 1
    when (y) {
        1 -> print("x = 1")
        2 -> print("x = 2")
        else -> {
            print("pos nada")
        }
    }

    var month:Int = 6
    when (month) {
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> {
            print("No corresponde a ningún mes del año")
        }
    }

    if(true) println("Verdadero")

    var edad=12
    while (edad <= 18){
        if (edad < 18){
            println("Menor de edad")
        }
        else println("A beber")
        edad++;
    }
    var cero = 0;
    while (cero < 10){
        if (cero < 8){
            println("Numero")
        }
        else println("Restante")
        cero++;
    }


    }