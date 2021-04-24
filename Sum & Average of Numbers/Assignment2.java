/* Name : Kunj .M. Soni
 * Program : Computer Programmer
 * Student Id : 991591881
 * Topic : Display sum of five numbers; average of five numbers; square root of sum of all five numbers and square of all five numbers which were entered by user .
 */

import java.util.Scanner;
public class Assignment2 {
  public static void main (String[] args){
    double a,b,c,d,e,sum,average;

    Scanner input = new Scanner(System.in);
    System.out.print("Num1");
    a=input.nextDouble();
    
    System.out.print("Num2");
    b=input.nextDouble();
    
    System.out.print("Num3");
    c=input.nextDouble();
    
    System.out.print("Num4");
    d=input.nextDouble();
    
    System.out.print("Num5");
    e=input.nextDouble();
    
    System.out.println("\nNumbers                                 Square of each number");
    System.out.println("_______________________________________  ");
   
    System.out.printf("Num1="+a+"                                 Num1^2= %.2f\n" , Math.pow(a,2));
    System.out.printf("Num2="+b+"                                 Num2^2= %.2f\n" , Math.pow(b,2));
    System.out.printf("Num3="+c+"                                 Num3^2= %.2f\n" , Math.pow(c,2));
    System.out.printf("Num4="+d+"                                 Num4^2= %.2f\n" , Math.pow(d,2));
    System.out.printf("Num5="+e+"                                 Num5^2= %.2f\n\n" , Math.pow(e,2));
    
    sum=a+b+c+d+e;
    System.out.printf("Sum of all numbers = %.2f\n" , sum);
    
    average=sum/5;
    System.out.printf("Average of all numbers = %.2f\n" , average);
    
    System.out.printf("Square Root of Sum = %.2f\n",Math.sqrt(sum));
     
  }
}