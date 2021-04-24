// Student Name:- Kunj .M. Soni
// Student ID:- 991591881.
/* Program :- Find the shape through width and height and after that find area and perimeter of that particular shape.
 Note:- Here h is height and w is width*/ 
import java.util.Scanner;

public class Assignment1 {
  public static void main (String[] args){
    // Create variables to find shape.
    double w, h;
    
    // Prepare Input Scanner
    Scanner input = new Scanner(System.in);
    
    // Get user input for finding shape.
    System.out.print("Enter the width and height of a shape: ");
    w = input.nextDouble();
    h = input.nextDouble();
    
    // For square
    if(w==h)
    {
      System.out.println("The given shape is a square.");
      
      // Calculate area amd perimeter of square
      // The formula for perimeter of square is 4*h.
      // The formula for area of square is h*h.
      
      System.out.print("The Perimeter is: ");
      System.out.println(4 * h);
      
      System.out.print("The Area is: ");
      System.out.println(h * h);
      
      
    }
    // For rectangle
    else
    { 
      System.out.println("The given shape is a rectangle.");
  
      // Calculate area amd perimeter of rectangle
      // The formula for perimeter of rectangle is 2*(h + w).
      // The formula for area of rectangle is w*h.
      
      System.out.print(" The Perimeter is: ");
      System.out.println(2*(h + w));
      
      System.out.print(" The Area is: ");
      System.out.println(w * h);
      
    }
  }
}