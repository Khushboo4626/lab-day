package firstproject.bankapp;
/*
write a program to perform sorting operations with comparator interface.
by Khushboo Sharma
*/

//Importing Collections
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class classRoom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int num = sc.nextInt();
		ArrayList <student> studentList = new ArrayList<student>();//creating array list
		for(int i = 1;i<=num;i++) {
			System.out.println("Enter "+i+" student name : ");
			String name = sc.next();
			System.out.println("\nEnter "+i+" student Id : ");
			int id = sc.nextInt();
			System.out.println("\nEnter "+i+" student age :");
			int age = sc.nextInt();
			System.out.println("\nEnter "+i+" student marks : ");
			int marks = sc.nextInt();
			student stud = new student(id,age,marks,name);//creating objects
			studentList.add(stud);
		}
		
		int choice = 0;
		while(choice<5) {
			
			//input from user to sort list
			System.out.println("enter choice\n1 - sort by Id \n2 - sort by age \n3 - sort by marks \n4 - exit ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("student list according to Id");
					Collections.sort(studentList, new IdComparator());// Sorting by Id comparison
					for(student s : studentList)
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +" Marks : " +s.studentMarks);
					break;
			
			case 2 : System.out.println("\nstudent list according to Id");	
					Collections.sort(studentList, new AgeComparator());// Sorting by age comparison
					for(student s : studentList)
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +"  Marks : " +s.studentMarks);
					break;
					
			case 3 :System.out.println("\nstudent list according to marks");
					Collections.sort(studentList, new MarksComparator());// Sorting by marks comparison
					for(student s : studentList)
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +"  Marks : " +s.studentMarks);
					break;
					
			default : System.exit(0);
			
			}
		}
	sc.close();//closing scanner
	}

}


