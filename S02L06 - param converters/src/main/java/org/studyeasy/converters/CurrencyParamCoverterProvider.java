package org.studyeasy.converters;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class CurrencyParamCoverterProvider implements ParamConverterProvider {

	// will return param converter type
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		
		return (ParamConverter<T>) new CurrencyParamConverter();
	}

}
