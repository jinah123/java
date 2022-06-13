package assignment07_02;

import java.util.HashMap;

public class CarTest {

	public static void main(String[] args) {
		 // 1번의 데이터를 기반으로 4개의 Car 객체를 생성 하여 HashMap에 넣는다
			HashMap<String, Object> map = new HashMap<String, Object>();
		L1 car1 = new L1();
		car1.setName("Shovy");
		car1.setEngineSize("1500");
		car1.setOilTank(50);
		car1.setOilSize(20);
		car1.setDistance(0);
		
		L2 car2 = new L2();
	 	car2.setName("Cruse");
		car2.setEngineSize("2000");
		car2.setOilTank(70);
		car2.setOilSize(35);	
		car2.setDistance(0);
		
		L3 car3 = new L3();
		car3.setName("Oska");
		car3.setEngineSize("3000");
		car3.setOilTank(80);
		car3.setOilSize(40);
		car3.setDistance(0);
		
		L4 car4 = new L4();
		car4.setName("Phantom");
		car4.setEngineSize("5000");
		car4.setOilTank(100);
		car4.setOilSize(50);
		car4.setDistance(0);
		
		// HashMap에 넣을 때 키 값은 1,2,3,4형태로 각 Car 이름의 뒷부분을 기준으로 한다 // 모든 Car객체의 기본 정보를 출력 한다(for문을 이용하여 출력 한다)
		map.put("1", car1);
		map.put("2", car2);
		map.put("3", car3);
		map.put("4", car4);
		
	
			System.out.println("vehicleName\tengineSize\t  oilTank\t  oilSize\t  distance");
			System.out.println("----------------------------------------------------------------------------------------------");
			for(int i = 1; i <5; i ++) {
				System.out.println(map.get(i + "")); // 1 + " => "1"
			}
//			System.out.println(car1);
//			System.out.println(car2);
			
		 // 모든 Car 객체에 30씩 주유를 하고 다시 HashMap에 넣는다
		System.out.println("\n\n30 주유");//30
		for(int i = 1; i <5; i ++) {
			((Car)map.get(i + "")).setOil(30);	
		}
//		car1.setOil(30);
		// 모든 객체의 정보를 출력 한다(for문을 이용하여 출력 한다)
		System.out.println("vehicleName\tengineSize\t  oilTank\t  oilSize\t  distance");
		System.out.println("----------------------------------------------------------------------------------------------");
		for(int i=1; i<5; i++) {
			System.out.println(map.get(i+""));
		}
//		System.out.println(car1);
//		System.out.println(car2);
		// 모든 Car 객체가 20씩 주행 하고 다시 HashMap에 넣는다
		System.out.println("\n\n20 주행");//20
		for (int i = 1; i <5; i ++) {
			((Car)map.get(i+"")).go(20);
		}
//		car1.go(20);
		
		// 모든 객체의 정보를 출력 한다(for문을 이용하여 출력 한다)
		System.out.println("vehicleName\tengineSize\t  oilTank\t oilSize\t  distance\t  temperature");
		System.out.println("----------------------------------------------------------------------------------------------");
		for(int i = 1; i < 5; i++) {
			String key = i + "";
			System.out.print(map.get(key));// 1+ "" -> "1"
			
			switch(key) {
				case"1":
				System.out.println("\t"+ ((L1)map.get(key)).getTempGage());
				break;
				case"2":
				System.out.println("\t" + ((L2)map.get(key)).getTempGage());
				break;
				case"3":
				System.out.println("\t"+ ((L3)map.get(key)).getTempGage());
				break;
				case"4": 
				System.out.println("\t"+ ((L4)map.get(key)).getTempGage());
				break;
			}
			
		}
//

	}

}
