package job;

import java.util.ArrayList;
import java.util.List;

public class LaborWork extends Job {
	public LaborWork(String pName, double pYearsServed) {
		super(pName, pYearsServed);
		System.out.println("Child constructor with 2 parameters");
	}
	
	public LaborWork(List<String> laborList) {
		super(laborList);
		jobList = laborList;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SalarySlip> calculateSalary() {
		List<SalarySlip> salarySlips = new ArrayList<>();
		for(String s:jobList) {
			SalarySlip n = new SalarySlip();
			n.setName(s);
			if (s.equals("Construction")) {
				n.setSalary(15.0);
			} else if(s.equals("Mechanic")) {
				n.setSalary(5.0);
			} else if(s.equals("Dancer")) {
				n.setSalary(3.0);
			} else if(s.equals("Farmer")) {
				n.setSalary(10.0);
			}
			salarySlips.add(n);	
		}
		return salarySlips;
				
	}
}
