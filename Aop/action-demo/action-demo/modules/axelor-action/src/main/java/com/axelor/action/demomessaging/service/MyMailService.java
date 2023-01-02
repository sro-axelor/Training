package com.axelor.action.demomessaging.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.mail.internet.InternetAddress;
import com.axelor.action.db.Customer;
import com.axelor.action.db.repo.CustomerRepository;
import com.axelor.db.Model;
import com.axelor.db.Query;
import com.axelor.inject.Beans;
import com.axelor.mail.service.MailServiceImpl;
import com.google.common.base.Joiner;
import static com.axelor.common.StringUtils.isBlank;

public class MyMailService extends MailServiceImpl {
	
	  @Override
	  public Model resolve(String email) {
	    final CustomerRepository customers = Beans.get(CustomerRepository.class);
	    final Customer customer = customers.findByEmail(email);
	    if (customer != null) {
	      return customer;
	    }
	    return super.resolve(email);
	  }

/** Override to return contact email addresses. */
	  @Override
	  public List<InternetAddress> findEmails(String matching, List<String> selected, int maxResult) {

	    final List<String> where = new ArrayList<>();
	    final Map<String, Object> params = new HashMap<>();

	    where.add("self.email is not null");

	    if (!isBlank(matching)) {
	      where.add(
	          "(LOWER(self.email) like LOWER(:email) OR LOWER(self.firstName) like LOWER(:email))");
	      params.put("email", "%" + matching + "%");
	    }
	    if (selected != null && !selected.isEmpty()) {
	      where.add("self.email not in (:selected)");
	      params.put("selected", selected);
	    }

	    final String filter = Joiner.on(" AND ").join(where);
	    final Query<Customer> query = Query.of(Customer.class);

	    if (!isBlank(filter)) {
	      query.filter(filter);
	      query.bind(params);
	    }

	    final List<InternetAddress> addresses = new ArrayList<>();
	    for (Customer customer : query.fetch(maxResult)) {
	      try {
	        final InternetAddress item = new InternetAddress(customer.getEmail(), customer.getFirstName());
	        addresses.add(item);
	      } catch (UnsupportedEncodingException e) {
	      }
	    }

	    return addresses;
	  }
}

