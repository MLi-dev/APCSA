package job;

import java.util.ArrayList;
import java.util.List;

public class OfficeWork extends Job {
	public OfficeWork(String pName, double pYearsServed) {
		super(pName, pYearsServed );
		System.out.println("Child constructor with 2 parameters");
	}
	public OfficeWork(List<String> officeList) {
		super(officeList);
		jobList = officeList;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SalarySlip> calculateSalary() {
		List<SalarySlip> salarySlips = new ArrayList<>();
		for(String s:jobList) {
			SalarySlip n = new SalarySlip();
			n.setName(s);
			if (s.equals("Software Engineer")) {
				n.setSalary(100.0);
			} else if(s.equals("Teacher")) {
				n.setSalary(5.0);
			} else if(s.equals("Businessman")) {
				n.setSalary(50.0);
			} else if(s.equals("Scientist")) {
				n.setSalary(30.0);
			}
			salarySlips.add(n);	
		}
		return salarySlips;
				
	}

}
