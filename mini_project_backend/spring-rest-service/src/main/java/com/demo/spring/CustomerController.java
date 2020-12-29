package com.demo.spring;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping(path = "/customer/listall", produces = {MediaType})
	public String display() {
		return "Welcome to spring REST";
	}
}
