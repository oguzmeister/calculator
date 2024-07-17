fun main() {
    while (true) {
        println("Yapmak istediğiniz işlemi seçin: (+, -, *, /) veya çıkmak için 'q' tuşuna basın")
        val operation = readLine()

        if (operation == "q") {
            break
        }

        if (operation !in listOf("+", "-", "*", "/")) {
            println("Geçersiz işlem seçtiniz. Lütfen tekrar deneyin.")
            continue
        }

        println("İlk sayıyı girin:")
        val num1 = readLine()?.toDoubleOrNull()
        if (num1 == null) {
            println("Geçersiz sayı girdiniz. Lütfen tekrar deneyin.")
            continue
        }

        println("İkinci sayıyı girin:")
        val num2 = readLine()?.toDoubleOrNull()
        if (num2 == null) {
            println("Geçersiz sayı girdiniz. Lütfen tekrar deneyin.")
            continue
        }

        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else {
                println("Bir sayıyı 0'a bölemezsiniz.")
                continue
            }
            else -> 0.0
        }

        println("Sonuç: $result")
    }
}
