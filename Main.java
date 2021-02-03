/*
Mini Project 1
Group #1: Michael Seitz, YourPartnerName1, YourPartnerName2, YourPartnerName3
Date: (whatever date you turn it in)
*/
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    int num;
    Random r = new Random();
    int randomNum = r.nextInt(num)+1;
  
    System.out.println("Welcome to the guessing game! \nPlease enter any positive whole number.:");
    num = s.nextInt(); //the number we are starting with.
    Random r = new Random();
    int randomNum = r.nextInt(num)+1;

    System.out.println("A random number to guess has been generated. \nPlease guess a number between 0 and " +num);
  }
}