package j09_클래스3;

public class Student extends Person{
	private String schoolName;
	private int studentCode;
	private int  studnetYear;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, String schoolName, int studentCode, int studnetYear) {
		super(name, age);
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.studnetYear = studnetYear;
	}


	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public int getStudnetYear() {
		return studnetYear;
	}

	public void setStudnetYear(int studnetYear) {
		this.studnetYear = studnetYear;
	}

	@Override
	public String toString() {
		return super.toString() + ", Student [schoolName=" + schoolName + ", studentCode=" + studentCode + ", studnetYear=" + studnetYear
				+ "]";
	}

	@Override
	public String mealTime() {
		return "점심시간s";
	}
	
}
