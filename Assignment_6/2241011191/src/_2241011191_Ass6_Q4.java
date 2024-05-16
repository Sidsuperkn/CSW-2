
public class _2241011191_Ass6_Q4 {
	private String name;

	public _2241019447_Ass6_Q4(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() {
		System.out.println("Garbage collected: " + name);
	}

	public static void main(String[] args) {
		new _2241019447_Ass6_Q4("Anonymous");
		System.gc();
	}

}
