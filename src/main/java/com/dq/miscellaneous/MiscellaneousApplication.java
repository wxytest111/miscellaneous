package com.dq.miscellaneous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MiscellaneousApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscellaneousApplication.class, args);
	}

}
