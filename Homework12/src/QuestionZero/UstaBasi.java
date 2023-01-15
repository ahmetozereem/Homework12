package QuestionZero;

public class UstaBasi extends PersonelBase {
	
	double zamOranıUstaBasi;

	public UstaBasi() {
		super();
		
	}

	

	public double Zam() {
		double zamMiktarı=0;
		
		if (super.calismaSaati>=60 && super.calismaSaati<=80 ) {
			
			zamMiktarı= calismaSaati*saatlikCalismaUcreti*zamOranıUstaBasi;
			
		}
		
		else if (super.calismaSaati>=140 && super.calismaSaati<=160) {
			
			zamMiktarı= calismaSaati*saatlikCalismaUcreti*super.zamOranı;
		}
		else {
			
			zamMiktarı=0;
		}
			
		return zamMiktarı;
	}



	public UstaBasi(String adSoyad, String iD, int calismaSaati, int saatlikCalismaUcreti, double zamOranı,double zamOranıUstaBasi) {
		super(adSoyad, iD, calismaSaati, saatlikCalismaUcreti, zamOranı);
		this.zamOranıUstaBasi=zamOranıUstaBasi;
	}

}
