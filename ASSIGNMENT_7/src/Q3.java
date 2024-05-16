import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("Hello World ");
		Scanner sc = new Scanner(System.in);
		String val;
		int fIndex , lIndex;
		System.out.println("1. Append a string \n" + "2. Insert a given string at a specified index \n"
				+ "3. Delete a portion of text between two specified indices \n" + "4. Reverse the entire text. \n"
				+ "5. Replace a portion of the text between two specified indices with a given string. \n");
		while (true) {
			System.out.println("Enter a option");
			int value = sc.nextInt();
			switch (value) {
			case 1:
				System.out.println("Enter the string : ");
				val = sc.next();
				sBuffer.append(val);
				System.out.println(sBuffer);
				showCapacityAndLength(sBuffer);
				break;
			case 2:
				System.out.println("Enter the string and the index : ");
				val = sc.next();
				int ind = sc.nextInt();
				sBuffer.insert(ind, val);
				System.out.println(sBuffer);
				showCapacityAndLength(sBuffer);
				break;
			case 3:
				System.out.println("Enter two indices : ");
				fIndex = sc.nextInt();
				lIndex = sc.nextInt();
				sBuffer.delete(fIndex, lIndex);
				System.out.println(sBuffer);
				showCapacityAndLength(sBuffer);
				break;
			case 4:
				sBuffer.reverse();
				System.out.println(sBuffer);
				showCapacityAndLength(sBuffer);
				break;
			case 5:
				System.out.println("Enter a string and two indices : ");
				val = sc.next();
				fIndex = sc.nextInt();
				lIndex = sc.nextInt();
				sBuffer.replace(fIndex, lIndex, val);
				System.out.println(sBuffer);
				showCapacityAndLength(sBuffer);
				break;
			default:
				System.exit(0);
				sc.close();
			}
		}

	}
	static void showCapacityAndLength(StringBuffer sBuffer) {
		System.out.println("Capacity : "+sBuffer.capacity());
		System.out.println("Length : "+sBuffer.length());
	}
}
