
import java.util.*;

class Car implements Comparable<Car>{
	private int modelNo;
	private String name;
	private int stock;
	
	public Car(int modelNo, String name , int stock) {
		this.modelNo= modelNo;
		this.name= name;
		this.stock= stock;
	}
	public int getModel() {
		return modelNo;
	}

	public int getStock() {
		return stock;
	}
	
	public int compareTo(Car car) {
		return Integer.compare(this.stock, car.stock);
	}
	public String toString() {
		return modelNo+" "+name+" "+stock;
	}
}
public class Q3 {
	public static void main(String[] args) {
		ArrayList<Car> cars= new ArrayList<>();
		cars.add(new Car(2017,"Audi",45));
		cars.add(new Car(2020,"MG",15));
		cars.add(new Car(2013,"Creta",10));
		cars.add(new Car(2015,"BMW",55));
		cars.add(new Car(2018,"Kia",20));
		
		Collections.sort(cars);
		
		System.out.println("LIST OF ORDERED CARS: ");
		for(Car car: cars) {
			System.out.println(car);
		}
	}

}
