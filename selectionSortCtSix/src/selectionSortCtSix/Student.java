package selectionSortCtSix;

public class Student {
	int rollno;
	String name;
	String address;
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return "\nStudent Information - Roll Number: " + rollno + ", Name: " + name + ", Address: " + address;
	}

}
