package job;

import java.util.LinkedList;
import java.util.List;

public class LaborList {
	public static void main(String[] args) {
		LinkedList<String> jobList = new LinkedList<>();
		jobList.add("Construction");
		jobList.add("Mechanic");
		jobList.add("Dancer");
		jobList.add("Farmer");
		Job l = new LaborWork(jobList);
		List<SalarySlip> x = l.calculateSalary();
		l.printSalarySlip(x);

		jobList = new LinkedList<>();
		jobList.add("Software Engineer");
		jobList.add("Teacher");
		jobList.add("Businessman");
		jobList.add("Scientist");
		Job j = new OfficeWork(jobList);
		List<SalarySlip> y = j.calculateSalary();
		j.printSalarySlip(y);

	}

}
