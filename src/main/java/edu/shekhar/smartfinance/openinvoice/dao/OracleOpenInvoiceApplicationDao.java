package edu.shekhar.smartfinance.openinvoice.dao;

import edu.shekhar.smartfinance.openinvoice.entity.ApplicationDetails;
import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("oracle")
public class OracleOpenInvoiceApplicationDao
		implements OpenInvoiceApplicationDao {

	@Override
	public OpenInvoiceResponse getApplicationById(String countryCode, Long applicationID) {
		OpenInvoiceResponse appObj = new OpenInvoiceResponse();
		//TODO: Write implementation code.

		// Use jdbcTemplate in the super class to query and update the database:
		//String sql = "select * from some_table where id = ?";
		//Object[] args = new Object[]{"dummy"};
		//int[] argTypes = new int[]{Types.VARCHAR};
		// TODO: Use an existing or implement a new row mapper for the result set.
		//jdbcTemplate.query(sql, args, argTypes, rowMapper);

		return appObj;
	}

	@Override
	public OpenInvoiceResponse cancelApplication(String countryCode, Long applicationID) {
		OpenInvoiceResponse appObj = new OpenInvoiceResponse();
		ApplicationDetails appDetails = new ApplicationDetails();
		appDetails.setOrderIdentifier("123");
		appDetails.setCustomerNumber("456");
		appDetails.setAmount(2345);
		appDetails.setResult("cancelled");
		appObj.setApplicationDetails(appDetails);

		//TODO: Write implementation code
		return appObj;
	}
}
