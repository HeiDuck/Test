package webservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface TestWebServiceImpl {
	public String sayHello(@WebParam(name = "name")String name, @WebParam(name = "message")String message);
}
