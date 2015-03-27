package vb.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.Invocation.Builder;  

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://127.0.0.1:1337").path(".");

        Builder builder =   target.request();
        //Response response  = builder.get();
        String result  = builder.get(String.class);
        System.out.println(target.getUri().toString());
        System.out.println("Result=" + result);
        
	}

}
