public class _2241011191_Ass6_Q1 {
    private String name;

    public _2241011191_Ass6_Q1(String name) {
        this.name = name;
    }

    public void show() {
        _2241011191_Ass6_Q1 b = new _2241011191_Ass6_Q1("Inner Object");
        b.display();
    }

    public void display() {
        _2241011191_Ass6_Q1 a = new _2241011191_Ass6_Q1("Inner display object");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        _2241011191_Ass6_Q1 obj = new _2241011191_Ass6_Q1("Main object");
        obj.show();
        System.gc();
    }
}
