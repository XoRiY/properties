package com.properties.app.main.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(ignoreInvalidFields = true)
public class PropertiesClassBinder {

	@Value(value = "${param1}")
	private String param1;

	@Value(value = "${param2}")
	private String param2;

	@Value(value = "${param3}")
	private String param3;

	@Bean
	public void getProperties() {
		System.out.println("PropertiesClassBinder");
		System.out.println(param1);
		System.out.println(param2);
		System.out.println(param3);
	}


}
