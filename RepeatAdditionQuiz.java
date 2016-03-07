//package chapter5;

//import api
import java.util.Scanner;
import java.util.*;

//Named the Main class
public class RepeatAdditionQuiz {
  //Make the computer to recognize the class name
  public static void main(String[] args) {
    //Create several variable to make the method used later
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    //Create an ArrayList to memorize the answer the user input before
    ArrayList<Integer> realanswer = new ArrayList<>();

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    //Ask the user the question computer ask
    System.out.print("What is " + number1 + " * " + number2 + "? ");

    //Make the answer be memorize in the variable "answer"
    int answer = input.nextInt();

    //Put the variable inside ArrayList
    realanswer.add(answer);

    //Make a loop to make sure the answer will be correct one
    while (number1 * number2 != answer) {
      //Tell the user the answer is the Wrong one
      System.out.print("Wrong answer. Try again. What is "+ number1 + " * " + number2 + "? ");
      //Make sure the variable could be preserved in the ArrayList
      realanswer.add(answer);
      //Put the answer in the variable answer again
      answer = input.nextInt();
      //Make a if description to tell the user had answer the same one before
      if(realanswer.contains(answer)){
        System.out.print("You already entered" + answer + ".");
      }
    }

    //Tell the user he got the right answer
    System.out.println("You got it!");
  }
}
