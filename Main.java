
/*
Mini Project 1
Group #1: Michael Seitz, Hailey Wisniewski, Samuel Green, Jeremiah Shaw
Date: (whatever date you turn it in)
*/
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int userNum;

    System.out.println("Welcome to the guessing game! \nPlease enter any positive whole number.:");
    if (s.hasNextInt()) userNum = s.nextInt(); //exception handling in case user does not enter an integer. Force to 10.
    else {
      System.out.println("Your input was invalid and the number has been set to 20");
      userNum = 20;
    }
    userNum = Math.abs(userNum); //address negative int entries.
    Random r = new Random();
    int randomNum = r.nextInt(userNum) +1;

    System.out.println("A random number to guess has been generated.");

    playGame(randomNum, userNum);
  }

  static void playGame(int toGuess, int userNum1) {
    Scanner t = new Scanner(System.in);
    int userGuess;
    System.out.println("Please guess a number between 0 and " + userNum1);
    userGuess = t.nextInt();
    int numTries = 1;

    while (numTries < 20 && userGuess != toGuess) { //right now this limits tries to 20 in case user puts in very high numbers
      if (userGuess < toGuess) {
        System.out.println("Your guess is too low. Guess higher. \nPlease enter your new guess:");
        numTries++;
        userGuess = t.nextInt();
      } else if (userGuess > toGuess) {
        System.out.println("Your guess is too high. Guess lower. \nPlease enter your new guess:");
        numTries++;
        userGuess = t.nextInt();

      }
    }

    if (userGuess == toGuess) {
      System.out.println("GREAT YOU WIN! It took " + numTries + " attempts.");
    }
    if (numTries == 20) {
      System.out.println("Too many guesses. You lose.");
    }
  }
}
