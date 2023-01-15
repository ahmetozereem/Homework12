package QuestionZero;

public class Main {
	
	public static void main(String[] args) {
		
		PersonelBase personel1 =new PersonelBase ();
		
		
		Isci isci1 = new Isci ("Ahmet Oz", "12345", 150, 20, personel1.zamOranı, 0.05);
		
		System.out.println("Isci "+isci1.adSoyad+"'in Maasi: "+isci1.maas()+ " Euro");
		System.out.println("Isci "+isci1.adSoyad+"'e yapılan Zam: "+isci1.Zam()+ " Euro");
		System.out.println("Isci "+isci1.adSoyad+"'in toplam Maası: "+(isci1.maas()+isci1.Zam())+ " Euro");
		System.out.println("");
		
		
		UstaBasi ustabasi1 = new UstaBasi ("Mehmet Kara", "25478", 150, 25, personel1.zamOranı, 0.7);
		
		System.out.println("Ustabası "+ustabasi1.adSoyad+"'nın Maasi: "+ustabasi1.maas()+ " Euro");
		System.out.println("Isci "+ustabasi1.adSoyad+"'ya yapılan Zam: "+ustabasi1.Zam()+ " Euro");
		System.out.println("Isci "+ustabasi1.adSoyad+"'nın toplam Maası: "+(ustabasi1.maas()+ustabasi1.Zam())+ " Euro");
		System.out.println("");
		
		Muhendis muhendis1 = new Muhendis ("Mustafa Deniz", "25478", 150, 35, personel1.zamOranı, 200);
		
		System.out.println("Mühendis "+muhendis1.adSoyad+"'in Maasi: "+muhendis1.maas()+ " Euro");
		System.out.println("Mühendis "+muhendis1.adSoyad+"'e yapılan Zam: "+muhendis1.Zam()+ " Euro");
		System.out.println("Mühendis "+muhendis1.adSoyad+"'in toplam Maası: "+(muhendis1.maas()+muhendis1.Zam()+muhendis1.ekZam)+ " Euro");
		
		
		
		
	}
	
	
	
	
	

}
