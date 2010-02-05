package org.jamescarr;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.WebMethod;

@WebService
public interface Greeter{
	String getGreetingFor(@WebParam(name="greetee") String greetee);
}
