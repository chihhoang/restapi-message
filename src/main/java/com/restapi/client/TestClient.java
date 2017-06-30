package com.restapi.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

public class TestClient {

	public static void main(String[] args) {
		URI uri = UriBuilder.fromUri("http://localhost:8080/restapi-message/webapi").build();
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		System.out.println(target.path("messages").path("html").request(MediaType.TEXT_HTML).get(String.class));
		System.out.println(target.path("messages").path("xml").request(MediaType.APPLICATION_XML).get(String.class));
		System.out.println(target.path("messages").path("json").request(MediaType.APPLICATION_JSON).get(String.class));

	}
}
