package questionTwo;



public class Derived {
	
	public void getDetails () {
		System.out.println("Derived class");
	}

}

class Test02 extends Derived {
	
	public void getDetails () {    // sorudaki protected, public yapılmalı ve ekranda "Test class" yazar.
		System.out.println("Test class ");
		
		
	}

}