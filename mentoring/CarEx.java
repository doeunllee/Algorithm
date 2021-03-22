package mentoring;

public class CarEx {
	public static void main(String[] args) {
		Car c[] = new Car[3];
		c[0] = new Sedan("람보르기니");
		c[1] = new Truck("볼보");
		c[2] = new SUV("성공회자동차");

		for(int i=0; i<c.length; i++) {
			c[i].accelPedal();
			c[i].accelPedal();
			c[i].accelPedal();
		}

		for(int i=0; i<c.length; i++) {
			c[i].showSpeed();
		}

		System.out.println();

		for(int i=0; i<c.length; i++) {
			c[i].breakPedal();
			c[i].breakPedal();
		}

		for(int i=0; i<c.length; i++) {
			c[i].showSpeed();
		}
	}
}