package questionTen;

public class Product {

	public static void main(String[] args) {

		M m = new M();
		M n = new N ();
		
		M o= new O ();
		O oo = new O();
		
		m.product(3);  // { 3, 9}~
		n.product(3);  // [3, 6]~
		oo.product(3); // (3, 5)~

	}

}

class M {
	
	int product (int i) {
		int result =i*i;
		System.out.println("{"+i+", "+ result+"}~");
		return result;
	}
}

class N extends M{
	int product (int i) {
		int result =i+i;
		System.out.println("["+i+", "+ result+"]~");
		return result;
	}
	
}

class O extends M {
	int product (int i) {
		int result =i+2;
		System.out.println("("+i+", "+ result+")~");
		return result;
	}
}
