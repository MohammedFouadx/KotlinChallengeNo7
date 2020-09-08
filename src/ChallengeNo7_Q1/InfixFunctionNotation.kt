package ChallengeNo7_Q1

class InfixFunctionNotation(firstPowers :String) {


    var powers = mutableListOf<String>()

    init {
        powers.add(firstPowers)
    }


}


fun main(args: Array<String>) {

    var spider = InfixFunctionNotation("faster")
    spider.showWidth("Sleeping")

}

infix fun InfixFunctionNotation.showWidth(power:String){

    powers.add(power)

    for (p in powers){
        println(p)
    }

}



