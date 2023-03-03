package edu.anudip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnudipHomepage {
	
	@GetMapping("/anudip")
	public  String homepage() {
		return "<h1><a href=\"https://www.anudip.org\">Anudip Home Page</a></h1>";
		
	}
}
