/* Write a program to print transpose matrix from given matrix  
by Khushboo Sharma*/
import java.util.Scanner;
class transposeMatrix
{
    public static void main(String args[])
    {
        int rows, columns, i, j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        rows=sc.nextInt();
        System.out.println("Enter number of columns");
        columns=sc.nextInt();
    
    int arr[][]=new int[rows][columns];//declaring an array
 System.out.println("Enter values");
    for(i=0;i<rows;i++)//reading values from rows
    {
        for(j=0;j<columns;j++)//reading values from columns

        {
            arr[i][j]=sc.nextInt();
        }
        
    }
  
System.out.println("matrix");//printing values for matrix
for(i=0;i<rows;i++)
{
    for(j=0;j<columns;j++)
    {
        System.out.print(arr[i][j]+" ");
        System.out.println(" ");
    }
}
System.out.println("transpose matrix");//printing values for transpose matrix
for(i=0;i<columns;i++)
{
    for(j=0;j<rows;j++)
    {
        System.out.print(arr[j][i]+" ");
        System.out.println(" ");
    }
    }
    sc.close();//closing scanner
}
    }
