package ChallengeNo7_Q1

class StandardLibraryFunctions {

var normalString:String? = "Mohammed Fouad"

    var x = "Rwad"

////////// Start let Function /////////////////

    fun letFunction() {

       var length =""

        length = if (normalString != null) {

            normalString?.length.toString()

        } else
       {
            "0"
        }

        println("without let function : ${length}")

        var x = normalString?.let {
            it.length
        }?:"0"

        println("let function : ${x}")

        ////////// End let Function /////////////////
    }




////// Start Apply Function ///////////////////////

    fun applyFunction(){

       var name="mohammed".apply {


       }
        println("Apply Function is : "+   name)

////// End Apply Function ///////////////////////
    }




///////// Start also Function /////////////////////


    fun alsoFunction(){

        val numbers = mutableListOf("one", "two", "three")
        numbers
          .also { println("also Function :  The list elements before adding new one: $it") }
          .add("four")

///////// End also Function /////////////////////
    }



    ////// Start with Function //////////////////////

    fun withFunction(){

        val numbers = mutableListOf("one", "two", "three")
        val firstAndLast = with(numbers) {
            "with Function : The first element is ${first()}," +
                    " the last element is ${last()}"
        }
        println(firstAndLast)

////// Start with Function ///////////////////////////////
    }


    //// Start takeif  Function ////////////////////////////////////////


    fun takeifFunction(){

        val str = "Hello"
        val caps = str.takeIf { it.isNotEmpty() }?.toUpperCase()
        println("takeif Function : "+caps)

 //// End takeif  Function ////////////////////////////////////////
    }


    ////////// Start run Function //////////////////

    fun runFunction(){

        val message = StringBuilder()
        val numberOfCharacters = message.run {
            append("This is a transformation function.")
            append("It takes a StringBuilder instance and returns the number of characters in the generated String")
            length

        }
            println("run Function : "+numberOfCharacters)

////////// run Function //////////////////

    }





    }


fun main(args:Array<String>){

    var let = StandardLibraryFunctions()
    let.letFunction()


    var apply = StandardLibraryFunctions()
    apply.applyFunction()


    var also = StandardLibraryFunctions()
    also.alsoFunction()


    var with = StandardLibraryFunctions()
    with.withFunction()

    var takeif= StandardLibraryFunctions()
    takeif.takeifFunction()


    var run= StandardLibraryFunctions()
    run.runFunction()



    }




