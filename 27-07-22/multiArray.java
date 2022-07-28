/* reading the values into multidimensional array 
by Khushboo Sharma*/
import java.util.Scanner;
class multiArray
{
    public static void main(String args[])
    {
        int rows, columns, i, j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        rows=sc.nextInt();
        System.out.println("Enter number of columns");
        columns=sc.nextInt();
        System.out.println("Enter values");
    
    int arr[][]=new int[rows][columns];//declaring an array

    for(i=0;i<rows;i++)//reading values from rows
    {
        for(j=0;j<columns;j++)//reading values from columns

        {
            arr[i][j]=sc.nextInt();
        }
        
    }
//result of array 
    System.out.println("matrices are:");
for(i=0;i<rows;i++)
{
    for(j=0;j<columns;j++)
        {
    
        System.out.print(arr[i][j]+" ");
    }
    System.out.println(" ");
}
sc.close();//closing of scanner
}
}