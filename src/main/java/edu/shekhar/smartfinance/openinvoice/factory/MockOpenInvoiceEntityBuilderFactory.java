package edu.shekhar.smartfinance.openinvoice.factory;

import edu.shekhar.smartfinance.openinvoice.entity.ApplicationDetails;
import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;
import edu.shekhar.smartfinance.openinvoice.util.podam.manufacturer.CustomStringManufacturer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@Component
@Qualifier("mock")
public class MockOpenInvoiceEntityBuilderFactory implements OpenInvoiceEntityBuilderFactory {

	@Override
	public OpenInvoiceResponse manuFactureOpenInvoice(String countryCode, Long applicationID) {
		CustomStringManufacturer customStringManufacturer = new CustomStringManufacturer();
		PodamFactory factory = new PodamFactoryImpl();
		factory.getStrategy().addOrReplaceTypeManufacturer(String.class, customStringManufacturer);

		OpenInvoiceResponse appObj = factory.manufacturePojo(OpenInvoiceResponse.class);
		appObj.setCreditApplicationId(applicationID);
		ApplicationDetails appDetails = appObj.getApplicationDetails();
		appDetails.setCreditApplicationId(applicationID);
		return appObj;
	}
}
