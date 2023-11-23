import java.util.Random

data class Foo(val fooValue: Int) {

    companion object {
        fun randomFoo(): Foo {
            val random = Random()
            return Foo(random.nextInt())
        }
    }
}

class classWithComponent1(val value: Int, val value2: Int) {
    operator fun component1(): Int {
        return value
    }
    operator fun component2(): Int {
        return value
    }
}

sealed class Pippo {
    class Pluto(val value: Int) : Pippo()
    class Paperino(val value: Int) : Pippo()
}



fun main(args: Array<String>) {
//    val foo = Foo.randomFoo()
//    println(foo)
//    val newFoo = foo.copy(fooValue = 42)
//    println(newFoo)
//    val (value,  value2) = classWithComponent1(1, 2)
//    println("First value: $value, second value: $value2")
//    val minnie = Minnie()
//    println(minnie)
//    val intMap = mapOf(1 to "one", 2 to "two")

    fun funWithLamda(lambda: () -> Unit){
        println("Executing Lambda...")
        lambda.invoke()
        println("Done !")
    }

    mapOf("Tommi" to "Brini", "Gigi" to "Paguro").map{
        (nome, cognome) ->
        println("Nome : $nome")
        println("Congnome : $cognome")
    }

    fun String.batman() {
        println("$this Batman")
    }

    val x = "NANANANNA"
    x.batman()
    x.let {
        val y = "y"
        println("Let function ${it + y}")
    }
    with(x) {
        val y = "y"
        println("With function ${this + y}")
    }
    x.run { println("Run function $this") }
    val newX = x.apply { println("Apply function $this") }
    
}