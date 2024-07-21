package selectionSortCtSix;

import java.util.ArrayList;

public class MainMethod {

	public static void main(String[] args) {
		
		ArrayList<Student> studentInfo = new ArrayList<>();
		
		studentInfo.add(new Student(2, "Madison Ytterock", "123 Ford Way, Denver, Colorado"));
		studentInfo.add(new Student(4, "Baylee Bee", "645 North Drive, Aurora, Colorado"));
		studentInfo.add(new Student(10, "Knight Shining", "833 Horse Lane, Arvada, Colorado"));
		studentInfo.add(new Student(7, "Roman Grey", "347 Flower Grove, Colorado Springs, Colorado"));
		studentInfo.add(new Student(9, "Morgan Voss", "239 Evergreen Road, Timnath, Colorado"));
		studentInfo.add(new Student(6, "Vicki Camp", "789 Bath Street, Evergreen, Colorado"));
		studentInfo.add(new Student(8, "Ash Lynx", "555 Kipper Avenue, Johnstown, Colorado"));
		studentInfo.add(new Student(3, "Sam Smith", "989 Lake View, Golden, Colorado"));
		studentInfo.add(new Student(5, "Jason Greene", "223 West Corn Drive, Canon City, Colorado"));
		studentInfo.add(new Student(1, "Matthew Black", "875 Tropics Way, Dinosaur, Colorado"));
		
		System.out.println("\nSorted by Name: ");
		SelectionSortMethod.sort(studentInfo, new CompClassName());
		System.out.println(studentInfo);
		
		System.out.println("\nSorted by Roll Number: ");
		SelectionSortMethod.sort(studentInfo, new CompClassRollno());
		System.out.println(studentInfo);
	}
}
