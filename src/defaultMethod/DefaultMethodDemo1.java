package defaultMethod;

public class DefaultMethodDemo1 implements Drawable {

	public static void main(String[] args) {
		
		DefaultMethodDemo1 d2 = new DefaultMethodDemo1();
		d2.draw();
		
		d2.circle();
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing...");		
	}
	
//	@Override
//	public void circle() {
//		System.out.println("This is new circle not default one..");
//	}
	
}



//using lambda expression

//public class DefaultMethodDemo {
//
//	public static void main(String[] args) {
//		
//		Drawable d1 = ()-> System.out.println("Drawing..");
//		d1.draw();		
//		
//		d1.circle();
//	}	
//}

