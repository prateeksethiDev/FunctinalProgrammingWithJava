package functinalInterfaces;

interface I1{
	void m1();
	void m2();
}

abstract class C1 implements I1{
	abstract void m3();
}

abstract class C2 extends C1 {	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
