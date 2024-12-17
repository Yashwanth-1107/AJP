package _AJP_;

public class StaticExamples {
	int num;
	static int value;
	
	static { 
		System.out.println("static Blook");
	}
	public static void message() {
		System.out.println("static method");
	}
	public static void access() {
		System.out.println("value="+value);
	}



public static void main(String args[]) {
	StaticExamples.message();
	StaticExamples obj = new StaticExamples();
	//StaticExamples.message();
	obj.value=50;
	obj.access();
	obj.num=30;
	
}
}
 