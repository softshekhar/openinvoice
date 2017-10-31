package edu.shekhar.smartfinance.openinvoice.factory;

import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;

public interface OpenInvoiceEntityBuilderFactory {
	OpenInvoiceResponse manuFactureOpenInvoice(String countryCode, Long applicationID);
}
