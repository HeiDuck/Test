package webservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface="webservice.TestWebServiceImpl",serviceName="TestWebService")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class TestWebService implements TestWebServiceImpl{
	@Override
	public String sayHello(@WebParam(name = "name") String name, @WebParam(name = "message") String message) {
		return "hello , " + name + " , " + message;
	}
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:90/webservice/TestWebService",new TestWebService());//����һ���߳�
		System.out.println("I'm damn good!!!");
	}
}
