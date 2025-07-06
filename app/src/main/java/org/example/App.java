package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Calculate calc = new Calculate();

    System.out.println("Hello World!");

    int a = 2, b = 3;
    System.out.println("Sum of " + a + " and " + b + " is " + calc.sum(a, b)
        + ". Average is " + calc.average(a, b) + ".");

    int start = 1, end = 10;
    System.out.println("Sum of " + start + " to " + end + " is " + calc.sumBetween(start, end)
        + ". Average is " + (calc.sumBetween(start, end) / (double)(end - start + 1)) + ".");

    System.out.println("Sum of odd of " + start + " to " + end + " is " + calc.sumOdd(start, end) + ".");
    System.out.println("Sum of even of " + start + " to " + end + " is " + calc.sumEven(start, end) + ".");
  }
}
