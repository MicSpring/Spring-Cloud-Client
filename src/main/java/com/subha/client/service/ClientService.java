package com.subha.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {
	
	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	
	@Value("${service.authserver.url}")
	String authserviceURL;
	
	@Value("${service.accountserver.url}")
	String accountserviceURL;
	
	@Value("${service.peropleserver.url}")
	String peopleserviceURL;
	
	public String getAuthInfo()
	{
		System.out.println("The URLs is:"+authserviceURL+"====="+accountserviceURL+"====="+peopleserviceURL);
		String info = restTemplate.getForObject(authserviceURL+"/authservice/login", String.class);
		return info;
	}

}
