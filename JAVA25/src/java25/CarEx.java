package java25;

public class CarEx {
	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car("�ҳ�Ÿ");
		Car car3=new Car("�ҳ�Ÿ","����");
		Car car4=new Car("�ý�","����",200);
		System.out.println("----------�ʵ�Ȱ�� 1-------------");
		System.out.println("car1.company : " + car1.company +"\n");   

		System.out.println("----------�ʵ�Ȱ�� 2-------------");
		System.out.println("car2.company : " + car2.company);   
		System.out.println("car2.model : " +car2.model+"\n");

		System.out.println("----------�ʵ�Ȱ�� 3-------------");
		System.out.println("car3.company : " + car3.company);   
		System.out.println("car3.model : " +car3.model);
		System.out.println("car3.model.color : " +car3.color+"\n");   

		System.out.println("----------�ʵ�Ȱ�� 4-------------");
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " +car4.model);
		System.out.println("car4.model.color : " +car4.color); 
		System.out.println("car4.model.maxSpeed : "+car4.maxSpeed+"\n");   

	}
}
