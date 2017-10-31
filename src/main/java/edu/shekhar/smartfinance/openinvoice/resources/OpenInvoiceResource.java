package edu.shekhar.smartfinance.openinvoice.resources;

import edu.shekhar.smartfinance.openinvoice.entity.OpenInvoiceResponse;
import edu.shekhar.smartfinance.openinvoice.service.OpenInvoiceService;
import edu.shekhar.smartfinance.openinvoice.util.OpenInvoiceApplicationResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.HashMap;
import java.util.Map;

import static javax.ws.rs.core.Response.Status.BAD_REQUEST;

@Component
@Path("/openinvoice")
@Produces(MediaType.APPLICATION_JSON)
public class OpenInvoiceResource {
	private static final Log logger = LogFactory.getLog(OpenInvoiceResource.class);
	private static final String LOG_URL_MSG_PREFIX = "Received a %s request to /openinvoice/";

	@Autowired
	private OpenInvoiceService openInvoiceService;

	@Autowired
	private ApplicationContext applicationContext;

	@GET
	@Path("/{countryCode}/{applicationID}")
	public Response getApplication(@PathParam("countryCode") String countryCode,
			@PathParam("applicationID") Long applicationID) {

		logger.debug(new StringBuffer(String.format(LOG_URL_MSG_PREFIX, HttpMethod.GET))
				.append(countryCode).append("/").append(applicationID));
		try {
			OpenInvoiceResponse appObj = openInvoiceService.getApplicationById(countryCode,
					applicationID);
			return Response.ok(appObj).build();
		}
		catch (Exception e) {
			return getErrorResponse(e, applicationID);
		}
	}

	@GET
	@Path("/helloSpringBeans")
	public Response getLoadedBeans() {


		logger.debug(new StringBuffer(String.format(LOG_URL_MSG_PREFIX, HttpMethod.GET)));
		try {
			String[] beanNames = applicationContext.getBeanDefinitionNames();
			for (String beanName : beanNames) {
				//System.out.println(beanName + " : "
				//		+ applicationContext.getBean(beanName).getClass().toString());
				//String beanFullName = applicationContext.getBean(beanName).getClass().toString();
				//if(beanFullName.startsWith("edu.shekhar.smartfinance.service.leasing")) {
				if(beanName.toLowerCase().startsWith("stkupdateclientconfigdao")
						|| beanName.toLowerCase().startsWith("lindorffficonfigdao")){
					logger.debug("beanName : " + beanName);
				}
				//}
			}
			return Response.ok().build();
		}
		catch (Exception e) {
			return getErrorResponse(e, 0L);
		}
	}

	@DELETE
	@Path("/{countryCode}/{applicationID}")
	public Response cancelApplication(@PathParam("countryCode") String countryCode,
			@PathParam("applicationID") Long applicationID) {


		logger.debug(new StringBuffer(String.format(LOG_URL_MSG_PREFIX, HttpMethod.DELETE))
				.append(countryCode).append("/").append(applicationID));
		try {
			OpenInvoiceResponse appObj = openInvoiceService.cancelApplication(countryCode,
					applicationID);
			return Response.ok(appObj).build();
		}
		catch (Exception e) {
			logger.error(e.getLocalizedMessage());
			return getErrorResponse(e, applicationID);
		}
	}

	@PUT
	@Path("/{countryCode}/{applicationID}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateApplication(@PathParam("countryCode") String countryCode,
			@PathParam("applicationID") Long applicationID) {


		logger.debug(new StringBuffer(String.format(LOG_URL_MSG_PREFIX, HttpMethod.PUT))
				.append(countryCode).append("/").append(applicationID));

		return Response.ok().build();
	}

	@POST
	@Path("/{countryCode}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response makeInvoiceApplication(@PathParam("countryCode") String countryCode) {


		logger.debug(new StringBuffer(String.format(LOG_URL_MSG_PREFIX, HttpMethod.POST))
				.append(countryCode));

		return Response.ok().build();

	}

	private Response getErrorResponse(Exception e, Long applicationID) {
		Map<String, String> errorMsg = new HashMap<>();
		logger.error("Error when getting application " + applicationID, e);
		//TODO : Remove hardcoding of key
		errorMsg.put("result", OpenInvoiceApplicationResult.ERROR.toString());
		return Response.status(BAD_REQUEST).entity(errorMsg).build();
	}

}
