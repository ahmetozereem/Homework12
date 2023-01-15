package questionFour;


public class Derived04 {
	
	protected final void getDetails () {
		System.out.println("Derived class");
	}

}

class Test04 extends Derived04 {
	
	// Cannot override the final method from
	/*
	 * protected final void getDetails () { 
	 * Derived04 System.out.println("Test class ");
	 * 
	 * 
	 * }
	 */

}
