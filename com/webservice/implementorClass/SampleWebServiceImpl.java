package com.webservice.implementorClass;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface="com.webservice.interfaceClass.SampleWebService")
public class SampleWebServiceImpl {

	public String getStringWebService(String a)
	{
		return "Web Service is running with input: "+a;
	}
	//I have added something new here, lets see if this change is reflected back
}
