
 class Book{
	 private int bookId;
	 private String bookName;
	 private double price;
	 Book(int bookId, String bookName, double price){
		 this.bookId= bookId;
		 this.bookName= bookName;
		 this.price= price;
	 }
	 public int getId() {
		 return bookId;
	 }
	 public String getBookName() {
		 return bookName;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public String toString() {
		 return "BookId: "+getId()+" ,Book Name: "+getBookName()+" ,price: "+getPrice();
	 }
	 public boolean equals(Object obj) {
		 if(this==obj)
			 return true;
		 if(obj==null || getClass()!=obj.getClass())
			 return false;
		 Book book= (Book)obj;
		 return Double.compare(book.price, price)==0;
	 }
 }
public class Q2 {
	public static void main(String[] args) {
		Book book1= new Book(101,"HarryPotter",5000);
		Book book2= new Book(102,"Marvel",500);
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		if(book1.equals(book2))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
