package com.icici.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

	@GetMapping("/testAzure")
	public String test() {
		return "Welcome to Azure Demo 1";
	}
	
}
