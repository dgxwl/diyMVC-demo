package com.asd.sdf.controller;

import com.example.demo.annotation.RequestMapping;

public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
