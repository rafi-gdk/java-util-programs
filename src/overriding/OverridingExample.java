package overriding;

//In different classes having same method name & return type & same arguments.
//Arguments should be in same order
//Arguments should be in same type
//return type should be same
//access modifiers can be different but can not be reduce the scope of parent
class OverridingParent {

	protected void method_1() {System.out.println(" parent- method 1");}

	public int method_2(int a) {System.out.println(" parent- method 2"); return a;}

	public static int method_3(int a) {System.out.println(" parent- static method 3"); return a;}
}

class OverridingChild extends OverridingParent {
	
	public void method_1() {System.out.println(" child- method 1");}

	public int method_2(int a) {System.out.println(" child- method 2"); return a;}

	public static int method_3(int a) {System.out.println(" child- static method 3"); return a;}
}

public class OverridingExample
{
	public static void main(String[] args) {

		OverridingParent parentObj=new OverridingParent();
		parentObj.method_1();    //Parent
		parentObj.method_2(10);  //Parent
		parentObj.method_3(20);  //Parent
		
		OverridingParent parentRef=new OverridingChild();
		parentRef.method_1();    //Child
		parentRef.method_2(10);  //Child
		parentRef.method_3(20);  //Parent -- //Method hiding because static method will load at class loading time 
		                                   //so it can be possible for overriding.
		
		OverridingChild childObj=new OverridingChild();
		childObj.method_1();     //Child
		childObj.method_2(10);   //Child
		childObj.method_3(20);   //Child
		
		//Not allowed,because we can create the parent instance with child reference.
		//OverridingChild childRef=new OverridingParent();
	}
}
