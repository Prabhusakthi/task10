package task10;


	public class Employee {
	    // Attributes
	    private int id;
	    private String firstName;
	    private String lastName;
	    private double salary;

	    // Constructor
	    public Employee(int id, String firstName, String lastName, double salary) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.salary = salary;
	    }

	    // Getter for id
	    public int getId() {
	        return id;
	    }

	    // Getter for firstName
	    public String getFirstName() {
	        return firstName;
	    }

	    // Getter for lastName
	    public String getLastName() {
	        return lastName;
	    }

	    // Getter for salary
	    public double getSalary() {
	        return salary;
	    }

	    // Method to get full name
	    public String getFullName() {
	        return firstName + " " + lastName;
	    }

	    // Method to calculate annual salary
	    public double getAnnualSalary() {
	        return salary * 12;
	    }

	    // Method to raise salary by a given percentage and return new salary
	    public double raiseSalary(double percent) {
	        if (percent > 0) {
	            salary += salary * percent / 100;
	        }
	        return salary;
	    }

	    // Method to return a string representation of the employee
	    @Override
	    public String toString() {
	        return "Employee[id=" + id + ", name=" + getFullName() + ", salary=" + salary + "]";
	    }

	    public static void main(String[] args) {
	        // Creating an instance of Employee
	        Employee employee = new Employee(1, "John", "Doe", 5000);

	        // Printing full name
	        System.out.println("Full Name: " + employee.getFullName());

	        // Printing annual salary
	        System.out.println("Annual Salary: $" + employee.getAnnualSalary());

	        // Raising the salary by 10% and printing new salary
	        System.out.println("New Salary after 10% raise: $" + employee.raiseSalary(10));

	        // Printing employee details
	        System.out.println(employee.toString());
	    }
	}



