package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private AtomicInteger counter = new AtomicInteger();
	
	@GetMapping( value="/hello" )
	@ResponseBody
	public String helloWorld() {
		return "Hello world " + counter.incrementAndGet();
	}
}
