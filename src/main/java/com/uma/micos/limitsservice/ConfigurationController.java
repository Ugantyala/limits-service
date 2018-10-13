package com.uma.micos.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {
	
	@Autowired
	ConfigurationService config;
	
	@GetMapping("limits")
	public LimitConfiguration getDetailsFromConfiguration(){
	
		return new LimitConfiguration(config.getMinimum(),config.getMaximum());
		
	}

}
