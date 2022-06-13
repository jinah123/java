package assignment07;

import java.util.HashMap;

public class ShipTest {

	public static void main(String[] args) {
		// 각각의 Ship 객체 생성
		HashMap<String,Object>map = new HashMap<String,Object>();
			Boat ship1 = new Boat();
			ship1.setShipName("Boat01");
			ship1.setFuelTank(500);
		
			Cruise ship2 = new Cruise();
			ship2.setShipName("Cruise01");
			ship2.setFuelTank(1000);
		
			map.put("1", ship1);
			map.put("2", ship2);
		
			
			
					
		System.out.println("  shipName\t    fuelTank");
		System.out.println("---------------------------------------");
		for(int i=1; i<3; i++) {
			System.out.println(map.get(i+""));
		}
		
		// 10운항 후 객체 정보 출력
		System.out.println("\n\n10 운항");//10
		
		
		// 생성된 객체의 정보 출력
		System.out.println("  shipName\t    fuelTank");
		System.out.println("---------------------------------------");
		for(int i=1; i<3; i++) {
			((Ship)map.get(i + "")).sail(10);
			System.out.println(map.get(i+""));
		
		}
	
		
		// 각각의 Ship 객체에 50 주유 
		System.out.println("\n\n5 주유");//20
		
		// 50 주유 후 객체 정보 출력
		System.out.println("  shipName\t    fuelTank");
		System.out.println("---------------------------------------");
		for(int i=1; i<3; i++) {
			((Ship)map.get(i + "")).refuel(5);
			System.out.println(map.get(i+""));
		
		}
	}

}
