package questionSix;

public class Test06 {

	public static void main(String[] args) {
		
		new C().create(); // c
		new D().update(); //U
		new R().read();   // R
		new D().delete(); // D
		

	}

}

class C {
	public void create () {
		System.out.println("c");
	}
}

class U {
	private void update () {
		System.out.println("u");
	}
}

class R extends C {
	public void create () {
		System.out.println("C");
	}
	protected void read () {
		System.out.println("R");
	}
}

class D extends U {
	
	void update () {
		System.out.println("U");
	}
	void delete () {
		System.out.println("D");
	}
}