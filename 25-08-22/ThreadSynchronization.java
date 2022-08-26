package firstproject.bankapp;
import java.util.Scanner;
/*
 write a program to illustrate Synchronized method in multithreading.
 by Khushboo Sharma
 */

public class ThreadSynchronization {

	//Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//creating object
		count obj =new count();
		int choice = 0;
		while(choice<5) {
			//taking input from user
			System.out.println("Enter choice : \n1 - Synchronized Threads \n2 - Exit");
			choice = sc.nextInt();
			System.out.println("\nEnter number of cycles : ");//taking input to enter number of cycles
			int cycle=sc.nextInt();
			sc.nextInt();			
			switch (choice) {
			//creating cases for thread 
			case 1 : Thread t1 = new Thread() { 
							public void run(){
								obj.count(cycle); 
								 }
						};
						t1.start();
			default : System.exit(0);
			
			}
		}
	sc.close();//closing scanner
	}
}
class count{
	synchronized public void counter(int n) {
			//thread for n times
			for(int i=0;i<=n;i++) {
				int count = 1;
				count += i; // incrementing counter
				System.out.println(Thread.currentThread().getName()+" Count : "+ count);
				
		}
	}
}