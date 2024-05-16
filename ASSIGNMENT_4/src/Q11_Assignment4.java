package Assignment_4;
import java.util.*;
public class Q11_Assignment4 {

	public static void main(String[] args) {
		int[] array= {4,6,3,10,8,7,5};
		int smallest= findSmallest(array);
		System.out.println("The smallest positive missing number is: "+findSmallest(array));
	}
	public static int findSmallest(int[] array) {
		HashMap<Integer, Integer>hashMap= new HashMap<>();
		for(int num:array) {
			hashMap.put(num,1);
		}
		for(int i=1;i<=10;i++) {
			if(!hashMap.containsKey(i)) {
				return i;
			}
		}
		return 11;
		
	}

}
