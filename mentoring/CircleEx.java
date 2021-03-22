package mentoring;

class Circle{
	int radius;

	public void showCirlce() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}

	public Circle(int radius) {
		this.radius=radius;
	}
}

class ColoredCircle extends Circle{
	String color;

	public void showColoredCircle() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color=color;
	}
}

public class CircleEx {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		ColoredCircle cc = new ColoredCircle(10, "빨간색");

		c1.showCirlce();
		c2.showCirlce();
		cc.showColoredCircle();
	}
}
