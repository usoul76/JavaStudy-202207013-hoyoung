package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "현대자동차";
		car1.model = "쏘나타";
		car1.color = "화이트";
		
		car2.company = "기아";
		car2.model = "k5";
		car2.color = "블랙";
		
		car3.company = "현대자동차";
		car3.model = "아반떼";
		car3.color = "그레이";
		
		car1.showCarInfo();
		car2.showCarInfo();
		car3.showCarInfo();

	}

}
