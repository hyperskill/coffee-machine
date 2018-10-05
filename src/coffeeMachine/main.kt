package coffeeMachine

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val water = 1200
    val milk = 540
    val coffeeBeans = 120
    val disposableCups = 9
    val money = 550

    print_state(water, milk, coffeeBeans, disposableCups, money)

    print("Write action (buy, fill, take):")
    val action = scanner.next()
    when (action) {
        "buy" -> buy(water, milk, coffeeBeans, disposableCups, money)
        "fill" -> fill(water, milk, coffeeBeans, disposableCups, money)
        "take" -> take(water, milk, coffeeBeans, disposableCups, money)
        else -> print("Unknown action")
    }
}

fun buy(water: Int, milk: Int, coffeeBeans: Int, disposableCups: Int, money: Int) {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
    val scanner = Scanner(System.`in`)
    when (scanner.next()) {
        "1", "espresso" -> print_state(water - 250, milk, coffeeBeans - 16, disposableCups - 1, money + 4)
        "2", "latte" -> print_state(water - 350, milk - 75, coffeeBeans - 20, disposableCups - 1, money + 7)
        "3", "cappuccino" -> print_state(water - 200, milk - 100, coffeeBeans - 12, disposableCups - 1, money + 6)
        else -> print("Unknowm coffee type")
    }
}

fun fill(water: Int, milk: Int, coffeeBeans: Int, disposableCups: Int, money: Int) {
    val scanner = Scanner(System.`in`)
    print("Write how many ml of water do you want to add:")
    val water = water + scanner.nextInt()
    print("Write how many ml of milk do you want to add:")
    val milk = milk + scanner.nextInt()
    print("Write how many grams of coffee beans do you want to add:")
    val coffeeBeans = coffeeBeans + scanner.nextInt()
    print("Write how many disposable cups of coffee do you want to add:")
    val disposableCups = disposableCups + scanner.nextInt()
    print_state(water, milk, coffeeBeans, disposableCups, money)
}

fun take(water: Int, milk: Int, coffeeBeans: Int, disposableCups: Int, money: Int) {
    println("I gave you $money")
    print_state(water, milk, coffeeBeans, disposableCups, money-money)
}

fun print_state(water: Int, milk: Int, coffeeBeans: Int, disposableCups: Int, money: Int) {
    println("""The coffee machine has:
                $water of water
                $milk of milk
                $coffeeBeans of coffee beans
                $disposableCups of disposable cups
                $money of money""")
}