class conditionalOperator{
            
           public static void main(String args[])
{
         int a=5, b=14, c=26, d=47, largest, number;
         largest = (a>b && a>c && a>d)?a : (b>c && b>d?b:(c>d?c:d));
         System.out.println("lagest number in four variables "+a+", "+b+", "+c+", "+d+" is" +largest);
}
}
       

         