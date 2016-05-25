package com.rom.dao;

import java.util.List;
import java.util.Map;

import com.rom.entity.Customer;
import com.rom.entity.Ibatis;
import com.rom.entity.Ticket;

public interface TestDao {
	 public List<Ibatis> testQuery() throws Exception;
	 
	 
	 public Ticket selectTicketById(Integer id);
	 
	 
	 public List<Customer> selectCustomerByName(String name);
	 
	 
	 public List<Map<String,Object>> selelist();
	 
	 
	 public int selecount();
}
