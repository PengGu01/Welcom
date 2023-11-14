package com.example.demo;

public class Account {
	private String accountnumber;
	private int accounttypeid;
	private int customerid;
	private double balance;
	private double overdraftlimit;
	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", accounttypeid=" + accounttypeid + ", customerid="
				+ customerid + ", balance=" + balance + ", overdraftlimit=" + overdraftlimit + "]";
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getAccounttypeid() {
		return accounttypeid;
	}
	public void setAccounttypeid(int accounttypeid) {
		this.accounttypeid = accounttypeid;
	}
	public Account() {
		super();
	}
	public Account(String accountnumber, int accounttypeid, int customerid, double balance, double overdraftlimit) {
		super();
		this.accountnumber = accountnumber;
		this.accounttypeid = accounttypeid;
		this.customerid = customerid;
		this.balance = balance;
		this.overdraftlimit = overdraftlimit;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getOverdraftlimit() {
		return overdraftlimit;
	}
	public void setOverdraftlimit(double overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}
}
