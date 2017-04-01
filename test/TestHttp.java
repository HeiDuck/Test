package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestHttp {
	public String result;
	TestHttp(){}
	@Test
	public void getMessage() throws Exception{
		String url = "http://localhost:12138/servlets/binserv/B2B"; 
		String command = "com.agilecontrol.phone.B2BCmd";
		String cmd = "b2b.login";
		String username = "root";
		String password = "lifecycle";
		HttpClient client = HttpClients.createDefault();
		HttpPost request = new HttpPost(url);
		List <NameValuePair> nvp = new ArrayList<NameValuePair>();
		JSONObject transaction = new JSONObject();
		JSONObject params = new JSONObject();
		
		params.put("cmd",  cmd);
		params.put("username",  username);
		params.put("password",  password);
		transaction.put("params", params);
		transaction.put("command",  command);
		
		nvp.add(new BasicNameValuePair("transaction", transaction.toString()));
		request.setEntity(new UrlEncodedFormEntity(nvp,HTTP.UTF_8)); 
		
		System.out.println("Executing request " + request.getRequestLine());
		
		HttpResponse response = client.execute(request);
		HttpEntity httpEntity = response.getEntity();  
        String result = EntityUtils.toString(httpEntity);//È¡³öÓ¦´ð×Ö·û´®  
		System.out.println("Response Code: " + result);
		this.result = result;
	}
}
