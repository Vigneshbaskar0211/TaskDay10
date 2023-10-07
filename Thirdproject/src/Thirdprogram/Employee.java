package Thirdprogram;

public class Employee {
		    private int id;
		    private String name;
		    private double salary;

		    public Employee(int id, String name, double salary) {
		        this.id = id;
		        this.name = name;
		        this.salary = salary;
		    }

		    public int getId() {
		        return id;
		    }

		    public String getName() {
		        return name;
		    }

		    public double getSalary() {
		        return salary;
		    }

		    public void raiseSalary(double percent) {
		        if (percent > 0) {
		            double raiseAmount = salary * (percent / 100);
		            salary += raiseAmount;
		            System.out.println(name + "'s salary has been increased by " + percent + "%.");
		            System.out.println("New salary: $" + salary);
		        } else {
		            System.out.println("Invalid percentage. Salary remains unchanged.");
		        }
		    }
		

	 
		    public static void main(String[] args) {
		        // Create an employee object
		        Employee employee1 = new Employee(101, "John Doe", 50000.0);

		        // Display employee information
		        System.out.println("Employee Information:");
		        System.out.println("ID: " + employee1.getId());
		        System.out.println("Name: " + employee1.getName());
		        System.out.println("Salary: $" + employee1.getSalary());

		        // Raise the employee's salary by 10%
		        employee1.raiseSalary(10);

		        // Raise the employee's salary by -5% (Invalid percentage)
		        employee1.raiseSalary(-5);
  }
}