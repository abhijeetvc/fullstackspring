package com.fullstack.fullstackspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController      //@Controller and @ResponseBody
@SpringBootApplication
public class FullstackspringApplication {

	public static void main(String[] args) {

		SpringApplication.run(FullstackspringApplication.class, args);
	}

	//@ResponseBody
	@GetMapping(value="/check")
	public String getData(){
		return "Hello Spring";
	}

	@GetMapping(value="/add/{no1}/{no2}")
	public Integer addNos(@PathVariable Integer no1,
						  @PathVariable Integer no2){
		Integer c=no1+no2;
		return c;
	}

}
