package springframwork;

public class Student {
 
	private String studentName;  
	private int id;
	
	//using setter injection
	/*public void setId(int id) {
		this.id = id;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}*/
	
	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}
	
	
	public void displayStudentInfo() {
		
		System.out.println("Student name is :" + studentName);
		System.out.println("Student id is :" + id);
	}

	
	}
	

	
  

 