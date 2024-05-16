public class _2241011191_Ass6_Q2 {
	private String name;

	public _2241011191_Ass6_Q2(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() {
		System.out.println("Garbage collected: " + name);
	}

	public static void main(String[] args) {
		_2241011191_Ass6_Q2 obj1 = new _2241011191_Ass6_Q2("Object 1");
		_2241011191_Ass6_Q2 obj2 = new _2241011191_Ass6_Q2("Object 2");
		obj1 = obj2;
		obj2 = null;
		System.gc();
	}

}
