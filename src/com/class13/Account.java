package com.class13;

public class Account {

	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;

	public void login(String passedUserNameWhenLogging, String passedPasswordWhenLogging) {

		if (userName.equals("passedUserNameWhenLogging") && password.equals(passedUserNameWhenLogging)) {
			System.out.println(" Weolcome to my biatifull moon" + balance);

		} else {
			System.out.println("Username or passworf is not correct");
		}
	}

	public void printInfo() {
		if (isLoggedIn) {
			System.out.println("Your Account number is" + accountNumber +"Your balance is " + balance);
  		}
	}

	public void printUsernameAndPassword(String string, String string2) {
		// TODO Auto-generated method stub
		if(userName.equals("Bryan")) {
			System.out.println("Hi Bryan");
		}else { 
			System.out.println("by Bryan");
		}
	}
}
