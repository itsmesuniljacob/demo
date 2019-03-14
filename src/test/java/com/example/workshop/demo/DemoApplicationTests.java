package com.example.workshop.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//This is sample test
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test()
	{
		DemoApplication.main(new String[]{
				"--spring.main.web-environment=false",
				"--spring.autoconfigure.exclude=configure",
				// Override any other environment properties according to your needs
		});
	}

}
