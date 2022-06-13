package assignment07;
//- shipName:String
//- fuelTank:int
//+Ship()
//+Ship(shipName:String, fuelTank:int)
//+sail(int dist):void // 운항 +refuel(int fuel):void // 주유
//+getXXX
//+setXXX
public abstract class Ship {	
	protected String shipName;
	protected int fuelTank;
	
	public Ship() {
		shipName = "";
		fuelTank = 0;	
	}
	
	public Ship(String shipName, int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	
	public void sail(int dist) {
		fuelTank -= dist;
	}
	
	public void refuel(int fuel) {
		fuelTank += fuel;
	}
	
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	public int getFuelTank() {
		return fuelTank;
	}
	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}
	
	@Override
	public String toString() {
		return getShipName() + "     \t      "  + getFuelTank() ;
}

}
