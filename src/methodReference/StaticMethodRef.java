package methodReference;

public class StaticMethodRef {

	public static void main(String[] args) {

//		MyInterface f = ()->System.out.println("Greet Implementation"); //using Lambda		
		MyInterface f = MyClass :: hello; // using method reference			
		f.greet(); // calling method of functional interface
		
		Runnable r = MyClass :: task1;		
		Runnable r2 = MyClass :: task2;
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
