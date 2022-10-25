package com.Test.sujit;

import com.Bean.sujit.UserBean;

public class Test {

	public static void main(String[] args) {
		UserBean user=new UserBean();
		
		user.setUserId("abcd1234");
		user.setUserName("Rahul");
		user.setAccountNo("SBIN456582696646");
		user.setPassword("sujitrout1234");
		user.setBalance(45000.50);
		
		System.out.println(user);
		
		String user_id = user.getUserId();
		System.out.println(user_id);
		
		String user_name = user.getUserName();
		System.out.println(user_name);
		
		String user_accountNo = user.getAccountNo();
		System.out.println(user_accountNo);
		
		String user_password = user.getPassword();
		System.out.println(user_password);
		
		double user_balance = user.getBalance();
		System.out.println(user_balance);
	}

}

