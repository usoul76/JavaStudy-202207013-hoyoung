package j02_변수와상수;
//자료형(일반자료형 -int,double,char,boolean 참조자료형 -Class
//변수:메모리 공간의 값을 바꿀 수 있는 것
//상수:메모리 공간의 값을 바꿀 수 없는 것
public class Cast {

	public static void main(String[] args) {
		char a = '가';
		int b = a;
		double c = b;
		
		System.out.println(b);
		System.out.println(c);
		
		int d = (int)c;
		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);

	}

}
