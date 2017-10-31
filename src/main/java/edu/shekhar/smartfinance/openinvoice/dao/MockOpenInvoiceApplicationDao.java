package edu.shekhar.smartfinance.openinvoice.dao;

import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;
import edu.shekhar.smartfinance.openinvoice.factory.OpenInvoiceEntityBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mock")
public class MockOpenInvoiceApplicationDao implements OpenInvoiceApplicationDao {

	@Autowired
	@Qualifier("mock")
	private OpenInvoiceEntityBuilderFactory factory;

	@Override
	public OpenInvoiceResponse getApplicationById(String countryCode, Long applicationID) {

		return factory.manuFactureOpenInvoice(countryCode, applicationID);

	}

	@Override
	public OpenInvoiceResponse cancelApplication(String countryCode, Long applicationID) {

		return factory.manuFactureOpenInvoice(countryCode, applicationID);
	}

}
