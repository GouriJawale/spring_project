package com.construct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.construct.entity.Trainer;

@RestController
public class ContructController {
	
	private Trainer trainer;

	public ContructController(Trainer trainer) {
		super();
		this.trainer = trainer;
	}
	
	@GetMapping("/train")
	public void trainer()
	{
		trainer.myTrainer();
		
		
	}

}
