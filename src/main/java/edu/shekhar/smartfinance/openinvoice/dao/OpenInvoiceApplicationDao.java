package edu.shekhar.smartfinance.openinvoice.dao;

import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenInvoiceApplicationDao {

	OpenInvoiceResponse getApplicationById(String countryCode, Long applicationID);

	OpenInvoiceResponse cancelApplication(String countryCode, Long applicationID);
}
