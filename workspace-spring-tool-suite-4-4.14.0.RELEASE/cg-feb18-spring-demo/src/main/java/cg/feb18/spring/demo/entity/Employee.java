package cg.feb18.spring.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

		private int eid;
		private String firstName;
		private double salary;
		
		@Autowired
		public Employee() {
			super();
			this.eid = 102;
			this.firstName = "Monu";
			this.salary = 60000;
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





