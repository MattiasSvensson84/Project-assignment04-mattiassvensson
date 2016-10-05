package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
/**
 * 
 * @author Mattias Svensson
 *
 */
public class SavingAccount extends BankAccount {
	/**
	 * Constructor Method to genarate random account number and set the account balance for saving account 
	 */
	public  SavingAccount(){
		super();
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}

}
