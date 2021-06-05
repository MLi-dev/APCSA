package job;
import java.util.LinkedList;
import java.util.List;
public class OfficeList {
	public static void main(String[] args) {
		LinkedList<String> jobList = new LinkedList<>();
		jobList.add("Software Engineer");
		jobList.add("Teacher");
		jobList.add("Businessman");
		jobList.add("Scientist");
	Job j = new OfficeWork(jobList);
	List<SalarySlip> y=j.calculateSalary();
	j.printSalarySlip(y);


	}


}
