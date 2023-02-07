//Supplier will just supply/return required object and does not take any input/parameter

package predefined_functional_interface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		
		Supplier<Date> d = ()-> new Date();
		Date date = d.get();		
		System.out.println(date); //Thu Jan 19 23:17:24 IST 2023
		
		Supplier<Double> r = Math::random; //Supplier<Double> r = ()->Math.random();
		System.out.println(r.get()); //0.27909
		
	}
}


