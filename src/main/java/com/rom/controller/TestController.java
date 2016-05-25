package com.rom.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rom.entity.Customer;
import com.rom.entity.Ticket;
import com.rom.service.TestService;

@Controller
@RequestMapping("/testController")
public class TestController {
	
	@Autowired
	private TestService testService ;
	
	@RequestMapping("test")
	public void test(HttpServletRequest request, HttpServletResponse response){
		System.out.println("·===========================================·");
		 try {
	            String result = testService.testQuery();
	            response.getWriter().print(result);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
	
	@RequestMapping("t1")
	public void t1(HttpServletRequest request, HttpServletResponse response){
		 try {
	            Ticket result = testService.selectTicketById(1);
	            System.out.println(result.toString());
	            response.getWriter().print(result);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
	@RequestMapping(value="t2", method = RequestMethod.GET)
	public void t2(HttpServletRequest request, 
			HttpServletResponse response) throws UnsupportedEncodingException{
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		
		//@RequestParam(value="name",required = false) String name,
		 try {
	            List<Customer> result = testService.selectCustomerByName(name);
	            
	            for (Customer customer : result) {
	            	List<Ticket> list =  customer.getTickets();
	            	for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).getTicketAddress());
					}
				}
	            
	            System.out.println(result.size());
	            System.out.println(result.toString());
	            response.getWriter().print(result);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	@RequestMapping(value="t3", method=RequestMethod.GET)
	public void t3(HttpServletRequest request,HttpServletResponse response){
		List<Map<String,Object>> list = testService.selectlist();
//		for (Customer customer : list) {
//			System.out.print(customer.getCustomerId() +" , "+customer.getCustomerTel() +","+customer.getCustomerName() +"\n");
//		}
		for (Map<String, Object> map : list) {
			Set<String> headerkey = map.keySet();
			Iterator<String> headerkeyit = headerkey.iterator();
			while (headerkeyit.hasNext()) {
				String key = (String) headerkeyit.next();
				System.out.println(key +":" + map.get(key).toString());
			}
		}
		try {
			response.getWriter().println(list.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "t4",method = RequestMethod.GET)
	public void t4(HttpServletRequest request , HttpServletResponse response){
		int count = testService.selecount();
		System.out.println(count);
		try {
			response.getWriter().println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
