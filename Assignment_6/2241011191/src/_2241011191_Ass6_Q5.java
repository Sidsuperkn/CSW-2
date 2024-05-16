
public class _2241019447_Ass6_Q5 {
	private int intValue;
	private double doubleValue;

	public _2241011191_Ass6_Q5() {
		this.intValue = 0;
		this.doubleValue = 0.0;
	}

	void setData(int intValue, double doubleValue) {
		this.doubleValue = doubleValue;
		this.intValue = intValue;
	}

	void updateIntValue(int i) {
		this.intValue = i;
	}

	void updateDoubleValue(double d) {
		this.doubleValue = d;
	}

	void printData() {
		System.out.println("Double value : " + doubleValue + " & Integer value : " + intValue);
	}

	public static void main(String[] args) {
		_2241019447_Ass6_Q5 obj1 = new _2241019447_Ass6_Q5();
		obj1.setData(5, 55.6);
		obj1.printData();
		_2241019447_Ass6_Q5 obj2 = new _2241019447_Ass6_Q5();
		obj2.setData(99, 24.36);
		obj2.printData();
		obj1 = null;
		obj2 = null;
		Runtime runTime = Runtime.getRuntime();
		System.out.println("Total memory before garbage collection : " + runTime.totalMemory());
		System.out.println("Free memory before garbage collection : " + runTime.freeMemory());
		System.gc();
		System.out.println("Total Memory : " + runTime.totalMemory());
		System.out.println("Free Memory : " + runTime.freeMemory());
		System.out.println("Used Memory : " + (runTime.totalMemory() - runTime.freeMemory()));
	}

}
