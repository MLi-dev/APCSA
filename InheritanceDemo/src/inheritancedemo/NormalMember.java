package inheritancedemo;

public class NormalMember extends Member{
	public NormalMember() {
		System.out.println("Child constructor with no parameter");
	}
	public NormalMember (String pName, int pMemberID, int pMemberSince) {
		super (pName, pMemberID, pMemberSince);
		System.out.println("Child constructor with three parameters");
	}
	@Override
	public void calculateAnnualFee() {
		annualFee = (1-0.1*getDiscount())*(100+12*30);
	}
	
public static void main(String[] args) {
	NormalMember normalMember = new NormalMember("Matthew", 35, 15);
}


}
