package Assignment_4;
import java.util.*;
public class Q9_Assignment4 {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,3,6,7,8,1,9,10,7};
		printRepeatingIntegers(array);
	}
	public static void printRepeatingIntegers(int[] array) {
		HashSet<Integer> set= new HashSet<>();
		HashSet<Integer> repeatSet= new HashSet<>();
		for(int nums: array) {
			if(!set.add(nums)) {
				repeatSet.add(nums);
			}
		}
		Iterator<Integer> iterator = repeatSet.iterator();
		System.out.println("Repeating integers: ");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}
