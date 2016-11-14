package com.loylty.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.loylty.model.Payment;




@Service
public class PaymentService {

	private static List<Payment> payments;
	
	{
		payments = new ArrayList<Payment>();
		payments.add(new Payment("1", 11, 12, 13));
		payments.add(new Payment("2", 21, 22, 23));
		payments.add(new Payment("3", 31, 32, 33));
		payments.add(new Payment("4", 41, 42, 43));
	}
	
	public List<Payment> getAll(){
		return payments;
	}
	
	public Payment get(String id){
		for(Payment p : payments){
			if(p.getPayment_id().equalsIgnoreCase(id)){
				return p;
			}
		}
		return null;
	}
	
	public void addPayment(Payment p){
		payments.add(p);
	}
	
	public void deletePayment(String id){
		for(Payment p : payments){
			if(p.getPayment_id().equalsIgnoreCase(id)){
				payments.remove(p);
			}
		}
	}
	
	public void updatePayment(Payment pNew){
		for(Payment p : payments){
			if(p.getPayment_id().equalsIgnoreCase(pNew.getPayment_id())){
				payments.remove(p);
				payments.add(pNew);
			}
		}
	}
}
