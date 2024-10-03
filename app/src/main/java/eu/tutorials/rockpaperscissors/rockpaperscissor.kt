package eu.tutorials.rockpaperscissors

fun main() {
    val computerchoice: String
    var userchoice: String
    println("Enter your choice ? :- Rock , Paper, Scissors")
    userchoice = readln().lowercase()

    while(userchoice!="rock" && userchoice!="paper" && userchoice!= "scissors"){
        println("Invalid choice")
        println("Enter your choice ? :- Rock , Paper, Scissors")
        userchoice = readln().lowercase()
    }

    val randomnumber = (1..3).random()

    if(randomnumber ==1){
        computerchoice="rock"
    }
    else if (randomnumber ==2){
        computerchoice="paper"
    }
    else{
        computerchoice="scissors"
    }
    print(computerchoice)


    val winner = when{
        userchoice == computerchoice -> "Draw"
        userchoice == "rock" && computerchoice =="paper" -> "Computer win!"
        userchoice == "paper" && computerchoice =="scissors" -> "Computer win!"
        userchoice == "scissors" && computerchoice =="rock" -> "Computer win!"
        else -> "User win!"
    }

    if (winner == "Draw")
    {
        println("\nIts a Tie")
    } else if (winner == "Computer win!"){
        println("\nComputer win!")
    }else{
        println("\nUser win!")
    }

}

