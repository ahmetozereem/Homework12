package QuestionZero;

public class Muhendis extends PersonelBase {
	
	int ekZam;

	public Muhendis() {
		super();
		
	}

	public Muhendis(String adSoyad, String iD, int calismaSaati, int saatlikCalismaUcreti, double zamOranı,int ekZam) {
		super(adSoyad, iD, calismaSaati, saatlikCalismaUcreti, zamOranı);
		this.ekZam=ekZam;
	}

	

}
