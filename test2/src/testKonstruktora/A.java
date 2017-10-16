package testKonstruktora;

public class A extends A2{
	public A(){System.out.print("A1");}

	public void test() {
		System.out.print("T1");
		
	}
	{
		System.out.print("T1");
	}
	static{
		System.out.print("IO");
	}
}
