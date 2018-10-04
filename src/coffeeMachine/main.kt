package coffeeMachine

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Write how many cups of coffee you will need: ")
    val count = scanner.nextInt()

    println("For $count cups of coffee you will need:")
    println("${count*200} ml of water")
    println("${count*50} ml of milk")
    println("${count*15} g of coffee beans")
}