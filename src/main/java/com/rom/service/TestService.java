package com.rom.service;

import java.util.List; 
import java.util.Map;

import com.rom.entity.Customer;
import com.rom.entity.Ticket;

public interface TestService {

	public String testQuery()throws Exception;
	
	public Ticket selectTicketById(Integer id);
	
	public List<Customer> selectCustomerByName(String name);
	
	public List<Map<String,Object>> selectlist();
	
	public int selecount();
}
