
public class Student {
	
	private String StudentName;
	private String StudentClass;
	private int StudentAge;
	
	public Student() {
		setStudentName("");
		setStudentAge(0);
		setStudentClass("");
	
				
	}

	public Student(String sn, int sa, String sc){
		 StudentName = sn;
		 StudentAge = sa;
		 StudentClass = sc;
		 
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentClass() {
		return StudentClass;
	}

	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}
		
}
