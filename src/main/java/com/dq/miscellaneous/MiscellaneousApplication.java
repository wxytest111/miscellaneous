package com.dq.miscellaneous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages = "com.dq.miscellaneous")
@EnableJpaAuditing
public class MiscellaneousApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscellaneousApplication.class, args);
	}

}
