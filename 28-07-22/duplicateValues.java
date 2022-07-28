/*write a jaVA program to print number of duplicate values in array
by Khushboo Sharma*/
import util.Scanner;
class duplicateValues
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int ar[]=new int[size];//creating an array
    int length = sc.nextInt();
    System.out.println("Enter "+length+"values:");

for(int i=0;i<length;i++)
{
    arr[i]=sc.nextInt();
}
System.out.println("duplicate in an  array");
    }

    //creating method for printing  duplicate values
    public static void main(int length)
    {
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                if(arr[i]==arr[j]);
                System.out.println("");
            }
        }
    }
}