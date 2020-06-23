package org.studyeasy.converters;

import javax.ws.rs.ext.ParamConverter;

import org.studyeasy.Currency;

public class CurrencyParamConverter implements ParamConverter<Currency>{

	// implement business logic
	@Override
	public Currency fromString(String code) {
		
		Currency currency = null;
		
		switch(code.toUpperCase()) {
		case "EUR": currency=new Currency(code, "Euro");
		break;
		case "USD": currency=new Currency(code, "US Dollars");
		break;
		case "INR": currency=new Currency(code, "Rupees");
		break;
		}
		return currency;
	}

	// return value in the form of string
	@Override
	public String toString(Currency currency) {
		
		return currency.toString();
	}

}
