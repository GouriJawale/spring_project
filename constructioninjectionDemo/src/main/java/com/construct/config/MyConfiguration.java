package com.construct.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.construct.entity.Subject;
import com.construct.entity.Trainer;



@Configuration
public class MyConfiguration {
	
	@Bean
	public Subject subject ()
	{
       return new Subject ("java" , 100);
  
    }
	
	@Bean
	public Trainer trainer ()
	{
       return new Trainer (subject(), "Monalisa Chakroborty");
  
    }

}
