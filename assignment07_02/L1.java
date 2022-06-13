package assignment07_02;

public class L1 extends Car implements Temp {

	@Override
	public int getTempGage() {
	//엔진 온도를 리턴 한다 
	//10주행 시 엔진 온도 1증가
		return this.getDistance() / 10;
	}

	@Override
	public void go(int distance) {
		//10주행 시 현재 주유량 1 감소
		int temp = this.getOilSize();
		int spendOil = distance / 10;
				
		if (temp >= spendOil) {
			temp = temp - distance/10;
			this.setOilSize(temp);
			
			int dist = this.getDistance();
			this.setDistance(dist + distance);
		}
		else {
			System.out.println("oil이 모자랍니다.");
		}
	}

	@Override
	public void setOil(int oilSize) { //70
// 현재 주유양 증가
		int temp = this.getOilSize(); //40 /100
		int maxOilSize = this.getOilTank(); // 100
		if(temp + oilSize > maxOilSize) {
			this.setOilSize(maxOilSize);
		}
		else{
			
		temp = temp + oilSize;
		this.setOilSize(temp);
		}
	}

	@Override
	public String toString() {
		return  getName() + "     \t   "  + getEngineSize() + "       \t    " + getOilTank()
				+  "       \t    " + getOilSize()  + "   \t     " + getDistance() + " \t";
	}

}
