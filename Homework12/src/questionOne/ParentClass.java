package questionOne;

public class ParentClass {
	
	public void getDetails (String temp) {
		System.out.println("Derived class "+temp);
	}

}

class Test01 extends ParentClass {
	
	public void getDetails (String temp) {
		System.out.println("Test class "+temp);
		
		
	}
	
	
}
