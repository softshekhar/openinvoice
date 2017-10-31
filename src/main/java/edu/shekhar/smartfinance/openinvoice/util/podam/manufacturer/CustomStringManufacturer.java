package edu.shekhar.smartfinance.openinvoice.util.podam.manufacturer;

import edu.shekhar.smartfinance.openinvoice.entity.CustomerDetails;
import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;
import uk.co.jemos.podam.api.AttributeMetadata;
import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.typeManufacturers.StringTypeManufacturerImpl;

import java.lang.reflect.Type;
import java.util.Map;

public class CustomStringManufacturer extends StringTypeManufacturerImpl {

	@Override
	public String getType(DataProviderStrategy strategy, AttributeMetadata attributeMetadata,
			Map<String, Type> genericTypesArgumentsMap) {

		if (CustomerDetails.class.isAssignableFrom(attributeMetadata.getPojoClass())) {

			Fairy fairy = Fairy.create();
			Person person = fairy.person();
			if (String.valueOf(CustomFields.FIRSTNAME).equals(attributeMetadata.getAttributeName())) {
				return person.firstName();
			}
			else if (String.valueOf(CustomFields.MIDDLENAME)
					.equals(attributeMetadata.getAttributeName())) {
				return person.middleName();
			}
			else if (String.valueOf(CustomFields.SURNAME).equals(attributeMetadata.getAttributeName())) {
				return person.lastName();
			}
		}
		return super.getType(strategy, attributeMetadata, genericTypesArgumentsMap);
	}
}
