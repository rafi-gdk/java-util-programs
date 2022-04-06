package java7.oops;

public class OverridingTest {
	public static void main(String[] args) {
		Overriding_Parent parent = new Overriding_Parent();
		Overriding_Child child = new Overriding_Child();
		Overriding_Parent p1 = new Overriding_Child();
		parent.marry();
		child.marry();
		p1.marry();
	}
}
