import java.util.scanner;
class sumOfOdd{
public static void main(String args[])
{
int sum,i,N;
scanner = new Scanner(System.in);

System.out.println("enter a number:");

for(i=0;i<=N;i++){

if(i%2!=0)
{
sum += i;
System.out.println("\n Sum of odd numbers are:" +i);
}
}
}
}