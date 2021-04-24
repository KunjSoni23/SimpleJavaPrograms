/* Name : Kunj .M. Soni
 * Assignment : Assignment3
 * Program : Computer Programmer
 * Topic : Display whether number 1 and 2 are equal or not and if not then display which one is larger.
 */

import java.util.Scanner;
public class Assignment3a {
  public static void main (String[] args){

    int a,b;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Number1= ");
    a=input.nextInt();
    
    System.out.print("Number2= ");
    b=input.nextInt();
    
    if(a==b)
    {
      System.out.println("The two Numbers are equal");
    }
    else
    {
      if(a>b){
      System.out.println("The two numbers are not equal and Number1("+a+") is larger one.");
      }
      else{
      System.out.println("The two numbers are not equal and Number2("+b+") is larger one.");
      }
    }
  }
}