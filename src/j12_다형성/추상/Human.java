package j12_다형성.추상;

public class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두발로 움직입니다");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다");
	}
	
}
