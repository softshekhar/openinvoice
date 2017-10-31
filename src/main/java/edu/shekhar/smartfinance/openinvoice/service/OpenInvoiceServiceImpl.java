package edu.shekhar.smartfinance.openinvoice.service;

import edu.shekhar.smartfinance.openinvoice.dao.OpenInvoiceApplicationDao;
import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;
import edu.shekhar.smartfinance.openinvoice.util.OpenInvoiceApplicationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OpenInvoiceServiceImpl implements OpenInvoiceService {

	@Autowired
	@Qualifier("mock")
	private OpenInvoiceApplicationDao openInvoiceApplicationDao;

	@Override
	public OpenInvoiceResponse getApplicationById(String countryCode, Long applicationID) {
		OpenInvoiceResponse oir = this.openInvoiceApplicationDao.getApplicationById(countryCode,
				applicationID);
		//TODO: REMOVE later
		oir.getApplicationDetails().setResult(String.valueOf(OpenInvoiceApplicationResult.APPROVED));
		return oir;
	}

	@Override
	public OpenInvoiceResponse cancelApplication(String countryCode, Long applicationID) {
		OpenInvoiceResponse oir = this.openInvoiceApplicationDao.cancelApplication(countryCode,
				applicationID);
		//TODO: REMOVE later
		oir.getApplicationDetails().setResult(
				String.valueOf(OpenInvoiceApplicationResult.CANCELLED));
		return oir;
	}
}
