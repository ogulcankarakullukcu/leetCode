package test.util;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class StringArrayConverter extends SimpleArgumentConverter {

	@Override
	protected Object convert(Object object, Class<?> classType) throws ArgumentConversionException {
		if(object instanceof String && String[].class.isAssignableFrom(classType)) {
			return ((String) object).split(";");			
		}else {
			throw new IllegalArgumentException("Conversion is not supported!");
		}

	}

}
