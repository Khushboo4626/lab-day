/*create a movietheatre class and movie class in which we can add movie details like movieName, movieStartTime, movieTicketPrice and print the details of the movie
by  Khushboo Sharma*/
import java.util.Scanner;
class movie{    
    Scanner sc=new Scanner(System.in);                      //declaration
    int movieStartTime;
    int movieTicketPrice;
    String movieName;
   movie(int MovieS, String movieN, int movieT)
{
   movieStartTime=MovieS;
   movieTicketPrice=movieT;
   movieName=movieN;
}
 public void getmovie()
 {
    System.out.println("Hi"+movieN+"is your movieName"+movieS+"is starting time"+movieT+"is ticket price");
 }
}
class movieTheatre                              //main class
{
    public static void main(String args[])
    {
        movie sc=new movie("The dear Comrade",6,300);
        sc.getmovie();//calling 
    }
}

