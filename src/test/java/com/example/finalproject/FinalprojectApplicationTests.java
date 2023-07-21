package com.example.finalproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.finalproject.Model.Contact;
import com.example.finalproject.Repository.ContactRepository;
import com.example.finalproject.Service.finalservice;

@SpringBootTest
class FinalprojectApplicationTests {

	@Autowired
	finalservice serve;

   @MockBean
   ContactRepository repo;

	@Test
	void contextLoads() {
		// when(repo.findAll()).thenReturn(Stream.of(new Contact(1,"aman","aman@gmail.com",3344223344,"hello")).collect(Collectors.toList()));
		when(repo.findAll()).thenReturn(Stream.of(new Contact(1, "aman", "aman@gmail.com", "3344223344", "hello")).collect(Collectors.toList()));

      assertEquals(1,serve.getting().size());
	}

}
