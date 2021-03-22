package mentoring;

interface Vehicle {
	void accelPedal();

	void breakPedal();
}

abstract class Car implements Vehicle {
	private String name;
	protected int speed;

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract public void speedUp();

	abstract public void speedDn();

	@Override
	public void accelPedal() {
		speedUp();
		System.out.println(name + "의 속도를 올립니다.");
	}

	@Override
	public void breakPedal() {
		speedDn();
		System.out.println(name + "의 속도를 내립니다.");
	}

	public void showSpeed() {
		System.out.println(name + "의 속도는 " + speed + "입니다.");
	}
}

class Sedan extends Car {
	public Sedan() {
		super();
	}

	public Sedan(String name) {
		super(name);
	}

	@Override
	public void speedUp() {
		speed += 10;
	}

	@Override
	public void speedDn() {
		speed -= 10;
	}
}

class Truck extends Car {
	public Truck() {
		super();
	}

	public Truck(String name) {
		super(name);
	}

	@Override
	public void speedUp() {
		speed += 5;
	}

	@Override
	public void speedDn() {
		speed -= 5;
	}
}

class SUV extends Car {
	public SUV() {
		super();
	}

	public SUV(String name) {
		super(name);
	}

	@Override
	public void speedUp() {
		speed += 7;
	}

	@Override
	public void speedDn() {
		speed -= 7;
	}
}