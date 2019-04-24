package com.devkun.fieldvalidator;

import java.time.LocalDateTime;

import com.devkun.fieldvalidator.model.ValidatedBoolean;
import com.devkun.fieldvalidator.model.ValidatedDateTime;
import com.devkun.fieldvalidator.model.ValidatedNumber;
import com.devkun.fieldvalidator.model.ValidatedString;

public class Validator {
	
	public ValidatedString validate(String value) {
		return new ValidatedString(value);
	}
	
	public ValidatedNumber validate(Number value) {
		return new ValidatedNumber(value);
	}
	
	public ValidatedDateTime validate(LocalDateTime value) {
		return new ValidatedDateTime(value);
	}
	
	public ValidatedBoolean validate(Boolean value) {
		return new ValidatedBoolean(value);
	}
}
