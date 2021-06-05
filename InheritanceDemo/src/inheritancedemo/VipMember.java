package inheritancedemo;

public class VipMember extends Member {
	public VipMember(String pName, int pMemberID, int pMemberSince) {
		super(pName, pMemberID, pMemberSince);
		System.out.println("Child constructor with 3 parameters");
	}
	
	@Override
	public void calculateAnnualFee()
	{
		annualFee = (1-0.01*getDiscount())*1200;
	}

}
