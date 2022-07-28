/* multiplication of multidimensional array
by Khushboo Sharma*/
import java.util.Scanner;
class multiplicationOfmultidimensional
{
    public static void main(String args[])
    {
        int i,j,k,rows,columns;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows");
        rows=sc.nextInt();
       System.out.print("Enter number of columns");
        columns=sc.nextInt();

        //declaring an array
        int a[][]= new int[rows][columns];
        int b[][]= new int[rows][columns];
        int c[][]= new int[rows][columns];
        
        //reading values from first array'a'
         System.out.println("Enter values for first array ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                a[i][j]=sc.nextInt();
            }
            }

        //reading values from second array'b'
         System.out.println("Enter values for second array");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                b[i][j]=sc.nextInt();
            }
            }

        //multiplying two arrays 'a' and 'b'
        System.out.println("Multiplication of arrays are:");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                c[i][j]=0;
                for(k=0;k<columns;k++)
            {
                c[i][j]+=a[i][k]*b[k][j];
            }
        }
        }
        
        //resulted values are printing
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                 System.out.println(c[i][j]+" ");   
            }
            System.out.println(" ");
        }
        sc.close();//closing  scanner
    }
}