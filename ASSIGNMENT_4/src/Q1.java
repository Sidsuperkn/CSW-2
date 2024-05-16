
import java.util.*;
class Pair<K,V>{
	private K key;
	private V value;
	Pair(K key, V value){
		this.key=key;
		this.value= value;
	}
	public void SetKey(K key) {
		this.key= key;
	}
	public void SetValue(V value) {
		this.value= value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
public class Q1 {

	public static void main(String[] args) {
		 Pair <String,Integer> p1= new Pair<>("5", 10);
		 Pair <Integer,Double> p2= new Pair<>(7, 1.2);
		 System.out.println("KEY: "+p1.getKey()+" VALUE: "+p1.getValue());
		 System.out.println("KEY: "+p2.getKey()+" VALUE: "+p2.getValue());

	}

}
