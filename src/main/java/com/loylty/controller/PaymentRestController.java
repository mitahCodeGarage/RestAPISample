package com.loylty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loylty.model.Payment;
import com.loylty.service.PaymentService;

@RestController
public class PaymentRestController {
	
	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(value="/payments/", method=RequestMethod.GET)
	public ResponseEntity<List<Payment>> getPayments(){
		List<Payment> rules = paymentService.getAll();
		if(rules.isEmpty()){
			return new ResponseEntity<List<Payment>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Payment>>(rules,HttpStatus.OK);
	}
	
	@RequestMapping(value="/payments/{id}", method=RequestMethod.GET)
	public ResponseEntity<Payment> getPayment(@PathVariable("id") String id){
		Payment payment = paymentService.get(id);
		if(payment == null){
			return new ResponseEntity<Payment>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
	}
}
