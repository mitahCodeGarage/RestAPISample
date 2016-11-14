package com.loylty.model;


public class Payment {
	String payment_id;
	int cust_id;
	int staff_id;
	int rental_id;
	
	public Payment(String payment_id, int cust_id, int staff_id, int rental_id){
		this.payment_id = payment_id;
		this.cust_id = cust_id;
		this.staff_id = staff_id;
		this.rental_id = rental_id;
	}
	
	public String getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int customer_id) {
		this.cust_id = customer_id;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public int getRental_id() {
		return rental_id;
	}
	public void setRental_id(int rental_id) {
		this.rental_id = rental_id;
	}
}
