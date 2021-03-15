package com.class13;

public class BankApplication {

	public static void main(String[] args) {
Account ghulumsAccount= new Account();
ghulumsAccount.accountNumber="777";
ghulumsAccount.userName="Ghulam123";
ghulumsAccount.password="pass123";
ghulumsAccount.balance=7.69;
ghulumsAccount.login("Ghulam123","pass123");
//ghulumsAccount.login("Gluham123","pass123");
ghulumsAccount.printUsernameAndPassword("Ahmed","Ahmed123");

	}

}
