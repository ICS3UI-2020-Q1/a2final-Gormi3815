import java.util.Scanner;

/**
 * This program will let the user input a pizza with their desired size and will
 * display a message bassed off of what they ordered.
 * 
 * @author Gormi3815
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    // I'm inputting a few of the integer along with their coralating questions so I can get all of the information that I will need
    System.out.println("What size of pizza would you like 1-20 small, 21-40 medium 40+ large?");
    double labour = ammountOfPizza*.75;
    double diameter = input.nextInt();
    double diameter_cost = diameter * .5;
    System.out.println("How many pizzas would you like?");
    double ammountOfPizza = input.nextInt();
    double costPerPizza = ammountOfPizza * 5;
    double subtotal = labour + diameter_cost + costPerPizza;
    double tax = subtotal * .13;
    double total = subtotal + tax;
    // The next section is for determaning the cost of the order based off of the size, ammount, and tax.
    if (diameter < 20) {
      //If the pizza is less than 20cm this section will play out
      System.out.println("Subtotal " + subtotal + ".");
      System.out.println("Tax is " + tax + ".");
      System.out.println("Your total is " + total + ".");
      System.out.println("We are going to make you a cute little pizza!");
    } else if (diameter < 40) {
      //If the pizza is less than 40cm than this section will play out
      System.out.println("Subtotal " + subtotal + ".");
      System.out.println("Tax is " + tax + ".");
      System.out.println("Your total is " + total + ".");
      System.out.println("This will be delicious!");
    } else if (diameter >= 40) {
      //If the pizza is larger than 40cm than this section will play out
      System.out.println("Subtotal " + subtotal + ".");
      System.out.println("Tax is " + tax + ".");
      System.out.println("Your total is " + total + ".");
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }

  }
}
