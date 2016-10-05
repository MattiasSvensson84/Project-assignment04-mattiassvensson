package com.assignment_4.subclasses;

import java.util.ArrayList;
import com.assignment_4.superclasses.*;
/**
 * 
 * @author Mattias Svensson
 *
 */
public class BankCustomer extends Humen{

	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
	/**
	 * Constuktor method for class bankcustomer
	 * @param name
	 * @param age
	 */
	public BankCustomer (String name, int age){
		
		super (name,age);	
	}
	
	/**
	 * getters customeraccunts
	 * @return customerAccounts
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}
	
	/**
	 * setter for customeraccunts
	 * @param customerAccounts
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	
	/**
	 * method for adding a bankaccount
	 * @param bankAccount
	 */
	public void addAccount(BankAccount bankAccount){
		customerAccounts.add(bankAccount);
	}
	/**
	 * Method for deposit money from accounts
	 * @param accountNumber
	 * @param amount
	 */	
	public void  depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i< customerAccounts.size(); i++){
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber));
			customerAccounts.get(i).depositMoney(amount);
		}
	}
	/**
	 * Method for drew money from accounts
	 * @param accountNumber
	 * @param amount
	 */
	public void withdrawFromAccount(String accountNumber, double amount){
		for (int i = 0; i< customerAccounts.size(); i++){
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber));
			customerAccounts.get(i).withdrawMoney(amount);
		}
	}
	/**
	 * toString method for print all the information about a bankaccount in text
	 */
	@Override
	public String toString() {
		
		String result = "";
		result += "Name: " + getName() + " Age: " + getAge() + "\n";
		
		
		for (int i = 0 ; i < customerAccounts.size(); i++){	
			result += customerAccounts.get(i).toString() + "\n";
		}
		return result ;
	}	
	
}
