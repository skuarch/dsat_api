package model.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//@EnableScheduling
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(value = { "model.persistence" })
@ComponentScan({ "controller", "model" })
@EnableJpaRepositories("model.repository")
@PropertySource(value = "file:application.properties", ignoreResourceNotFound = false)
public class DsatApiApplication {

	//=================================================================================
	public static void main(String[] args) {
		SpringApplication.run(DsatApiApplication.class, args);
	}
}
