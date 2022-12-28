package com.Bean.sujit;

import java.io.Serializable;

public class UserBean implements Serializable {
	
	//member variable ---> bean properties
	private String userId;
	private String userName;
	private String accountNo;
	private String password;
	private double balance;
	
	
	//setter method
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	
	//getter method 
	public String getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName; 
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Double getBalance() {
		return balance;
	}
 
	
	//ToString mehtod override
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", accountNo=" + accountNo + ", password="
				+ password + ", balance=" + balance + "]";
	}
	
} 
