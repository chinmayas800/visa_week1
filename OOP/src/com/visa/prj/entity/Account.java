package com.visa.prj.entity;

/**
 * This is an entity class to represent 
 * account business data.
 * @author chinmaya sahoo
 * @version 1.0
 * 
 *
 */

public class Account {
	private double balance;// state of object [instance variable]
	
	/**
	 * method to credit amount into account
	 * @param amt amount to be credited
	 */
	public void deposit(double amt) {
		balance += amt;		
	}
	
	/**
	 * gives the status of current balance
	 * @return current balalce 
	 */
	public double getBalance() {
		return balance;		
	}

}
