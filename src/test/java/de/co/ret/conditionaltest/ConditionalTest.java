package de.co.ret.conditionaltest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConditionalTest {
	@Autowired
	private WebTestObject webTestObject;

	@Test
	public void test() {
		System.out.println(webTestObject);
	}
}
