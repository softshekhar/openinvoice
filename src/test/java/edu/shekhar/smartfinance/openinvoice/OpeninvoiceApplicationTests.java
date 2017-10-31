package edu.shekhar.smartfinance.openinvoice;

import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;
import edu.shekhar.smartfinance.openinvoice.service.OpenInvoiceService;
import edu.shekhar.smartfinance.openinvoice.util.OpenInvoiceApplicationResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpeninvoiceApplicationTests {

	private static final Log logger = LogFactory.getLog(OpeninvoiceApplicationTests.class);


	@Test
	public void contextLoads() {
	}


	@Autowired
	private OpenInvoiceService openInvoiceService;
	private Validator validator;
	private MockMvc mockMvc;

	@Before
	public void init() {
		ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
		this.validator = vf.getValidator();
		logger.debug("Mock object created");

	}

	@Test
	public void testCancelApplicationValidation() {
		logger.debug("Running cancel application");
		OpenInvoiceResponse objectToTest = openInvoiceService.cancelApplication("no", 43533L);
		Set<ConstraintViolation<OpenInvoiceResponse>> violations = this.validator
				.validate(objectToTest);

		violations.forEach(violation -> logger.debug(violation));

		assertTrue(violations.isEmpty());

	}

	@Test
	public void testCancelApplicationResult() {
		logger.debug("Running cancel application");
		OpenInvoiceResponse objectToTest = openInvoiceService.cancelApplication("no", 2L);

		assertTrue(objectToTest.getApplicationDetails().getResult()
				.equals(OpenInvoiceApplicationResult.CANCELLED));
	}

	@Test
	public void testAlreadyCancelled() throws Exception {
		logger.debug("Running ");

	}

	@Ignore
	@Test
	public void testPermissionToCancelApplication() {

	}

	@Test
	public void testLateForCancellation() {
		//test if application is already processed

	}

	@Ignore
	@Test
	public void testCancelApplicationResponse() throws Exception {
		logger.debug("Running response test");
		this.mockMvc.perform(post("/openinvoice/no/500")).andExpect(status().isOk());
	}

}
