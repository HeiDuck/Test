package test;

public class Test2 extends Test1{
	private int k;
	public static Test3 test = new Test3();
	static{
		System.out.println("test2 static");
	}
	Test2(){
		System.out.println("test2");
	}
}
