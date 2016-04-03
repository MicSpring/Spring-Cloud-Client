package com.subha.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.subha.client.service.ClientService;

@Controller
public class ClientController {

	@Autowired
	ClientService clientService;
	
	@RequestMapping("/authDetails")
	@ResponseBody
	public String authDetails()
	{
		String info = clientService.getAuthInfo();
		return info;
	}
	
}
