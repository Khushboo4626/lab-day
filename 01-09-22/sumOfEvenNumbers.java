package firstproject.bankapp;
import java.lang.System;
import java.util.Arrays;//importing arrays
import java.util.List;//importing stream

public class sumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>numbers=Arrays.asList(65,6,13,25,24,62,36,25,46,56);//list of numbers
//using lamda expression and stream 
System.out.println("sum even numbers are:");
System.out.println(numbers.stream()
		.filter(i->i%2==0)
		.reduce(0, Integer::sum));
	}

}
