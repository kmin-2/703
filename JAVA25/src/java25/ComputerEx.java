package java25;

public class ComputerEx {
	public static void main(String[] args) {
		Computer myCom=new Computer();
		System.out.println("---------sum1_����1-----------");
		int[] values1= {1,2,3};
		int result1=myCom.sum1(values1);
		System.out.println("result1 : "+result1);
		
		System.out.println("---------sum1_����2-----------");
		int result2=myCom.sum1(new int[] {1,2,3});
		System.out.println("result2 : "+result2);
		
		
		System.out.println("---------sum2_����1-----------");
		int result3 = myCom.sum2(1,2,3,4,5);  //int ... values�� �־����Ƿ� �� ����� ���� ����~
		System.out.println("result3 : "+result3);
		
		System.out.println("---------sum2_����2-----------");
		int result4 = myCom.sum2(1,2,3,4,5,6,7,8,9,10);  //int ... values�� �־����Ƿ� �� ����� ���� ����~
		System.out.println("result4 : "+result4);
		
	}
}
