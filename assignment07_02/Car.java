package assignment07_02;

//- name:String
//- engineSize:String
//- oilTank:int // Oil Tank 사이즈
//- oilSize: int // 현재 주유된 Oil 양
//- distance:int // 주행 거리

//+go(distance:int):void // 주행 
//+setOil(oilSize:int):void // 주유 
//+getXXX
//+setXXX

public abstract class Car {
	private String name;
	private String engineSize;
	private int oilTank;
	private int oilSize;
	private int distance;
	
	public abstract void go(int distance);
	public abstract void setOil(int oilSize);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
	public int getOilTank() {
		return oilTank;
	}
	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}
	public int getOilSize() {
		return oilSize;
	}
	public void setOilSize(int temp) {
		this.oilSize = temp;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
	
}
