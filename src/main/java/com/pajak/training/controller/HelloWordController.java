package com.pajak.training.controller;
import com.pajak.training.services.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//rest controlor untuk menandai ini ada class controller
@RestController
//reqyesr maping ini untuk menyingkat alamat di getmapping
@RequestMapping(path = "hello")
public class HelloWordController {



	@Autowired
	private HelloWordService helloWordService;


	@GetMapping
	public String hello() {
		return "hello WOrd";
	}


	@GetMapping(path = "{nama}")
	public String helloKamu(@PathVariable String nama) {
		return helloWordService.heloKamu(nama);
	}



}


// anotasi @ComponetScan digunakan utuk packed yg di luar