package questionThree;



public class Deriverd03 {
	
	public void getDetails () {
		System.out.println("Derived class");
	}

}

class Test03 extends Deriverd03 {
	
	public void getDetails () {
		System.out.println("Test class ");
		super.getDetails();
		
	}

}