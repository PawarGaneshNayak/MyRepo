/* Write a program to find the Factors of a given number

Ex: num = 20; 
 Factors are : 
1
2
4
5
10
20   
A factor is a number that divides the given number without any remainder */

  public class FactorsOfGivenNumber
  {
      System.out.println("Enter the num to find it's factors....");
      int num = new java.util.Scanner(System.in).nextInt();
      public static void main(String[] args)
      {
          System.out.println("Facters of "+ num +" are :");
          for( int i=1; i<=num; i++)
          {
              if( num % i == 0 )
                  System.out.println(i);
          }    
      }
  }

