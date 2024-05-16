
public class Q1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("Memory Usage:");
        System.out.println("str1 and str2:");
        printMemoryUsage(str1, str2);
        System.out.println("str3 and str4:");
        printMemoryUsage(str3, str4);

        System.out.println("\nString Comparison:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str3.equals(str4): " + str3.equals(str4));
        System.out.println("str3 == str4: " + (str3 == str4));
    }

    static void printMemoryUsage(String str1, String str2) {
        System.out.println("str1 memory address: " + System.identityHashCode(str1));
        System.out.println("str2 memory address: " + System.identityHashCode(str2));
        System.out.println("Are they pointing to the same memory location? " + (str1 == str2));
    }
}
