package assignment07;
//+Boat()
//+Boat(shipName:String,
//fuelTank:int)
//+sail(int dist):void // 운항
//+refuel(int fuel):void // 주유
//+getXXX
//+setXXX
public class Boat extends Ship {

	public Boat() {
	}
	public Boat(String shipName, int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	
	public void sail(int dist) { //운항
//		일정 거리 운항, 연료 소모
//		1운행 시 연료 10감소

		int temp = this.getFuelTank();
		int spendOil = dist * 10;
		if (temp >= spendOil) {
			temp = temp - spendOil;
			this.setFuelTank(temp);
		}
		else {
			System.out.println("Not enough oil");
		}
		
	}

	@Override
	public void refuel(int fuel) {
//		일정 연료 주유
//		1 주유 시 밧데리 10증가	
		int temp = this.getFuelTank();
		int fuelOil = fuel * 10;
		temp = temp + fuelOil;
		this.setFuelTank(temp);
	}
}
