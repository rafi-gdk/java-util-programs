package java7.oops;

/*
 #  In Overriding method resolution 'Child' will get high priority when compare with Parent.
 */

public class Overriding {
	public void m1(Object o) {
		System.out.println("Object version");
	}
	public void m1(String s) {
		System.out.println("String version");
	}
	
	public static void main(String[] args) {
		Overriding obj = new Overriding();
		obj.m1(new Object());
		obj.m1("micheal");
		obj.m1(null);
	}
}
