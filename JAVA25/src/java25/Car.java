package java25;

public class Car {
	String company = "현대자동차";  //필드  초기화 이유 : 다형성과 중복성제거
	String model;
	String color;
	int maxSpeed;
	//생성자 
	Car(){}
	Car(String model){
		this.model=model;}
	Car(String model,String color){
		this.model=model; this.color=color;}
	Car(String model,String color,int maxSpeed){
		this.model=model; this.color=color; this.maxSpeed=maxSpeed;}
	
}
