package assignment07_02;

public class L4 extends Car implements Temp {

	@Override
	public int getTempGage() {
		// 엔짂 온도를 리턴 한다
		//10주행 시 엔짂 온도 4증가
		return (this.getDistance() / 10) * 4;

	}

	@Override
	public void go(int distance) {
		// 10주행 시 현재 주유량 2.5감소
		double  temp = this.getOilSize();
		double spendOil = (distance / 10) * 2.5;
				
		if (temp >= spendOil) {
			temp = temp - spendOil;
			this.setOilSize((int)temp);
			
			int dist = this.getDistance();
			this.setDistance(dist + distance);
		}
		else {
			System.out.println("oil이 모자랍니다.");
		}
	}
	

	@Override
	public void setOil(int oilSize) {
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
		return  getName() + "      \t   "  + getEngineSize() + "    \t   " + getOilTank()
				+  "        \t    " + getOilSize() + "  \t     " + getDistance()+ " \t";
	}

}

