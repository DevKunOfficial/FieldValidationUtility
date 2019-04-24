package com.devkun.fieldvalidator.model;

public class ValidatedNumber extends ValidatedObject {
	Number value;
	
	public ValidatedNumber(Number value) {
		super();
		this.value = value;
	}
	
	public ValidatedNumber checkIfGreaterThan(Number smallerNumber) {
		//todo
		return this;
	}
	
	public ValidatedNumber checkIfSmallerThan(Number largerNumber) {
		//todo
		return this;
	}
	
	public ValidatedNumber checkIfDecimal() {
		//todo
		return this;
	}
}
