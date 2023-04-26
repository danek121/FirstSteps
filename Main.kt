import kotlin.random.Random

fun main(args: Array<String>) {
    println("Nauka")
    println("==== MENU ===")
    println("1. Kalkulator")
    println("2. Gra w zgadywanie")
    var x = readln().toInt()   // Zczytywanie danych z klawiatury
    when (x) {
            1 -> calculator()
            2 -> guessGame()
            else -> {
                print("Wybierz tylko 1 lub 2")
            }
        }
}

fun calculator() {
    println("~~~ Oto mój kalkulator ~~~")
    println("Podaj dwie liczby po sobie: ")
    val number1: Float = readln().toFloat()
    val number2: Float = readln().toFloat()

    println("A następnie wybierz jedną z operacji na liczbach")
    println("=== 1.Dodawanie ===")
    println("=== 2.Odejmowanie ===")
    println("=== 3.Mnożenie ===")
    println("=== 4.Dzielenie ===")
    println("=== 5.Powrót do kalkulatora ===")
    println("=== 6.Powrót do głównego menu ===")

    val y = readln().toInt()
    fun suma() {
      println("Liczba: $number1 + liczba: $number2 = ${number1 + number2}")
    }
    fun subt() {
        var sub = number1 - number2
        println("Liczba: $number1 - liczba: $number2 = ${sub.toInt()}")
    }
    fun multi() {
        var mul = number1 * number2

        println("Liczba: $number1 x liczba: $number2 = ${mul.toInt()}")
    }

    fun divi() {
        if (number1.toInt() == 0 || number2.toInt() == 0){   // float nie przyjmuje operatora ==
            println("Nie dzielimy przez 0")
        }else {
            var div = number1 / number2

            println("Liczba: $number1 / liczba: $number2 = ${div.toInt()}")
        }
    }
    when (y) {
        1 -> suma()
        2 -> subt()
        3 -> multi()
        4 -> divi()
        5 -> calculator()
        else -> {
            println("Wybierz tylko dozwolone operacje")
        }
    }
}

fun guessGame() {
    val n = Random.nextInt(1, 11)
    var num: Int
    var i = 0
    var j = 0
    println("Zgadnij jaką liczbę dla Ciebie wylosowałem z zakresu od 1 do 10")
    do {
        i++
        print("Podaj swoją liczbę: ")
        num = readln().toInt()
            if (num >= 11) {
                println("Podany numer wykracza poza zakres!")
            } else if (n > num) {
                println("Wylosowana liczba jest większa od Twojej, spróbuj jeszcze raz!")
            } else if (n < num) {
                println("Wylosowana liczba jest mniejsza od Twojej, spróbuj jeszcze raz!")
            }

    }while (n != num)
    println("Brawo!! Zgadłeś liczbę za $i razem!")
}
