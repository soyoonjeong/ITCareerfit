package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.USER;

@SpringBootTest
class Test05ApplicationTests {
	
	@Test
	void contextLoads() {
		USER user1 = new USER();
		user1.setEmail("jena4075@gmail.com");
		user1.setNm("정소윤");
		user1.setPassword("pw");
	}

}
