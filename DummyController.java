package com.nokia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@RequestMapping(value="/hello/{a}",method=RequestMethod.GET)
	 public String getHello(@PathVariable("a") int a)
	 {
		return "Hello!!!!! " + a;
	 }
}	
