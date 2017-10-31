package edu.shekhar.smartfinance.openinvoice.factory;

import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("oracle")
public class OracleOpenInvoiceEntityBuilderFactory implements OpenInvoiceEntityBuilderFactory {
	@Override
	public OpenInvoiceResponse manuFactureOpenInvoice(String countryCode, Long applicationID) {
		//TODO: Provide Implemenation
		return null;
	}
}
