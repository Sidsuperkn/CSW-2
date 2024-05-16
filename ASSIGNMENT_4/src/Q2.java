import java.util.*;
class User{
	private String name;
	private int age;
	User(String name, int age){
		this.name= name;
		this.age= age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
class AgeComparator implements Comparator<User>{
	public int compare(User user1, User user2) {
		return Integer.compare(user1.getAge(), user2.getAge());
	}
}

public class Q2{
	private ArrayList<User> userList;
	public Q2() {
		userList= new ArrayList<>();
	}
	public void addUser(User user) {
		userList.add(user);
	}
	public void printUser() {
		System.out.println("List of User");
		for(User user: userList) {
			System.out.println("Name: "+user.getName()+" age: "+user.getAge());
		}
	}
	public void sortUserByAge() {
		Collections.sort(userList,new AgeComparator());
	}
	public static void main(String[] args) {
		
		Q2 ArrayList = new Q2();
		ArrayList.addUser(new User("Alice",30));
		ArrayList.addUser(new User("Bob",50));
		ArrayList.addUser(new User("Chaplin",35));
		ArrayList.printUser();
		System.out.println("\nAfter sorting ");
		ArrayList.sortUserByAge();
		ArrayList.printUser();
	}
}
