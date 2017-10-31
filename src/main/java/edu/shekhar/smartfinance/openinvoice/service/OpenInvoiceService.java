package edu.shekhar.smartfinance.openinvoice.service;

import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;

/**
 * This interface represents a service that handles different operations for the
 * Open Invoice Application
 */
public interface OpenInvoiceService {

	OpenInvoiceResponse getApplicationById(String countryCode, Long applicationID);

	OpenInvoiceResponse cancelApplication(String countryCode, Long applicationID);

}
