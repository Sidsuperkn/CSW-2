class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: " + college.getCollegeName() + " located at " + college.getCollegeLoc());
        System.out.println();
    }
}

public class Main_2241011191_Ass2_Q5 {

	public static void main(String[] args) {
        College college1 = new College("ITER", "JAGAMARA");
        College college2 = new College("SUM", "KALINGA NAGAR");

        Student student1 = new Student(101, "Aditya", college1);
        Student student2 = new Student(102, "Suvam", college2);

        System.out.println("College Information:");
        System.out.println("1. " + college1.getCollegeName() + " located at " + college1.getCollegeLoc());
        System.out.println("2. " + college2.getCollegeName() + " located at " + college2.getCollegeLoc());
        System.out.println();

        System.out.println("Student Information:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
	}

}
