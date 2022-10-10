package Oct6;

public class Child extends Parent {

	public int c1() {
		System.out.println("c1 method");
		return 10;
	}

	public void c2() {
		System.out.println("c2 method");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.p1();
		obj.p2();
		int a = obj.c1();
		System.out.println(a);

	}

}
