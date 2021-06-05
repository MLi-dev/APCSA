package inheritancedemo;

public class InheritanceDemo {
	public static void main(String[] args) {
		Member[] members = new Member[3];
		members[0] = new NormalMember("James", 1, 2010);
		members[1] = new VipMember("Evelyn", 5, 2012);
		members[2] = new VipMember("Yvonne", 4, 2013);
	for (Member m: members) {
		m.calculateAnnualFee();
		m.displayMemInfo();
	}
		
	}

}
