package com.assignment_4.superclasses;

import com.assignment_4.interfaces.BankOperations;

import java.util.UUID;

/**
 * @author mattiassvensson
 *
 */
public class BankAccount implements BankOperations{

	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0;
	

	/**
	 * Construtor method for generate random account number and set account balance for bank account
	 */
	public BankAccount() {
		super();
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank account";
		this.balance = 0;
	}
	/**
	 * Method get account number
	 * @return
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * Metod to set account number
	 * @param accountNumber
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * Method to get account type
	 * @return
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * Method to set account type
	 * @param accountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * Method to get balance
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * Method to set balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * Method for drew money from account. if statment to so costumer cant drew negative value
	 */
	@Override
	public void withdrawMoney(double amount) {
		if (amount>=0){
			setBalance(getBalance() - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}	
	}
	/**
	 * Method for deposit money from account. if statment to so costumer cant deposit negative value
	 */
	@Override
	public void depositMoney(double amount) {
		if (amount >= 0){
			setBalance(getBalance() + amount);
		}else {
			System.out.println("You can not deposit a negative value!" );
		}
		
	}
	/**
	 * toString method to send account information
	 */
	public String toString(){
		
		return "Account Info: Account Nr: " + getAccountNumber() + " Account type: " + getAccountType() + " Balance: " + getBalance();
		
	}
		
}
