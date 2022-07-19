package methodReference;

public class InstanceMethodRef {
	public static void main(String[] args) {		
		MyClass c1 = new MyClass(); //creating object
		MyInterface f = c1::hi;  //referring non-static method using the object		
		f.greet(); // calling functional interface method
		
		Runnable r3 = c1::task3;
		Runnable r4 = c1::task4;
		
		Thread t3 = new Thread(r3);
		t3.start();
		
		Thread t4 = new Thread(r4);
		t4.start();
		
	}
}
