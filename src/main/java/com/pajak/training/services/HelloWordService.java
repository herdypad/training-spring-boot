package com.pajak.training.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class HelloWordService {
	
	public String hello(@PathVariable String name) {
		return "hello  :"+name;
	}

	public  String heloKamu(@PathVariable String nama){
		return  "hello :" +nama;
	}

}
