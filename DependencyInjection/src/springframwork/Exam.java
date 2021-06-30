package springframwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	
	
	public static void main(String[]args) {
		//using setter injection 
		/*Student name= new Student();
		name.setStudentName("John Payne");
		 name.displayStudentInfo*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student abc= context.getBean("student",Student.class);
		abc.displayStudentInfo();
		Student bcd= context.getBean("student2",Student.class);
		bcd.displayStudentInfo();
	}

}
