package defaultMethod;

public interface InterfaceDemo2 {
	
	default void m1() {
		System.out.println("This is m1 from InterfaceDemo2");
	}

}
