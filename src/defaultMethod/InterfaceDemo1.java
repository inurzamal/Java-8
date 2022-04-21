package defaultMethod;

public interface InterfaceDemo1 {
	
	default void m1() {
		System.out.println("This is m1 from InterfaceDemo1");
	}

}
