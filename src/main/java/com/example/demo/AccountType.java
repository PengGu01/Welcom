package com.example.demo;

public class AccountType {
	private int accounttypeId;
	private String accounttypename;
	private String accounttypedesc;
	private String rate;
	public AccountType(int accounttypeId, String accounttypename, String accounttypedesc, String rate) {
		super();
		this.accounttypeId = accounttypeId;
		this.accounttypename = accounttypename;
		this.accounttypedesc = accounttypedesc;
		this.rate = rate;
	}
	public AccountType() {
		super();
	}
	public int getAccounttypeId() {
		return accounttypeId;
	}
	public void setAccounttypeId(int accounttypeId) {
		this.accounttypeId = accounttypeId;
	}
	public String getAccounttypename() {
		return accounttypename;
	}
	public void setAccounttypename(String accounttypename) {
		this.accounttypename = accounttypename;
	}
	public String getAccounttypedesc() {
		return accounttypedesc;
	}
	public void setAccounttypedesc(String accounttypedesc) {
		this.accounttypedesc = accounttypedesc;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "AccountType [accounttypeId=" + accounttypeId + ", accounttypename=" + accounttypename
				+ ", accounttypedesc=" + accounttypedesc + ", rate=" + rate + "]";
	}
	
	
}
