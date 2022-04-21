package lambda;

@FunctionalInterface
public interface Drawable {
	
	public void draw();  
	
	default void printName() {
		System.out.println("Any number of default methods or static method is possible");
	}

}
