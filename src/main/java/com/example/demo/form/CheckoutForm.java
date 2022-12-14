package com.example.demo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CheckoutForm {

	@Email
	private String email;
	
	@NotNull
	@Min(4)
	private Integer amount;
	
	@NotNull
	@Size(min=5,max=200)
	private String featureRequest;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getFeatureRequest() {
		return featureRequest;
	}
	public void setFeatureRequest(String featureRequest) {
		this.featureRequest = featureRequest;
	}
}
