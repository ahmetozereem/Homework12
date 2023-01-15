package QuestionZero;

public class Isci extends PersonelBase {
	
	
	double zamOranıIsci;// işçisendikası kararına göre işçler he ay 100 euro ek ücret alıyor.

	public Isci() {
		super();
		
	}

	

	
	
	public double Zam() {
		double zamMiktarı=0;
		
		if (super.calismaSaati>=60 && super.calismaSaati<=80 ) {
			
			zamMiktarı= super.calismaSaati*super.saatlikCalismaUcreti*this.zamOranıIsci;
			
		}
		
		else if (super.calismaSaati>=140 && super.calismaSaati<=160) {
			
			zamMiktarı= super.calismaSaati*super.saatlikCalismaUcreti*super.zamOranı;
		}
		else {
			
			zamMiktarı=0;
		}
			
		return zamMiktarı;
		
	}



	public Isci(String adSoyad, String iD, int calismaSaati, int saatlikCalismaUcreti, double zamOranı, double zamOranıIsci ) {
		super(adSoyad, iD, calismaSaati, saatlikCalismaUcreti, zamOranı);
		this.zamOranıIsci=zamOranıIsci;
	}
	

}

