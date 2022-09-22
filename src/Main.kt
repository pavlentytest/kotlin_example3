object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // System.out.println("Hello world!");
        println(isPrime(4))
        println(phi(5))
        print(min(5, 1, 2, -900))
    }

    // Задача №310. Проверка на простоту
    fun isPrime(p: Int): Boolean {
        for (i in 2 until p) {
            if (p % i == 0) {
                return false
            }
        }
        return true
    }

    // Задача №312. Числа Фибоначчи
    fun phi(n: Int): Int {
        return if (n <= 1) 1 else phi(n - 1) + phi(n - 2)
    }

    // Задача №306. Минимум 4 чисел
    fun min(a: Int, b: Int, c: Int, d: Int): Int {
        return Math.min(a, Math.min(b, Math.min(c, d)))
    }
}