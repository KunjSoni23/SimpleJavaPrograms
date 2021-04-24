/* Name : Kunj .M. Soni
 * Assignment : Assignment3
 * Program : Computer Programmer
 * Topic : Display whether character 1 and 2 are equal or not.
 */

import java.util.Scanner;
public class Assignment3b {
  public static void main (String[] args){

    char a,b;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Character1= ");
    a=input.next().charAt(0);
    
    System.out.print("Character2= ");
    b=input.next().charAt(0);
    
    if(a==b)
    {
      System.out.println("The two Character are equal");
    }
    else
    {
      System.out.println("The two Character are not equal");
    }
  }
}