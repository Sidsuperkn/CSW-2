
public class _2241011191_Ass6_Q3 {
	private String name;

	public _2241011191_Ass6_Q3(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected: " + name);
		super.finalize();
	}

	public static void main(String[] args) {
		_2241011191_Ass6_Q1 obj = new _2241011191_Ass6_Q1("Object");
		obj = null;
		System.gc();
	}

}
