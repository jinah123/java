package assignment07;

public class Cruise extends Ship {

	public Cruise() {
		
	}
	public Cruise(String shipName, int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	public void sail(int dist) {
		// 일정 거리 운항, 연료 소모
		// 1운행 시 연료 13감소
		int temp = this.getFuelTank();
		int spendOil = dist * 13;
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
		//일정 연료 주유
		//1 주유 시 밧데리 8증가
		int temp = this.getFuelTank();
		int fuelOil = fuel * 8;
		temp = temp + fuelOil;
		this.setFuelTank(temp);
	}

}
