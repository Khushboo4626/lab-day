import java.util.Scanner;
class prime{

      public static void main(String args[]){
      System.out.println("enter a number");
        Scanner sc=newScanner(System.in);
          int num=sc.nextInt();
         System.out.println("prime number upto "+num+"-----");
{
       for(int i=1;i<num;i++){
       if(num%i==0)
{
i++;
       System.out.println("number is prime");
}
else{
       System.out.println("number is not prime");
}
}
}
 }
}  

