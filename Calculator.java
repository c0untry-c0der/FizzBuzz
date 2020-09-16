/* 
This is a basic calculator written in Java, 
it also signifies my first 'real' program written in any language    
*/

// Defining the programs main class
public class Calculator {
    // The constructor method, this gave me trouble bc of the curly brackets placement 
    public Calculator() {}
    // The addition method
    public int add(int a, int b) {
      int sum = a + b;
      return sum;
    }
    //The subtraction method
    public int subtract(int a, int b) {
      int diff = a - b;
      return diff;
    }
    // The multiplication method
    public int multiply(int a, int b) {
      int prod = a * b;
      return prod;
    }
    // The division method 
    public int divide(int a, int b) {
      int value = a / b;
      return value;
    }
    // The remainder of or modulo method
    public int modulo(int a, int b) {
      int remain = a % b;
      return remain;
    }
    // The main method, where all the magic happens on screen
    public static void main(String [ ] args) {
      // Declaring a new calculator instance to call
      Calculator myCalculator = new Calculator();
      
      // Calling the methods defined earlier
      System.out.println(myCalculator.add(5,7));
      System.out.println(myCalculator.subtract(45,11));

      // Assigning variables to the called methods and returning the value in a nicer format
      int val1 = myCalculator.add(3,8);
      int val2 = myCalculator.modulo(10,3);
      int val3 = myCalculator.multiply(2,7);
      
      System.out.println("The sum of 3 + 8 is equal to "+ val1 +"!");
      System.out.println("The remainder of 10 divided by 3 is equal to "+ val2 +"!");
      System.out.println("The product of 2 and 7 is "+ val3 +"!");
    }
}
