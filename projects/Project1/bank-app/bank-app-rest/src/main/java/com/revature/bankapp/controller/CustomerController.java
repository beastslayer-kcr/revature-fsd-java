package com.revature.bankapp.controller;

import java.sql.SQLException;

import javax.ws.rs.Consumes;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.costumerImpl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.util.CustomerDao;

@Path("/customers")
public class CustomerController {
        
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	private CustomerDao dao = new CustomerDaoImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Customer customer) {
		LOGGER.info("Start");
		LOGGER.debug("{}", customer);
		try {
			dao.create(customer);
			LOGGER.info("End");
			return Response.ok().build();
		} catch (SQLException e) {
			return Response.status(500).build();
		}
	}
}

