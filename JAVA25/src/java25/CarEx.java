package java25;

public class CarEx {
	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car("소나타");
		Car car3=new Car("소나타","빨강");
		Car car4=new Car("택시","검정",200);
		System.out.println("----------필드활용 1-------------");
		System.out.println("car1.company : " + car1.company +"\n");   

		System.out.println("----------필드활용 2-------------");
		System.out.println("car2.company : " + car2.company);   
		System.out.println("car2.model : " +car2.model+"\n");

		System.out.println("----------필드활용 3-------------");
		System.out.println("car3.company : " + car3.company);   
		System.out.println("car3.model : " +car3.model);
		System.out.println("car3.model.color : " +car3.color+"\n");   

		System.out.println("----------필드활용 4-------------");
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " +car4.model);
		System.out.println("car4.model.color : " +car4.color); 
		System.out.println("car4.model.maxSpeed : "+car4.maxSpeed+"\n");   

	}
}
