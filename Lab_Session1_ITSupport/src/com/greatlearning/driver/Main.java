package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.*;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("RajitPranay", "Maddileti");

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Enter departmentname from the following\n" + "1. Technical\n" + "2. Admin\n" + "3. Human Resouce\n" + "4. Legal");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			emp.setDepartmentName("tech");
			break;
		case 2:
			emp.setDepartmentName("adm");
			break;
		case 3:
			emp.setDepartmentName("hr");
			break;
		case 4:
			emp.setDepartmentName("lgl");
			break;
		default:
			System.out.println("Invalid Selection");
			break;

		}
		sc.close();

		CredentialService cred = new CredentialService();
		String email = cred.generateEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), emp.getDepartmentName()),
				password = cred.passwordGenrator();

		cred.showCreds(emp, email, password);
	}

}
