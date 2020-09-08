package ChallengeNo7_Q1

class MemberFunctions {

    private var power = ""

//// start Lamda Function ///////////////

    fun lambdaFunction() {

        var firstPower = { println("Lamda Function : spiderPower") }
        power = firstPower().toString()
        println(firstPower)


//// End Lamda Function ///////////////

    }





    //// Start inline  Function ///////////////


    inline fun inlineFunction (mpower: String, power: (String) -> Unit) {
        power(mpower)


        //// End inline Function ///////////////


    }


    //// start Local Function ///////////////


    fun localFunction() {
        power = "Local Function"
        fun typePower() {
            println(power)

        }
        typePower()
    }

//// End Local Function ///////////////


}

fun main(args: Array<String>) {

    var m = MemberFunctions()
    m.inlineFunction("Fsater",::println)
    m.lambdaFunction()
    m.localFunction()
}