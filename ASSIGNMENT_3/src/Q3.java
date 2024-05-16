
import java.util.Arrays;

class Car implements Comparable<Car> {
	private String model;
	private String colour;
	private int speed;
	Car(String model, String colour, int speed){
		this.model= model;
		this. colour= colour;
		this.speed= speed;
	}
	public String getModel() {
		return model;
	}
	public String getColour() {
		return colour;
	}
	public int getSpeed() {
		return speed;
	}

	public String toString() {
		return "Model: "+getModel()+" ,Colour"+getColour()+", Speed: "+getSpeed();
	}
	public int compareTo(Car otherCar) {
		return Integer.compare(this.speed, otherCar.speed);
	}
}
public class Q3{

	public static void main(String[] args) {
		Car car[]= {
				new Car("Toyato","RED",180),
				new Car("Honda","Blue",200)
		};
		System.out.println(car[0]);
		System.out.println(car[1]);
		Arrays.sort(car);
		System.out.println("Highest speed Car is: "+car[1]);
	}

}
