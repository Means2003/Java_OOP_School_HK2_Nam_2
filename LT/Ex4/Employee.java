package Ex4;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int monthlySalary;

	public Employee(int idd, String fname, String lname, int msalary) {
		id = idd;
		firstName = fname;
		lastName = lname;
		monthlySalary = msalary;
		if (msalary < 0)
			monthlySalary = 0;
	}

	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + lastName;
	}

	public void setMonthlySalary(int msalary) {
		monthlySalary = msalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public int getAnnualSalary() {
		int annualSalary = monthlySalary * 12;
		return annualSalary;
	}

	public int raiseSalary() {
		int raise = monthlySalary;
		int raiseSalary = (monthlySalary + raise) * 12;
		return raiseSalary;
	}

	@Override
	public String toString() {
		return "Employee[id = " + this.id + ", name = " + firstName + lastName + ",monthlySalary =" + this.monthlySalary
				+ "]";
	}
}
