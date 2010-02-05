package org.jamescarr;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.jamescarr.Foo;

public class Main{
	public static void main(String... args){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8080/services/services/english");
		factory.setServiceClass(Foo.class);
		Foo client = (Foo)factory.create();

		System.out.println(client.getGreetingFor("James"));
	}
}
