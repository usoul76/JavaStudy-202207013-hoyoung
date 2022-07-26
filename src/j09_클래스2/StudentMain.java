package j09_클래스2;

public class StudentMain {

	public static void main(String[] args) {
		int studentCount = 2;
		
		Student[] studentsArray = new Student[studentCount];
		
		StudentService service = new StudentService(studentsArray);
		
		while(service.showMainMenu()) {}
		System.out.println("프로그램 종료");
		
	}

}
