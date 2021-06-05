package job;

import java.util.List;

public abstract class Job {
	public String welcome = "Welcome to ";
	protected double yearsServed;
	protected double salary;
	private String name;
	protected List<String> jobList;

	public Job(String pName, double pYearsServed) {
		System.out.println("Parent Constructor with 2 parameters");

		name = pName;
		yearsServed = pYearsServed;

	}

	public Job(List<String> laborList) {
		jobList = laborList;
		// TODO Auto-generated constructor stub
	}

	public void displayMemInfo() {

		System.out.println("Member ID:" + name);
		System.out.println("Years Served" + yearsServed);
		System.out.println("Salary" + salary);
	}

	public void printSalarySlip(List<SalarySlip> salarySlips) {
		for (SalarySlip t : salarySlips) {
			System.out.println("Job Name:" + t.getName());
			System.out.println("Salary:" + t.getSalary());
		}

	}

	abstract public List<SalarySlip> calculateSalary();

}
