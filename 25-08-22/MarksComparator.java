package firstproject.bankapp;

import java.util.Comparator;

public class MarksComparator implements Comparator<student>{

	@Override
	public int compare(student student1, student student2) {
		if(student1.studentMarks == student2.studentMarks)
			return 0;
		if(student1.studentMarks > student2.studentMarks)
			return 1;
		else
			return -1;	
	}
	}