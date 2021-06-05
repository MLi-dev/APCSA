package inheritancedemo;

import job.Job;
import job.LaborWork;
import job.OfficeWork;

public class InheritanceJobs {
	public static void main(String[] args) {
		Job[] worker = new Job[3];
		worker[0] = new LaborWork("James", 5);
		worker[1] = new LaborWork("Evelyn", 5);
		worker[2] = new OfficeWork("Yvonne", 4);
		for (Job m : worker) {
			m.calculateSalary();
			m.displayMemInfo();
		}

	}
}
