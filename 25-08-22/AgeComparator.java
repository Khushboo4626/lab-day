package firstproject.bankapp;
//importing comparators
import java.util.Comparator;

public class AgeComparator implements Comparator<student> {

	@Override
	public int compare(student student1, student student2) {
		
		if(student1.studentAge == student2.studentAge)
		{
			System.out.println("Same age");
			return 0;
		}
		if(student1.studentAge > student2.studentAge)
		
			return 1; 
		else
			
			return -1;
	
}
}
