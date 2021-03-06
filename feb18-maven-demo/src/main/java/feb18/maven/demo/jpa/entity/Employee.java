package feb18.maven.demo.jpa.entity;


	import javax.persistence.Column;

import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "emp_table")
	public class Employee {


		@Id
		@Column(name = "eid")
		private int eid;

		@Column(name = "first_Name")
		private String firstName;

		@Column(name = "salary")
		private double salary;
		
		public Employee() {
			super();
		}

		public Employee(int eid, String firstName, double salary) {
			super();
			this.eid = eid;
			this.firstName = firstName;
			this.salary = salary;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
		}

	}


