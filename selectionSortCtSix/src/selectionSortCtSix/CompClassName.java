package selectionSortCtSix;

import java.util.Comparator;

public class CompClassName implements Comparator<Student> {
	
	public int compare(Student student1, Student student2) {
		return student1.name.compareTo(student2.name);
	}

}
