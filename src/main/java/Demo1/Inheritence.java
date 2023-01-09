package Demo1;

class Car {

	public void show(int a) {
		System.out.println(a + " hujjg");
	}

	public void show(float b) {

		System.out.println(b);

	}
	public void show() {
		System.out.println(" aba");
	}

}

public class Inheritence {

	public static void main(String[] args) {
		Car c = new Car();
		c.show(12.3f);

	}

}
