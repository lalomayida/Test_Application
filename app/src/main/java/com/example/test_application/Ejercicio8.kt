package com.example.test_application

fun main() {

   forEachTo100000()
   print (nivelDeTemperatura(40,"Alto"))
    calculadora(11,6)
}
/**
 *Calculates operations between two numbers
 * @params num1
 * @params num2
 * @return void
 */
fun calculadora(num1: Int, num2: Int){
    println("Suma: "+suma(num1,num2))
    println("Resta: "+resta(num1,num2))
    println("Multiplicación: "+multiplicacion(num1,num2))
    println("División: "+division(num1,num2))
}
/**
 *Calculates sum between two numbers
 * @params num1
 * @params num2
 * @return num1+num2
 */
fun suma(num1: Int, num2: Int):Int{
    return num1+num2;
}
/**
 *Calculates sum between substraction numbers
 * @params num1
 * @params num2
 * @return num1-num2
 */
fun resta(num1: Int, num2: Int):Int{
    return num1-num2;
}

/**
 *Calculates multiplication between two numbers
 * @params num1
 * @params num2
 * @return num1*num2
 */
fun multiplicacion(num1: Int, num2: Int): Int {
    return (num1*num2);
}

/**
 *Calculates division between two numbers
 * @params num1
 * @params num2
 * @return num1/num2
 */
fun division(num1: Int, num2: Int): Float {
    return num1.toFloat()/num2.toFloat();
}

/**
 * Foreach that prints
 * @return void
 */
fun forEachTo100000(){
    (1..100000).forEach { if(it>90000) println("Sobrepaso") }
}

/**
 *Function that retreives temperature level
 * @params nivelDeTemperatura
 * @params temperatura
 * @return temperatura
 */
fun nivelDeTemperatura(nivelDeTemperatura :Int,temperatura:String): String {
        var nivelDeTemperatura=nivelDeTemperatura;
        var temperatura=temperatura;

    while (nivelDeTemperatura>=22){
        nivelDeTemperatura -= 2
        print("Temperatura: "+nivelDeTemperatura+" - ")
        println("Reduciendo Temperatura")
    }

    temperatura = "Temperatura Confortable"
    return temperatura
}