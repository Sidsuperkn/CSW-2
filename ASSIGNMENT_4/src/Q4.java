

import java.util.*;

class Student {
	private String name;
	private int age;
	private double mark;

	public Student(String name, int age, double mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
		return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
	}
}

public class Q4 {

	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		displayList(students);
		Student student1 = new Student("SIDHU", 59, 94);
		Student student2 = new Student("BUJJI",63,95);
		Student student3 = new Student("SUNNY",35,99);
		Student student4 = new Student("MUSKAN",64,98);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		System.out.print("Enter the name of the student to check if it exists:");
        String name = sc.nextLine();
        System.out.print("Enter the age of the student:");
        int age = sc.nextInt();
        System.out.print("Enter the mark of the student:");
        double mark = sc.nextDouble();
        Student inputStudent = new Student(name, age, mark);
		System.out.println("list contains the student(using contains): " + students.contains(inputStudent));
		System.out.println(
				"list contains the student(using reference): " + containsByReference(students, inputStudent));

		
		System.out.println("List before removal:");
		displayList(students);
		removeStudent(students, student4);
		System.out.println("List after removal:");
		displayList(students);

		System.out.println("Number of students in the list: " + students.size());

		System.out.println("Are student1 and student2 equal? " + student1.equals(student2));
		sc.close();	
	}

	public static void displayList(LinkedList<Student> students) {
		if(students.isEmpty()) return;
		for (Student student : students) {
			System.out.println(
					"Name: " + student.getName() + ", Age: " + student.getAge() + ", Mark: " + student.getMark());
		}
	}

	public static boolean containsByReference(LinkedList<Student> students, Student student) {
		for (Student s : students) {
			if (s == student) {
				return true;
			}
		}
		return false;
	}

	public static void removeStudent(LinkedList<Student> students, Student student) {
		students.remove(student);
	}

}