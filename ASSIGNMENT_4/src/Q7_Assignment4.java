package Assignment_4;
import java.util.*;
import java.util.Map.Entry;
class Adress{
	private String plotNo;
	private String At;
	private String post;
	Adress(String plotNo, String At, String post){
		this.plotNo= plotNo;
		this.At= At;
		this.post= post;
	}
	public String toString() {
		return "Plot No: "+this.plotNo+", At: "+this.At+", Post: "+this.post; 
	}
}
public class Q7_Assignment4 {
	public static void main(String[] args) {
		TreeMap<String ,Adress> addressBook= new TreeMap<>();
		addressBook.put("John", new Adress("123","Main Street","City"));
		addressBook.put("Alice", new Adress("456","Park Avenue","Town"));
		addressBook.put("Emily", new Adress("1011","Emi Street","Country"));
		Iterator<Entry<String, Adress>> iterator= addressBook.entrySet().iterator();
		System.out.println("Address");
		while(iterator.hasNext()) {
			Map.Entry<String, Adress> entry= iterator.next();
			System.out.println("Name: "+entry.getKey()+", address: "+entry.getValue());
		}
	}

}
