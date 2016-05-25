package com.rom.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rom.dao.TestDao;
import com.rom.entity.Customer;
import com.rom.entity.Ibatis;
import com.rom.entity.Ticket;
import com.rom.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testdao;
	
	public String testQuery() throws Exception {
		List<Ibatis> list = testdao.testQuery();
		String res = "";
        if (list != null && list.size() > 0) {
            for (Ibatis user : list) {
                res += user.toString() + "|";
            }
        } else {
            res = "Not found.";
        }
        return res;
	}

	
	
	public Ticket selectTicketById(Integer id){
		Ticket t = testdao.selectTicketById(id);
		return t;
	}
	
	
	public List<Customer> selectCustomerByName(String name){
		List<Customer>  list = testdao.selectCustomerByName(name);
		System.out.println(list.size());
		return list;
	}
	
	 public List<Map<String,Object>> selectlist(){
		 return testdao.selelist();
	 }
	 
	 
	 public int selecount(){
		 return testdao.selecount();
	 }
	
}
