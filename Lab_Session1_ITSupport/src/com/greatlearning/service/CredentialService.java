package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.*;

public class CredentialService {

	// generate email with the syntax firstnamelstname@deptname.company.com
	public String generateEmail(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".greatlearning.com";
	}

	// Generates the password
	public String passwordGenrator() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_+<>?,./|";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}

		return String.valueOf(password);

	}

	// Displays the credentials to the employee
	public void showCreds(Employee emp, String email, String password) {

		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email --> " + email);
		System.out.println("Password --> " + password);
	}
}
