package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@AutoConfigureMockMvc
@SpringBootTest
public class HomeControllerTest {
	@InjectMocks
	HomeController controller;
	
	@Autowired
	MockMvc mockMvc;

	@Test
	public void helloTest() throws Exception {
		MvcResult result = mockMvc.perform(get("/hello").accept(MediaType.TEXT_PLAIN))
				.andReturn();
		assertEquals("Hello there", result.getResponse().getContentAsString());
		
	}
}
