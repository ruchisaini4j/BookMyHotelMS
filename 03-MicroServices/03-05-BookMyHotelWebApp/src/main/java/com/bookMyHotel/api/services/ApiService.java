package com.bookMyHotel.api.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

public class ApiService {
	
	@Autowired
	DiscoveryClient discoveryClient;

	
	
	

	
	protected URI getInstance(String serviceName)
	{
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceName);
		URI uri = serviceInstances.get(0).getUri();
		return uri;
	}

	

}
