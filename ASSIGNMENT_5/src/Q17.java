import java.util.*;

public class Q17<T> {
	public void add(T element, LinkedList<T> list) {
		list.add(element);
	}

	public T get(int index, LinkedList<T> list) {
		if (index < 0 || index >= list.size()) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + " Size: " + list.size());
		}
		return list.get(index);
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < 20; i++) {
			new Q17<Integer>().add(i, list);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(new Q17<Integer>().get(i, list) + " ");
		}
		System.out.println();
		try {
			System.out.print(new Q17<Integer>().get(22, list));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught Exception : " + e.getMessage());
		}
	}

}
