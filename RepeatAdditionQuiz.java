//package chapter5;

import java.util.Scanner;
import java.util.*;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    ArrayList<Integer> realanswer = new ArrayList<>();

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("What is " + number1 + " * " + number2 + "? ");

    int answer = input.nextInt();
    realanswer.add(answer);

    while (number1 * number2 != answer) {
      System.out.print("Wrong answer. Try again. What is "+ number1 + " * " + number2 + "? ");
      realanswer.add(answer);
      answer = input.nextInt();
      if(realanswer.contains(answer)){
        System.out.print("You already entered" + answer + ".");
      }
    }

    System.out.println("You got it!");
  }
}
