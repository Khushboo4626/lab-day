package firstproject.bankapp;
import java.lang.System;
import java.util.stream.Stream;//importing stream
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("20 divisible of five are:");
//using stream 
Stream.iterate(1,i->i+ 1)
.filter(i->i%5==0)
.limit(20)
.forEach(System.out::println);
	}
}
