package methodReference;

import java.time.LocalDate;

public class MyClass {
	
	public static void hello() {		
		System.out.println("Hello ! Welcome to NIELIT");
		LocalDate date = LocalDate.now();
		System.out.println("Date: "+date.toString());
	}	
	
	public static void task1() {
		for(int i=1; i<=10; i++) {
			System.out.println(i*2);
		}
	}
	
	public static void task2() {
		for(int i=100; i<=110; i++) {
			System.out.println(i);
		}
	}
	
	public void task3() {
		for(int i=50; i<=60; i++) {
			System.out.println(i);
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
	
	public void task4() {
		for(int i=100; i<=110; i++) {
			System.out.println(i);
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
	
	public void hi() {		
		System.out.println("This is inside hi() method");
	}
	
}
