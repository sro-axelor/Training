package com.axelor.action.demomessaging.service;

import java.util.List;

import javax.mail.internet.InternetAddress;

import com.axelor.db.Model;
import com.axelor.mail.MailException;
import com.axelor.mail.db.MailMessage;

public interface MailService {
	 void send(MailMessage message) throws MailException; 

	  void fetch() throws MailException; 

	  Model resolve(String email); 

	  List<InternetAddress> findEmails(String matching, List<String> selected, int maxResults); 
	
}
