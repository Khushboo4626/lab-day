/*aggregation in java
by Khushboo Sharma*/
class book{                          //declaration
    int bookId;
    String bookTitle;
   book(int bId,String bTitle)
{
    bookId = bId;
    bookTitle = bTitle;
}

}


class author{                            //declaration
    int authAge;
    String authName;
    String authCity;
 author(String athrName, int athrAge, String athrCity)
 {
    authName = athrName;
    authAge = athrAge;
    authCity = athrCity;
 }
 public void getAuthor()
 {
    System.out.println("Hi"+authName+"is of"+authAge+"and lived in"+authCity+);
 }
}

class library                               //main class
{
    public static void main(String args[])
    {
        book b1=new book(401,"Walking with the Comrades");
        author a1=new author("Arundhati Roy",62,"Delhi"); 
        a1.getAuthor();//calling of object
    }
}