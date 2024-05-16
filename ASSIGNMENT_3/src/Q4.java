
class Students implements Comparable<Students>{

    private int rn;
    private String name;
    private double totalMark;
    
    Students(int rn , String name , double totalMark){
    	this.rn = rn;
    	this.name = name;
    	this.totalMark = totalMark;
    }
    
    public int getRn() {
    	return rn;
    }
    
    public String getName() {
    	return name;
    }
    
    public double getTotalMark() {
    	return totalMark;
    }
    
    @Override
    public int compareTo(Students s) {
    	return Integer.compare(this.getRn(),s.getRn());
    }
    
    @Override
    public String toString() {
    	return "Student details : name "+name+", roll number : "+rn+", total mark : "+totalMark;
    }  
}
    
public class Q4
{
    public static void main(String[] args) {
    	Students students[] ={ new Students(101,"adi",85),new Students(102,"suvam",90)};
    	int studentRollNumber = 102;
    	Students targetedStudent = new Students(studentRollNumber, "", 0);
    	int linearSearchDetails = LinearSearch(students,targetedStudent);
    	if(linearSearchDetails != -1) {
    			System.out.println("Student found ar index : "+linearSearchDetails+"\n"+students[linearSearchDetails]);
    	}
    }
    public static int LinearSearch(Students std[],Students target) {
    	for(int i = 0 ; i < std.length ;i++) {
    			if(std[i].compareTo(target) == 0) return i;
    	}
    	return 0;
    }
}