def fizzBuzz(x: Int): String = {
    x match {
        case fb if (x % 3 == 0 && x % 5 == 0) => "FizzBuzz"
        case f if (x % 3 == 0) => "Fizz"
        case b if (x % 5 == 0) => "Buzz"
        case _  =>  x.toString 
}

}

fizzBuzz(12) 
fizzBuzz(20) 
fizzBuzz(15) 
fizzBuzz(13) 

enum ConsoleColors(val code: String) {
    case CLEARCOLOR extends ConsoleColors("\u001B[0m")
    case RED extends ConsoleColors("\u001B[31m")
    case GREEN extends ConsoleColors("\u001B[32m")
    case YELLOW extends ConsoleColors("\u001B[33m")
    case BLUE extends ConsoleColors("\u001B[34m")
    case PURPLE extends ConsoleColors("\u001B[35m")
    case CYAN extends ConsoleColors("\u001B[36m")
    case WHITE extends ConsoleColors("\u001B[37m")

    def apply(text: String): String = s"$code$text${CLEARCOLOR.code}"
}

println(ConsoleColors.RED("Error!"))
ConsoleColors.YELLOW("Warning!")
ConsoleColors.GREEN("Success!")