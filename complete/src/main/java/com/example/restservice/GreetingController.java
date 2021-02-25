package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	@GetMapping("/greeting22")
	public Greeting greeting2(@RequestParam(value = "test", defaultValue = "demo2") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}@GetMapping("/greeting3")
	public Greeting greeting3(@RequestParam(value = "test", defaultValue = "third") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
