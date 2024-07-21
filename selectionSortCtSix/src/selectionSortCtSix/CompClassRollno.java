package selectionSortCtSix;

import java.util.Comparator;

public class CompClassRollno implements Comparator<Student> {
	
	public int compare(Student student1, Student student2) {
		return student1.rollno - student2.rollno;
	}

}
