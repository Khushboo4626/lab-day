/*write a program to illustrate calculator class with addition, subtraction, multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading
by Khushboo Sharma*/
import java.util.Scanner;
class cal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);//input from the user
         System.out.println("enter first number");
         int first=sc.nextInt();//first number enter by user
        System.out.println("enter second number");
         int second=sc.nextInt();//second number enter by user
         System.out.println("enter operator");
         System.out.println("for addition +");
         System.out.println("for subtraction -");
         System.out.println("for multiplication *");
         System.out.println("for division /");
       char op=sc.next().charAt(0);
       int result;
       switch(op)
       {
         case'+'://case first to add numbers
         result = first+second;
         System.out.println(first+" "+op+" "+second+"="+result);
         break;

         case'-'://case  second to subtract numbers
         result = first-second;
         System.out.println(first+" "+op+" "+second+"="+result);
         break;

         case'*'://case third to multiply numbers
         result = first*second;
         System.out.println(first+" "+op+" "+second+"="+result);
         break;

         case'/'://case fourth to divide numbers
         result = first/second;
         System.out.println(first+" "+op+" "+second+"="+result);

         default://default case when input  is wrong
         System.out.println("invalid input");
       }
        
    }

}