package org.jamescarr;
import javax.jws.WebService;

@WebService(endpointInterface="org.jamescarr.Greeter", serviceName="GreetingService")
public class EnglishGreeter implements Greeter{
	@Override
	public String getGreetingFor(String greetee){
		return "Hello " + greetee;
	}
}
