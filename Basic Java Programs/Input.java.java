import java.util.*;
public class Input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Name:");
    String name = input.next();
    System.out.println("Enter Your Age:");
    String age = input.next();

    System.out.println("I am "+name+"and my Age is "+age);
  }
}
   