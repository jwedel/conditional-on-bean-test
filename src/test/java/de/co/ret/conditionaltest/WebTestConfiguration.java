package de.co.ret.conditionaltest;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(TestRestTemplate.class)
public class WebTestConfiguration {
	@Bean
	public WebTestObject webTestObject(TestRestTemplate testRestTemplate) {
		System.out.println(testRestTemplate);
		return new WebTestObject();
	}
}
