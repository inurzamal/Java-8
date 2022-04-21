package defaultMethod;

public class DiamondProblem implements InterfaceDemo1, InterfaceDemo2 {

	public static void main(String[] args) {
		
		DiamondProblem obj = new DiamondProblem();
		obj.m1();
	}

	@Override
	public void m1() {
		InterfaceDemo1.super.m1();
	}

}
