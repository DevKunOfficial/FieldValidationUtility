package com.devkun.fieldvalidator.model;

public class ValidatedString extends ValidatedObject{
	String value;
	
	public ValidatedString(String value) {
		super();
	}
	
	public ValidatedString checkOnMaxLength(int maxLength) {
		//todo
		return this;
	}
	
	public ValidatedString checkOnMinLength(int minLength) {
		//todo
		return this;
	}
	
	public ValidatedString checkIfNumeric() {
		//todo
		return this;
	}
	
	public ValidatedString checkIfAlphabetic() {
		//todo
		return this;
	}
	
	public ValidatedString checkIfValidEmail() {
		//todo
		return this;
	}
	
	public ValidatedString checkIfDecimal() {
		//todo
		return this;
	}
	
	public ValidatedString checkIfEmpty() {
		//todo
		return this;
	}
	
	public ValidatedString required() {
		//todo
		return this;
	}
}
