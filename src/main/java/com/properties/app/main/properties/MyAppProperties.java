package com.properties.app.main.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties
public class MyAppProperties {

	private int param1;
	private String param2;
	private String param3;

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	@Override
	public String toString() {
		return "MyAppProperties{" + "\n param1=" + param1 + ",\n param2=" + param2
				+ ",\n param3=" + param3 + "\n}";
	}
	
	@Bean
	private void lancer() {
		System.out.println("MyAppProperties");
		System.out.println(param1);
		System.out.println(param2);
		System.out.println(param3);
	}
	
}