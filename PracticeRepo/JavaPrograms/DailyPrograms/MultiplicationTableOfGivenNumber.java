/* Write a program to print Multiplication table of a given number... */

  
public class MultiplicationTableOfGivenNumber
{
    System.out.println("Enter a number to print table");
    int num = new  java.util.Scanner(System.in).nextInt();
    for( int i = 1; i<=10; i++)
    {
        System.out.println(num +" * "+ i +" = " + (num*i) );
    }
}
