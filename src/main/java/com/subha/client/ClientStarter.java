package com.subha.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDiscoveryClient
//@PropertySource("classpath:application.properties")
public class ClientStarter {
	
	public static void main(String[] args)
	{
		/**
		 * Loading Multiple YML files with spring.config.name as Spring does not support
		 * @PropertySource for YML files.
		 * 
		 * Now Spring boot which by default loads application.yml, disables it
		 * once spring.config.name gets set, but the option as bootstrap.yml is 
		 * still a go.
		 * 
		 */
		
		System.setProperty("spring.config.name", "client-config,application-dev");
		System.setProperty("spring.profiles.active","dev");
		SpringApplication.run(ClientStarter.class, args);

	}

}
