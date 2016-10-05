package com.assignment_4.subclasses;

import com.assignment_4.superclasses.*;

import java.util.UUID;
/**
 * 
 * @author Mattias Svensson
 *
 */
public class PersonalAccount extends BankAccount {
	/**
	 * Construtor method for generate random account number and set account balance for personal account
	 */
	public  PersonalAccount(){
		super();
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}

}
