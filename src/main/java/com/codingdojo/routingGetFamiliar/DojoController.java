package com.codingdojo.routingGetFamiliar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController

@SpringBootApplication
public class DojoController {

    @RequestMapping("/{var}")
    public String showDojo(@PathVariable ("var") String var){
    	if(var.equalsIgnoreCase("dojo")) {
    		    	return "The is " + var +" Aawesom!";
    	}else if(var.equalsIgnoreCase("dojo-burbank")) {
    		return "The Burbank location is located in southern California";
    	} else if(var.equalsIgnoreCase("sanjose")) {
        	return "The SJ location is the Headquarters!" ;
    	}
    	return null;
    }
    
    
    
//    @RequestMapping("/{var}")
//    public String showDojoBurbank(@PathVariable ("var") String var){
//    	if(var.equalsIgnoreCase("burbank-dojo")) {
//    		return "The Burbank location is located in southern California";
//    	}
//    			
//    	return null;
//    }
//    @RequestMapping("/{var}")
//    public String showDojoSanJose(@PathVariable ("var") String var){
//    	if(var.equalsIgnoreCase("sanjose")) {
//    	return "The SJ location is the Headquarters!" ;
//    	}
//    	return null;
//    }
	
	
}
