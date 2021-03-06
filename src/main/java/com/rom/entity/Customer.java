package com.rom.entity;

import java.util.List;

public class Customer {
	private Integer customerId;
    private String customerName;
    private Integer customerTel;
    private List<Ticket> tickets;//使用一个List来表示车票
 
    public List<Ticket> getTickets() {
        return tickets;
    }
 
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
 
    public Integer getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
 
    public String getCustomerName() {
        return customerName;
    }
 
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    public Integer getCustomerTel() {
        return customerTel;
    }
 
    public void setCustomerTel(Integer customerTel) {
        this.customerTel = customerTel;
    }
 
//    @Override
//    public String toString() {
//        return "Customer [customerId=" + customerId + ", customerName="
//                + customerName + ", customerTel=" + customerTel+"]";
//    }
 
}
