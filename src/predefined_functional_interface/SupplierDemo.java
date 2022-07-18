//Supplier will just supply/return required object and does not take any input/parameter

package predefined_functional_interface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

//		SupplierDemo supplierDemo = new SupplierDemo();
//		System.out.println(supplierDemo.currentDate());;
		
		Supplier<Date> d = ()-> new Date();
		Date date = d.get();
		
		System.out.println(date);
		
	}

//	private Date currentDate() {
//		return new Date();	
//	}

}


