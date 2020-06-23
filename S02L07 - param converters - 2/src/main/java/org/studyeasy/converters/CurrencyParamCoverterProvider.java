package org.studyeasy.converters;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import org.studyeasy.Currency;

@Provider
public class CurrencyParamCoverterProvider implements ParamConverterProvider {

	// will return param converter type
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		
		return new ParamConverter<T>() {

			@Override
			public T fromString(String code) {
				Currency currency = null;
				
				switch(code.toUpperCase()) {
				case "EUR": currency=new Currency(code, "Euro");
				break;
				case "USD": currency=new Currency(code, "US Dollars");
				break;
				case "INR": currency=new Currency(code, "Rupees");
				break;
				}
				return (T) currency;
			}

			@Override
			public String toString(T currency) {
				return currency.toString();
			}
	

		};
		
	}
}
