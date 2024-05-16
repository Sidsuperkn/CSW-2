
class Student<T>{
	private String name;
	private T rollno;
	private int age;
	
	Student(String name, int age, T rollno){
		this.name= name;
		this.age= age;
		this.rollno= rollno;
	}
	public String getName() {
		return name;
	}
	public int getage() {
		return age;
	}
	public T getrollno() {
		return rollno;
	}
	public String toString() {
		return "Name: "+getName()+" ,Age: "+getage()+" ,RollNumber: "+getrollno();
	}
}
public class Q1 {

	public static void main(String[] args) {
		Student <Integer> student1= new Student<>("Alice",20,200);
		Student <Integer> student2= new Student<>("Manas",19,102);
		Student <String> student3= new Student<>("Ben",20,"232");
		Student <String> student4= new Student<>("Reshav",19,"105");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());

	}

}
