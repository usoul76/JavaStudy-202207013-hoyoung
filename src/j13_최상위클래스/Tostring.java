package j13_최상위클래스;

public class Tostring {
	
	private int a;
	private int b;
	
	public Tostring(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Tostring [a=" + a + ", b=" + b + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
//	@Override
//	public String toString() {
//		return "a: " + a + ", b: " +b;
//	}
	
}
