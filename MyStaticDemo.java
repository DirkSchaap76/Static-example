package myStaticPackage;

public class MyStaticDemo {

	public static void main(String[] args) {

		MyStaticClass a = new MyStaticClass();
		MyStaticClass b = new MyStaticClass();
		MyStaticClass c = new MyStaticClass();

		a.i = 6;
		a.s = "I have been changed!";

		System.out.println("a's static fields are: " + a.i + " " + a.s);
		System.out.println("b's static fields are: " + b.i + " " + b.s);
		System.out.println("c's static fields are: " + c.i + " " + c.s);

		MyStaticClass.myStaticMethod();

	}

}

class MyStaticClass {
	static int i = 4;
	static String s = "I am static.";

	static void myStaticMethod() {
		System.out.println("I am a static method, I can be called by classname.methodname");
	}

}
