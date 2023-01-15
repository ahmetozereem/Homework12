package QuestionZero;

public class PersonelBase {
	
	String adSoyad;
	String iD;
	int calismaSaati; //Aylık çalışma saati: Kısa Süreli ise 18 - 25 saat, uzun süreli ise 32-40 saat.
	int saatlikCalismaUcreti;
	double zamOranı=0.1;
	
	
	public PersonelBase() {
		super();
	}

	public PersonelBase(String adSoyad, String iD, int calismaSaati, int saatlikCalismaUcreti, double zamOranı) {
		
		this.adSoyad = adSoyad;
		this.iD = iD;
		this.calismaSaati = calismaSaati;
		this.saatlikCalismaUcreti = saatlikCalismaUcreti;
		this.zamOranı= zamOranı;
	}
	
	public double maas() {
		//this.calismaSaati=calismaSaati;
		//this.saatlikCalismaUcreti=saatlikCalismaUcreti;
		
		return calismaSaati*saatlikCalismaUcreti;
		
	}
	
	public double Zam () {
		
		
		double zamMiktarı= zamOranı*calismaSaati*saatlikCalismaUcreti;
		
					
		return zamMiktarı;
		
	}

}
