//Create the start for the Scanner and Random Generator
import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    //Create the Scanner and Random Generator 
    Scanner scan = new Scanner(System.in);
    Random rand = new Random ();

    //Space
    System.out.println("");

    //Display door to the user  
    System.out.println("+____+");
    System.out.println("|    |");
    System.out.println("|   0|");
    System.out.println("|    |");
    System.out.println("+____+");
    System.out.println("A door has appeared!");

    //Space
    System.out.println("");

    //Ask the user if they would like to open the door
    System.out.println("Open?" + " Enter yes or no.");

    //Declare a variable to store users answer 
    String door = scan.nextLine();

    //If yes, the user is greeted by the character. If no, the user will recive dialog and the program will end   
    if(door.equals("yes")){

      //Space
     System.out.println("");

     //Display door + eyes to the user 
     System.out.println("+____+");
     System.out.println("|    |");
     System.out.println(" ◕ ◕ ");
     System.out.println("|    |");
     System.out.println("+____+");

     //Space
     System.out.println("");

    }else{
      //Space
      System.out.println("");

      //Display the dialog to the user 
      System.out.println("I guess you will never know what's behind the door...GOODBYE.");

      //The code ends here. Click run to start over
      System.exit(1);
    }

    //Greet and ask the user if they want to play
    System.out.println("༼ ᕤ ◕ ◡ ◕ ༽ᕤ " + " Hello! I'm so lonely...Would you like to play Rock,Paper,Scissors with me??");

    //Space
    System.out.println("");

    //Give the user the option of yes or no
    System.out.println("yes or no?");

    //Declare vairiable to store the users answer
    String play = scan.nextLine();

    //If yes, continue. If no, the program will display dialog and end 
    if(play.equals("yes") ){

      //Space
      System.out.println("");

      //Display character dialog 
      System.out.println("ᕕ༼ ✿ •̀ ︿ •́ ༽ᕗ"+ " Alright! Bring it on!"); 

      //Space
      System.out.println("");

      //Display thinking dots
      System.out.println(" o   o   o   o   o   o   o    o   o ");

      //Space
      System.out.println("");

     //Declare a variable to store users name
     String name = "";

     //Create a scanner to read in the users name 
     Scanner scan1 = new Scanner(System.in);

    //Display character dialog and ask the user to enter their name
    System.out.println("ᕙ༼* ◕  _  ◕ *༽ᕤ" + " Before we begin, what is your name?");

    //Space 
    System.out.println("");

    //Initialize the name variable 
    name = scan1.next();

    //Space
    System.out.println("");

    //Character dialog 
    System.out.println("༼ •̀  ں  •́ ༽" + " OK " + name + "! " + "There will be 3 rounds. Get ready to loose!");

    //Call back
    computerMethod();

    }else{
      //Space
      System.out.println("");
      //Display character dialog 
      System.out.println("༼ ಠ  ͟ʖ  ಠ ༽" + " FINE! BYE.");
      //Space
      System.out.println("");
      //Character leaves
      System.out.println("+____+");
      System.out.println("|    |");
      System.out.println("|   0|");
      System.out.println("|    |");
      System.out.println("+____+");
      System.out.println("*SLAMS*");

      //End program 
      System.exit(1);
    }
  }

  //Method for game function 
  public static void computerMethod() {

    //Determining varaibles
    boolean game = true;

    //Variable for the users score
    int userWins = 0;

    //Variable for computers score 
    int blobWins = 0;

    //Variable for computer turns
    int cMove = 0;

    //Variables for the users choice between rock (r), paper (p), scissors (s) 
    String choice = "";
    String uMove = "";

 
     //Create a while loop
     //First line makes the game go up to 3 rounds
    while (game && (userWins < 3 && blobWins < 3)){
     Scanner scan = new Scanner(System.in);
     Random rand = new Random();

     //Space
     System.out.println("");

     //Divider
     System.out.println("------------------------------------");

     //Display the choices of either rock, paper, or scissors to the user
     System.out.println( "⋌༼ •̀  ⌂  •́ ༽⋋ " + "Choose Rock (r), Paper (p), or Scissors (s)");

     //The program will read the users input 
     choice = scan.next();

     //The program will generate a random move out of the three choices 
     cMove = rand.nextInt(3);

     //Create if statement for point system and initializing the users input
     if (cMove== 0){
       uMove = "r";
      } 
      else if (cMove== 1){
        uMove = "p";
      }
      else {
        uMove = "s";
      }

      if(choice.equals("r")) {
        if(uMove.equals(choice)) {
          //Display character dialog and random move to the user 
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);

          //Space
          System.out.println(""); 

          //Display. It is a tie
          System.out.println("ヽ༼ ⊙ _ ⊙༽ﾉ" + "TIE");
        }
        if(uMove.equals("s")) { 
          //Display character dialog and random move to the user 
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);

          //Space
          System.out.println("");

          //Display. The user has won this round
          System.out.println("ヽ༼ ಠ 益 ಠ ༽ﾉ" + "You win this round...");

          //Add point to users variable
          userWins++;
        }
        if (uMove.equals("p")) {
          //Display character dialog and random move to the user 
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);

          //Space
          System.out.println("");

          //Display. The character/computer has won this round
          System.out.println("ᕙ༼*◕ _ ◕*༽ᕤ" + "Im too good");

          //Add point to the computer's variable
          blobWins++;
        }

        
       else if (choice.equals("p")){
         if (uMove.equals(choice)) {
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);
          System.out.println("ヽ༼ ⊙ _ ⊙༽ﾉ" + "TIE");
        }
         if (uMove.equals("s")) {
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);
          System.out.println("ᕙ༼*◕ _ ◕*༽ᕤ" + "Im too good");
          //Add point to computer
          blobWins++;
         }
         if (uMove.equals("r")) {
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);
          System.out.println("ヽ༼ ಠ 益 ಠ ༽ﾉ" + "You win this round...");
          //Add point to user
          userWins++;
         }
        }
       else {
         if (uMove.equals(choice)) {
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);
          System.out.println("ヽ༼ ⊙ _ ⊙༽ﾉ" + "TIE");
         }
         if (uMove.equals("p")) {
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);
          System.out.println("ヽ༼ ಠ 益 ಠ ༽ﾉ" + "You win this round...");
          //Add point to user
          userWins++;
         }else{
          System.out.println("༼ ◔  ⌂  ◔ ༽/" + "MY TURN!" + "I CHOOSE-" + uMove);
          System.out.println("ᕙ༼*◕ _ ◕*༽ᕤ" + "Im too good");
          //Add point to computer
          blobWins++;
         }
       }
      }

      if (userWins==3) {
       System.out.println("༼つ ಠ 益 ಠ༽つ ─=≡ΣO" + "I refuse to belive I lost!");
       //Space
       System.out.println("");
       //Character leaves
       System.out.println("+____+");
       System.out.println("|    |");
       System.out.println("|   0|");
       System.out.println("|    |");
       System.out.println("+____+");
       System.out.println("*SLAMS*");
       //Code ends
      }
    else {
      System.out.println("c༼ ͡°  ͜ʖ  ͡° ༽⊃ WOW looks like i won! sorry i'm too good for you.");
       //Space
       System.out.println("");
       //Blob leaves
       System.out.println("+____+");
       System.out.println("|    |");
       System.out.println("|   0|");
       System.out.println("|    |");
       System.out.println("+____+");
       System.out.println("{Good Game} I shall wait for a more worthy player");
       //Code ends 
      }
    }
  }
}
